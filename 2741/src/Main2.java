import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(r.readLine());
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int n = 1; n <= a; n++) {
			w.write(n + "");
			w.newLine();
			w.flush();

		}
	}
}
