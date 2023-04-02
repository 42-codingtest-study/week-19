package b5_1271;
import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		BigInteger n = s.nextBigInteger(), m = s.nextBigInteger();
		BigInteger mok = n.divide(m);
		BigInteger namuji = n.subtract(mok.multiply(m));
		
		System.out.println(mok);
		System.out.println(namuji);

	}

}
