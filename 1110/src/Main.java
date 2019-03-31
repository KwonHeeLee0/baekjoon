import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = 0;
		int num = Integer.parseInt(r.readLine());
		int tmp = num;
		do {
			int a = num / 10;
			int b = num % 10;
			int c = a + b;
			num = b * 10 + c % 10;
			cnt++;
		} while (tmp != num);
		w.write(cnt + "");
		w.flush();
	}

}