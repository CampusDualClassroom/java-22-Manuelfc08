package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("GKFFD");
        arrayList.add("TNANA");
        arrayList.add("MPMSL");
        arrayList.add("PSWME");
        arrayList.add("LZMLF");
        arrayList.add("JYEBV");
        arrayList.add("YELNT");
        arrayList.add("JSNKR");
        arrayList.add("JFESF");
        arrayList.add("TMJLL");
        return arrayList;
    }

    public static void printElementsAndIndex(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + ": " + list.get(i));
        }
    }

    public static boolean addElementToList(List<String> list, String newElement) {
        return list.add(newElement);
    }

    public static void main(String[] args) {
        List<String> arrayList = createArrayList();
        boolean isAdded = addElementToList(arrayList, "AAAAA");
        System.out.println("Elemento añadido: " + isAdded);
        printElementsAndIndex(arrayList);
    }


}
