package Sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[]{3,5,6,3,7,4,8,9,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(start<end){
			int stard=arr[start];
			int low=start;
			int high=end;
			while(low<high){
				while(low<high&&arr[high]>=stard){
					high--;
				}
				arr[low]=arr[high];
				while(low<high&&arr[low]<=stard){
					low++;
				}
				arr[high]=arr[low];
			}
			arr[low]=stard;
			quickSort(arr,start,low);
			quickSort(arr,low+1,end);
		}
	       	
	}
		
  
}
