package b5_4101;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b;
//		do {
//			
//			a = s.nextInt();
//			b = s.nextInt();
//			if (a == 0 && b == 0) break;
//			System.out.printf(a > b ? "Yes\n" : "No\n");
//
//		} while(a != 0 || b != 0);
		while (true) {
			a = s.nextInt();
			b = s.nextInt();
			if (a == 0 && b == 0) break;
			System.out.printf(a > b ? "Yes\n" : "No\n");
			
		}
	}

}
