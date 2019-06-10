package SortingPrograms;

public class InsertionSort {
	public static void main(String args []) {

		int item;
		int arr[] = new int[] {7,2,0,4,1,3,8};
		for(int k:arr) {
			System.out.print(k+" ");
		}
		System.out.println();
		for(int i=1;i<6;i++) {
			item = arr[i];
			int hole =i;
			while(hole>0 && item<arr[hole-1]) {
				arr[hole] = arr[hole-1];
				hole--;
			}
			arr[hole]=item;
			for(int k:arr) {
				System.out.print(k+" ");

			}
			System.out.println();
		}
		for(int k:arr) {
			System.out.print(k+" ");

		}
	}
}
