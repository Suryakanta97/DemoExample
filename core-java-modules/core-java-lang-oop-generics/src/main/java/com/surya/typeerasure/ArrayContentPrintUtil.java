package com.surya.typeerasure;

public class ArrayContentPrintUtil {

   public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.printf("%s ", element);
        }
    }
    
    public static <E extends Comparable<E>> void printArray(E[] array) {
        for (E element : array) {
            System.out.printf("%s ", element);
        }
    }
}
