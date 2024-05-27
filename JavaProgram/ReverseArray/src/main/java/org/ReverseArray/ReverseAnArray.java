package org.ReverseArray;

public class ReverseAnArray {
	public static void main(String[] args)
	{
		int[] originalArr = {1,2,3,4};
		
		System.out.println("Original Array is : ");
		
		printArray(originalArr);
        
        reverseArray(originalArr);
        
        System.out.println("\nReversed array:");
        printArray(originalArr);
		
	}
	
    public static void reverseArray(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start < end)
        { 
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    
    public static void printArray(int[] arr) 
    {
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
	

}
