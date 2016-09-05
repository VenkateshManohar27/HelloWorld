package com.vm;

import java.util.Scanner;

public class LinearSearch {
	// This function returns index of element x in arr[]
    static int search(int arr[], int n, int x)
    {
        for (int i = 0; i < n; i++)
        {
            // Return the index of the element if the element
            // is found
            if (arr[i] == x)
                return i;
        }
 
        // return -1 if the element is not found
        return -1;
    }
 
    public static void main (String[] args)
    {
        // Note that size of arr[] is considered 100 according to
        // the constraints mentioned in problem statement.
        int[] arr = new int[100];
 
        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        // One by one run for all input test cases
        while (t > 0)
        {
            // Input the size of the array
            int n = sc.nextInt();
 
            // Input the array
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
 
            // Input the element to be searched
            int x = sc.nextInt();
 
            // Compute and print result
            System.out.println(search(arr, n, x));
 
            t--;
        }
    }
}
