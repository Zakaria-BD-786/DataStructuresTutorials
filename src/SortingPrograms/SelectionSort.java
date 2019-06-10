package SortingPrograms;

public class SelectionSort {
	public static void main(String args []) {

		int item;
		int arr[] = new int[] {10,1,20,15,40,0};

		for(int i=0;i<5;i++) {
			for(int j=i+1;j<6;j++) {
				if(arr[i]>arr[j]) {
					item = arr[i];
					arr[i] = arr[j];
					arr[j] = item;
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
