import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		int scale = num / 5;
		int rest = num % 5;
		for (int r = scale; r > -1; r--) {
			int rest2 = num - r * 5;
			if (rest == 0) {
				System.out.println(scale);
				break;
			}

			else if (rest2 % 3 == 0) {
				int scale2 = rest2 / 3;
				System.out.println(r + scale2);
				break;
			} else if (r == 0) {
				System.out.println(-1);
			}

		}
	}
}
