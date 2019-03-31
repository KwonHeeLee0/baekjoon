import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(r.readLine());
		for (int b = 0; b < a; b++) {
			for (int c = 0; c <= b; c++) {
				w.write("*");
			}
			w.newLine();
			w.flush();
		}
	}
}
