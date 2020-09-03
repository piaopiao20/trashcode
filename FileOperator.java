public class FileOperator {
    private static final Logger LOGGER = LoggerFactory.getLogger(FileOperator.class);

    private static final FileOperator INSTANCE = new FileOperator();

    private FileOperator() {

    }

    public static FileOperator getInstance() {
        return INSTANCE;
    }

    public boolean isPathExist(String path) {
        File file = new File(path);
        return file.exists();
    }

    //Check folder , create new one if it is not exist
    public void makeFolder(String folderPath) {
        File file = new File(folderPath);
        if (!file.exists())
            file.mkdir();
    }
    /**
     * move file to folder 
     * @param filename
     * @param oldFolder source folder
     * @param newFolder target folder
     */
    public void copeFileToFolder(String filename, String oldFolder, String newFolder) {
        String sourceFilePath = oldFolder +File.separator+ filename;
        File sourceFile = new File(sourceFilePath);
        if (!sourceFile.exists()) {
            LOGGER.warn("File source is null, copy failed");
            return;
        }
        makeFolder(newFolder);
        try {
            int byteread = 0;
            InputStream inStream = new FileInputStream(sourceFilePath);
            String newFilePath=newFolder + File.separator+filename;
            File newFilePathFile=new File(newFilePath);
            if(newFilePathFile.exists())
                newFilePathFile.delete();
            FileOutputStream fs = new FileOutputStream(newFilePathFile);
            byte[] buffer = new byte[1444];
            while ((byteread = inStream.read(buffer)) != -1) {
                fs.write(buffer, 0, byteread);
            }
            inStream.close();
        } catch (Exception e) {
            LOGGER.error("", e);
        }
    }

    public void copeFileToFolder(String filename, InputStream sourceIn, String newFolder) {

        if (sourceIn == null) {
            LOGGER.warn("File source is null, copy failed");
            return;
        }
        makeFolder(newFolder);
        try {
            int byteread = 0;
            FileOutputStream fs = new FileOutputStream(newFolder + filename);
            byte[] buffer = new byte[1444];
            while ((byteread = sourceIn.read(buffer)) != -1) {
                fs.write(buffer, 0, byteread);
            }
            // sourceIn.close();
        } catch (Exception e) {
            LOGGER.error("", e);
        }
    }
}