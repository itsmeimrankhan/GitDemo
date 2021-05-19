package javaprogrms.interview;

import java.util.*;

public class OddEvenAscendingOrderArray 
{
	static void twoWaySort(Integer arr[], int n) 
    { 
        int l=0,r=n-1; 
        int k=0; 
       
        while (l<r) 
        {  
            while (arr[l]%2 != 0) 
            { 
                l++; 
                k++; 
            } 
       
            while (arr[r]%2 == 0  && l<r) 
            	
                r--; 
       
            if (l < r) 
            { 
                int temp = arr[l]; 
                arr[l] = arr[r]; 
                arr[r] = temp;     
            } 
        } 
        Arrays.sort(arr, 0, k,Collections.reverseOrder()); 
        Arrays.sort(arr, k, n); 
    } 
 public static void main(String args[]) 
    { 
        Integer arr[] = {13,87,69,1,6,4,8,2,0}; 
          
        twoWaySort(arr, arr.length); 
          
        System.out.println(Arrays.toString(arr)); 
    } 
}