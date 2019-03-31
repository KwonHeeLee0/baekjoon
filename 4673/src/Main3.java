import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main3 {
	public static void main(String[] args) throws IOException {
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int b[] = new int[10001];
		for (int i = 1; i <= 10000; i++) {
			if (fun(i) <= 10000) {
				b[fun(i)] = 1;
			}

		}
		for (int i = 1; i <= 10000; i++) {
			if (b[i] != 1) {
				w.write(i + "");
				w.newLine();
			}
		}
		w.flush();

	}

	public static int fun(int a) {
		int sum = a;
		while (a != 0) {
			sum = sum + a % 10;
			a /= 10;
		}
		return sum;

	}
}
