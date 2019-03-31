import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(r.readLine());
		int sum = 0;
		if (num < 100) {
			sum = num;
		} else {
			sum = 99;
			for (int i = 100; i <= num; i++) {
				if (func(i) == 0) {
					sum++;
				}
			}
		}
		w.write(sum + "");
		w.flush();
	}

	public static int func(int num) {
		int a;
		int b;
		int val=0;
		int index = 0;
		a = num % 10;
		num /= 10;
		b = num % 10;
		val = b - a;
		while (num != 0) {
			a = num % 10;
			num /= 10;
			b = num % 10;
			if (val != b - a) {
				index = 1;
				break;
			}
			num/=10;
		}
		return index;
	}
}