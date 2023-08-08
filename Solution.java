import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int x = fs.nextInt(), y = fs.nextInt(), z = fs.nextInt();
			if (x * y % z == 0) {
				System.out.println((x * y) + " " + z);
			} else if ((y * z) % x == 0) {
				System.out.println((y * z) + " " + x);
			} else if ((x * z) % y == 0) {
				System.out.println((x * z) + " " + y);
			} else {
				System.out.println(-1);
			}
		}
		fs.close();
	}
}
