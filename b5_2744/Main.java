package b5_2744;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		String str = s.next();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 'a' && c <= 'z')
				System.out.printf("%c", c - 32);
			else if(c >= 'A' && c <= 'Z')
				System.out.printf("%c", c + 32);
		}
	}

}
