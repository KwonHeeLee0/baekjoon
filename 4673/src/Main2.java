import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int d[] = new int[10001];
		for (int i = 1; i < 10000; i++) {
			if (fun(i) <= 10000) {
				d[fun(i)] = 1;
			}
		}
		for (int i = 1; i < 10000; i++) {
			if (d[i] != 1) {
				w.write(i + "");
				w.newLine();

			}
		}
		w.flush();
	}

	public static int fun(int num) {
		int sum = num;
		while (num != 0) {
			sum += num % 10;
			num = num / 10;
		}
		return sum;
	}
}
