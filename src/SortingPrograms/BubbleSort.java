package SortingPrograms;

public class BubbleSort {

	public static void main(String args []) {

		int item;
		int arr[] = new int[] {10,1,20,15,40,0};

		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(arr[j]>arr[j+1]) {
					item = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = item;


				}
			}
			for(int k:arr) {
				System.out.print(k+" ");
				
			}
			System.out.println();
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
