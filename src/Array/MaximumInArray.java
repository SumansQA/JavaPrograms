package Array;

public class MaximumInArray {
	public static void main(String[] args) {
		int [] a= {43,5,677,7,8,98};
		
		int max=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);		
	}
}