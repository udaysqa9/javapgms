package basics;

public class RevStr {

	public static void main(String[] args) {

		String s = "hi uday";
		String n= "";
		for(int i=s.length()-1;i>0;i--) {
			s+=s.charAt(i);
		}
		System.out.println(n);

	}
}
