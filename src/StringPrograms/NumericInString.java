package StringPrograms;

public class NumericInString {
	public static void main(String[] args) {
		String nameString="12223#$%@wellw";
		int digit=0;
		int ch=0;
		int sp=0;
		for (int i = 0; i < nameString.length(); i++) {
			if (nameString.charAt(i)>=48 && nameString.charAt(i)<=57) {
				digit++;
			
			}
			else if (nameString.charAt(i)>=65 && nameString.charAt(i)<=122) {
				ch++;
			}
			
			else {
				sp++;
			}
		}
		
		System.out.println("Digit "+digit);
		System.out.println("ch "+ch);
		System.out.println("sp "+sp);
	}
	
}

