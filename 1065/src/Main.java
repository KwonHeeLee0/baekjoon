import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(r.readLine());
		int sum = 0;
		if (num < 100) {
			sum = num;
		} else {
			sum = 99;
			for (int i = 100; i <= num; i++) {
				if (fun(i) == 0) {
					sum = sum + 1;
				}

			}

		}

		w.write(sum + "");
		w.flush();
	}

	public static int fun(int a) {

		int b;
		int c;
		int val = 0;
		int index = 0;

		b = a % 10;
		a /= 10;
		c = a % 10;
		val = c - b;
		while (a != 0) {
			b = a % 10;
			a /= 10;
			c = a % 10;

			if (val != c - b) {
				index = 1;
				break;
			}
			a /= 10;

		}

		return index;
	}

}
