package b5_5522;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int score = 0;
		for(int i = 0; i < 5; i++) {
			score += s.nextInt();
		}
		System.out.print(score);
	}

}
