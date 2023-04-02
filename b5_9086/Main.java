package b5_9086;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		for(int i = 0; i < N; i++) {
			String str = s.next();			

			System.out.printf("%c%c\n", str.charAt(0), str.charAt(str.length()-1));
		}
	}

}
