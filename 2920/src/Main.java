import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		String array[] = r.readLine().split(" ");
		int array_num[] = new int[8];
		int cnt = 0;
		for (int i = 0; i < 8; i++) {
			array_num[i] = Integer.parseInt(array[i]);
		}
		for (int i = 1; i < 8; i++) {
			if (array_num[i - 1] == array_num[i] - 1) {
				cnt += 1;
			} else if (array_num[i - 1] == array_num[i] + 1) {
				cnt += 2;
			}
			else {
				break;
			}

		}
		if (cnt == 7) {
			w.write("ascending");
		} else if (cnt == 14) {
			w.write("descending");
		} else {
			w.write("mixed");
		}
		w.flush();

	}
}