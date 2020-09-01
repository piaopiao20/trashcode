package cn.trashcode.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * TODO Collections sample , how to use method in Collections
 * @author Trashcode.io
 * @version 
 * @since JDK 1.7
 */

public class CollectionsSample {

	public void collectionSort() {
		List<String> c = new ArrayList<String>();
		c.add("l");
		c.add("o");
		c.add("v");
		c.add("e");
		System.out.println(c);
		Collections.sort(c);
		System.out.println(c);
	}

	public void collectionReverse() {
		List<String> list = Arrays.asList("one two three four five six siven".split(" "));
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
	public void collectionShuffle()
	{
		List<String> c = new ArrayList<String>();
		c.add("l");
		c.add("o");
		c.add("v");
		c.add("e");
		System.out.println(c);
		Collections.shuffle(c);
		System.out.println(c);
		Collections.shuffle(c);
		System.out.println(c);
	}

	public void collectionFill() {
		List<String> m = Arrays.asList("one two three four five six seven".split(" "));
		System.out.println(m);
		Collections.fill(m, "9999");
		System.out.println(m);
	}

	public void collectionCopy() {
		List<String> m = Arrays.asList("one two three four five six siven".split(" "));
		System.out.println(m);
		List<String> n = Arrays.asList("Copyed".split(" "));
		System.out.println(n);
		Collections.copy(m, n);
		System.out.println(m);
	}

	public void collectionIndexOfSub() {
		ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 6, 7, 3));
		ArrayList<Integer> targetList = new ArrayList<>(Arrays.asList(6));
		System.out.println(Collections.indexOfSubList(intList, targetList));
	}

	public void collectionLastIndexSub() {
		ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 6, 7, 3));
		ArrayList<Integer> targetList = new ArrayList<>(Arrays.asList(6));
		System.out.println(Collections.lastIndexOfSubList(intList, targetList));
	}

	public void collectionRotate() {
		ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(intList);
		Collections.rotate(intList, 1);
		System.out.println(intList);
	}

	public void collectionSwap() {
		List<String> m = Arrays.asList("one two three four five six seven".split(" "));
		System.out.println(m);
		Collections.swap(m, 2, 3);
		System.out.println(m);
	}

	public void collectionBinary() {
		List<String> c = new ArrayList<String>();
		c.add("l");
		c.add("o");
		c.add("v");
		c.add("e");
		System.out.println(c);
		int m = Collections.binarySearch(c, "o");
		System.out.println(m);
	}

	public void collectionReplaceAll() {
		List <String>list = Arrays.asList("one two three four five six seven".split(" "));
		System.out.println(list);
		System.out.println(Collections.replaceAll(list, "seven", "seven eight"));
		System.out.println(list);
	}
}
