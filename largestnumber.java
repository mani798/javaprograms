package mani;

public class largestnumber {
	public static void main(String[] args ) {
		int arr[]= {5,17,28,95,40,56};
		int max=arr[0];
		int i=0;
		while(i<arr.length) {
			if(arr[i]>max)
				max=arr[i];
			i++;
		}
		System.out.println(max);
	}

}
