package b5_15964;
import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		BigInteger a = s.nextBigInteger(), b = s.nextBigInteger();
		BigInteger m = a.add(b);
		BigInteger n = a.subtract(b);
		System.out.print(m.multiply(n));
	}

}
