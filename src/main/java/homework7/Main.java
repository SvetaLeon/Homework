package homework7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Method countOccurrence");
        List<String> wordList = new ArrayList<>();
        wordList.add("Cat");
        wordList.add("Dog");
        wordList.add("Wolf");
        wordList.add("Wolf");
        wordList.add("Horse");
        wordList.add("Fox");
        wordList.add("Pig");
        wordList.add("Cow");
        wordList.add("Dog");
        wordList.add("Horse");
        wordList.add("Sheep");
        wordList.add("Fox");
        wordList.add("Wolf");
        wordList.add("Dog");
        countOccurrence(wordList, "Wolf");
        System.out.println();

        System.out.println("Method toList");
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array " + Arrays.toString(array));
        toList(array);
        System.out.println();

        System.out.println("Method findUnique");
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 5, 1, 3, 9, 4, 7, 8, 3, 2, 0, 7, 6, 2));
        System.out.println("Numeric list " + integerList);
        findUnique(integerList);
        System.out.println();

        System.out.println("Method calcOccurrence");
        System.out.println("List of words " + wordList);
        calcOccurrence(wordList);
    }

    public static void countOccurrence(List<String> list, String word) {
        int counter = 0;
        for (String arrayWord : list) {
            if (arrayWord.equals(word)) {
                counter += 1;
            }
        }
        System.out.println("The specified word occurs " + counter + " times");
    }

    public static void toList(int[] array) {
        List<Integer> arrayList = new ArrayList<>();
        for (Integer i : array) {
            arrayList.add(i);
        }
        System.out.println("List " + arrayList);
    }

    public static void findUnique(List<Integer> list) {
        List<Integer> integerList = new ArrayList<>();
        List<Integer> uniqueNumberList = new ArrayList<>();
        for (int i : list) {
            if ((uniqueNumberList.indexOf(0) == uniqueNumberList.indexOf(i))) {
                uniqueNumberList.add(i);
            } else {
                integerList.add(i);
            }
        }
        Collections.sort(uniqueNumberList);
        uniqueNumberList.removeAll(integerList);
        System.out.println("New list containing only unique numbers " + uniqueNumberList);
    }

    public static void calcOccurrence(List<String> list) {
        int counter1 = 1;
        int counter2 = 2;
        int counter3 = 3;
        List<String> array1 = new ArrayList<>();
        List<String> array2 = new ArrayList<>();
        for (String s : list) {
            if ((array1.indexOf(0) == array1.indexOf(s))) {
                array1.add(s);
            } else {
                array2.add(s);
            }
        }
        array1.removeAll(array2);
        for (int i = 0; i < array1.size(); i++) {
            System.out.println(array1.get(i) + ": " + counter1);
        }

        List<String> array3 = new ArrayList<>();
        for (String s : array2) {
            if ((array3.indexOf(0) == array3.indexOf(s))) {
                array3.add(s);
            } else {
                array3.remove(s);
            }
        }
        for (int i = 0; i < array3.size(); i++) {
            System.out.println(array3.get(i) + ": " + counter2);
        }

        array2.removeAll(array3);
        for (int i = 0; i < array2.size(); i++) {
            if (i == (i % 2)) {
                continue;
            }
            System.out.println(array2.get(i) + ": " + counter3);
        }
    }
}


