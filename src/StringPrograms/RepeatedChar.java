package StringPrograms;

public class RepeatedChar {
	
	
	public static void main(String[] args) {
		String nameString="geeks for geeks";
		int count;
		String news="";
		char[] ch = nameString.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			count=1;
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					count++;
					ch[j]=' ';
				}
			}
			
			if (count==1 && ch[i]!=' ') {
				news+=ch[i];
				
			}
		}
		System.out.println(news);	
	}
		
		

}
