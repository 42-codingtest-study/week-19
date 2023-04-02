package b5_2420;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		long N = s.nextLong(), M = s.nextLong();
		System.out.print(M - N > 0 ? M - N : N - M);
	}

}
