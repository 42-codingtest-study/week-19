package b5_2754;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		String score = s.next();
		double val = 0;
		if (score.charAt(0) == 'F') {
			System.out.print("0.0");
			return ;
		}
		switch(score.charAt(0)) {
		case 'A' : val = 4.0; break;
		case 'B' : val = 3.0; break;
		case 'C' : val = 2.0; break;
		case 'D' : val = 1.0; break;
		
		}
		switch(score.charAt(1)) {
		case '+' : val += 0.3; break;
		case '-' : val -= 0.3; break;
		case '0' : break;
		
		}
		System.out.print(val);
		
		
	}

}
