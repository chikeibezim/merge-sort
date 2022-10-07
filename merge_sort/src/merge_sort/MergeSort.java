package merge_sort;

import java.util.*;

class MergeSort {
    
    public static void merge(int[] arr, int left, int mid, int right){
        
        //get the length of subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        //initialize temporary arrays to store values for comparison
        int[] left_arr = new int[n1];
        int[] right_arr = new int[n2];
        
        //assign corresponding values to the subarrays for merge
        for(int i = 0; i < n1; i++)
            left_arr[i] = arr[left + i];
        for(int j = 0; j < n2; j++)
             right_arr[j] = arr[mid + 1 + j];
        
        //initialize the indexes for the 2 subarrays respectively
        int i = 0, j = 0;
        
        //initialize the start point for the loop which is the left
        int k = left;
        
        //compare and merge values in the subarrays
        while(i < n1 && j < n2){
            if(left_arr[i] <= right_arr[j]){
                arr[k] = left_arr[i];
                i++;
            }else{
                arr[k] = right_arr[j];
                j++;
            }
            k++;
        }
        
        //copy the rest of left subarray if no comparison is left
        while(i < n1){
            arr[k] = left_arr[i];
            i++;
            k++;
        }
        
        //copy the rest of right subarray if no comparison is left
        while(j < n2){
            arr[k] = right_arr[j];
            j++;
            k++;
        }
    }
    
    public static void sort(int[] a, int left, int right){
        //System.out.println(right);
        
        if(left < right){
            
            //find midpoint
            int mid =  left + (right - left) / 2;
            
            //recursively sort till left >= right
            sort(a, left, mid);
            sort(a, mid + 1, right);
            
            System.out.println("Sorting done");
            
            //merge
            merge(a, left, mid, right);
            
        }
    }
    
    public static void main(String[] args) {
        int[] sort_array = { 4,2,39, 6, 89, 10, 64, 11, 25}; 
        
        sort(sort_array, 0, sort_array.length - 1);
        
        System.out.println("Sorted Array: " + Arrays.toString(sort_array));
    }
}