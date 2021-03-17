package StringPrograms;

public class RemoveRepeated {
	
	public static void main(String[] args) {
		String string="geeks for geeks";
		char[] ch = string.toCharArray();
		char[] ch1=new char[ch.length];
		
		
		ch1[0]=ch[0];
		
		for (int i = 1; i < string.length(); i++) {
			int count=0;
			for (int j = 0; j < i; j++) {
				if (ch[i]==ch[j]) {
					count++;
				}
			}
			if (count==0) {
				ch1[i]=ch[i];
			}
		}
		
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i]=='\u0000') {
				ch1[i]=' ';
			}
		}
		
		String nsString=new String(ch1);
		System.out.println(nsString.replaceAll(" ", ""));		
	}

}
