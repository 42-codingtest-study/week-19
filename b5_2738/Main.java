package b5_2738;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int N = s.nextInt(), M = s.nextInt();
		int[][] matrix = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				matrix[i][j] = s.nextInt();
			}
		}
		for(int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				matrix[i][j] += s.nextInt();
			}
		}
		for(int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.printf("%d ", matrix[i][j]);
			}
			System.out.print('\n');
		}
		
		
	}

}
