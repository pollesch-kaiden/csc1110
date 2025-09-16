/*
 * Course: CSC-1110 171
 * Fall 2023
 * Exercise 8 - Arrays and ArrayLists
 * Name: Kaiden Pollesch
 * Last Updated: 10/24/23
 */

package polleschk;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * ArrayList/array exercises
 */
public class Exercise8 {
    private static int[] arr = {4, 8, 1, 3, 5, 6, 3, 6, 2, 6, 7};
    private static final ArrayList<Integer> LIST = new ArrayList<>();
    public static void main(String[] args) {
        fillList();

        System.out.println("ARR: " + get(4));
        System.out.println("LIST: " + LIST.get(4));

        System.out.println("ARR: " + lastIndexOf(6));
        System.out.println("LIST: " + LIST.lastIndexOf(6));

        System.out.println("Removed from arr: " + remove(2));
        System.out.println("ARR: " + Arrays.toString(arr));
        System.out.println("Removed from List: " + LIST.remove(2));
        System.out.println("LIST: " + LIST);

        add(0, 9);
        System.out.println("ARR: " + Arrays.toString(arr));
        LIST.add(0, 9);
        System.out.println("LIST: " + LIST);
    }

    private static void fillList() {
        for(int i : arr) {
            LIST.add(i);
        }
    }

    private static int get(int index) {
        return arr[index];
    }

    private static int lastIndexOf(int element) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                index = i;
            }
        }
        return index;
    }

    private static int remove(int index) {
        int[] oldArr = arr;
        int newArrLength = arr.length-1;
        arr = new int[newArrLength];
        for (int i = 0; i < newArrLength; i++) {
            if (i < index){
                arr[i] = oldArr[i];
            } else {
                arr[i] = oldArr[i+1];
            }
        }
        return index;
    }

    private static void add(int index, int element) {
        int[] oldArr = arr;
        int newArrLength = arr.length + 1;
        arr = new int[newArrLength];
        for (int i = 0; i < newArrLength; i++) {
            if (i < index){
                arr[i] = oldArr[i];
            } else if (i == index){
                arr[i] = element;
            } else {
                arr[i] = oldArr[i-1];
            }
        }
    }
}
