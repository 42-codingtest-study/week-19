package b5_5597;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		ArrayList<Integer> submit = new ArrayList<Integer>();
		for (int i = 0; i < 28; i++)
		{
			submit.add(s.nextInt());
		}
		for (int j = 0; j < 30; j++) {
			if(submit.contains(j) == false)
				submit.add(j);
			else
				continue;
		}
		System.out.println(submit.get(28) > submit.get(29) ? submit.get(29) : submit.get(28));
		System.out.println(submit.get(28) > submit.get(29) ? submit.get(28) : submit.get(29));
	}

}
