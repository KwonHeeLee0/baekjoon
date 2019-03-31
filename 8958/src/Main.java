import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int test_num = Integer.parseInt(r.readLine());
		for (int i = 0; i < test_num; i++) {
			int sum = 0;
			int point = 0;
			String line = r.readLine();
			int array[] = new int[line.length()];
			for (int ii = 0; ii < line.length(); ii++) {
				if (line.charAt(ii) == 'O') {
					point++;
					array[ii] = point;
				} else {
					point = 0;
					array[ii] = 0;
				}

			}
			for (int ii = 0; ii < line.length(); ii++) {
				sum = sum + array[ii];
			}
			w.write(sum + "");
			w.newLine();
		}
		w.flush();

	}
}
