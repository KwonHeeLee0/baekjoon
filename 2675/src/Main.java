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
		for (int i = 0; i < num; i++) {
			String line = r.readLine();
			String a[] = line.split(" ");
			int len = a[1].length();
			int b = Integer.parseInt(a[0]);
			for (int k = 0; k < len; k++) {
				for (int j = 0; j < b; j++) {
					w.write(a[1].charAt(k));
					w.flush();

				}
			}
			w.newLine();
		}
	}
}
