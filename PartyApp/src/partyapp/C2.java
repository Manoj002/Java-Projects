package partyapp;

import java.util.Arrays;

public class C2 {

    public static void main(String[] args) {
        int [] arr = {2,2,21,33,33};
        int length = arr.length;
        Arrays.sort(arr);
        length = removeDuplicate(arr, length);
        for(int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int removeDuplicate(int[] arr, int length) {
        int j = 0;
        int [] temp = new int[length];
        for(int i = 0; i < length-1; i++) {
            if(arr[i] != arr[i+1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[length-1];
        for(int i = 0; i <  length; i++ ) {
            arr[i] = temp[i];
        }
        return j;
    }
}
