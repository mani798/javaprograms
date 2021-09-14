package mani;

public class sumofNnumbers {
	public static void main(String[] args ) {
		int arr[]= {1,3,6,8,9,10};
		int i,sum=0;
		for(i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum of n numbers is=" +sum);
	}

}
