package Practice01;

public class Rough4 {
	public static void main(String[] args) {	
		
		String s ="applpea";
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			char eachchr = s.charAt(i);
			int  index =s.indexOf(eachchr, i+1);
			if(index ==-1) {
				sb.append(eachchr);
			}
		}
		System.out.println(sb);

		
			
	}
}