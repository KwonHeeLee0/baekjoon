import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(r.readLine());
		int a = 0;
		int b;
		int c;
		int index = 1;
		while (a < num) {
			a += index;
			index++;
		}
		b = a - num + 1;
		c = index - b;

		if (index % 2 == 1) {
			w.write(c + "/" + b);

		} else {
			w.write(b + "/" + c);

		}
		w.flush();
	}
}
