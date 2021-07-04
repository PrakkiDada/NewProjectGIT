package com.prakash;

import java.util.*;

public class ArrayListReverse {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        moveZerosToEnd(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Method to find move all zeros to the end of the array
    static void moveZerosToEnd(int[] arr) {
        // Write your code here
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 0)
                moveArray(arr, i);
        }
    }
    static void moveArray(int arr[], int i){

        for( ; i < arr.length - 1 ; i ++)
        {
            arr[i] = arr[i+1];
        }
        arr[i] = 0;
    }
}
