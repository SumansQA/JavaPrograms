
public class PrimeNumber {

	public static void main(String[] args) {

		//		int a=9;
		//		boolean isPrime=false;
		//		if (a<=1) {
		//			System.out.println("not prime number");
		//		}
		//		
		//		for (int i = 2; i < a; i++) {
		//			if (a%i==0) {
		//				isPrime=false;
		//				break;
		//			}
		//			else {
		//				isPrime=true;
		//			}
		//		}
		//		
		//		if (isPrime) {
		//			System.out.println("Prime number");
		//		}
		//		
		//		else {
		//			System.out.println("not prime ");
		//		}


		int [] a= {1,2,3,4,5,6};

		for (int i = 0; i < a.length; i++) {
			int b=a[i];
			boolean isPrime=false;
			if (b<=1) {
				isPrime=false;
			}
			for (int j = 2; j < b; j++) {
				if (b%i!=0) {
					isPrime=true;
				}
				else {
					isPrime=false;
					break;
				}
			}
			if (isPrime==true) {
				System.out.println(b+"  prime");
			}
			else {
				System.out.println(b+"not prime");
			}

		}
	}

}
