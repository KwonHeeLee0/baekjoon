import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = r.readLine();
		line = line.toLowerCase();
		int len = line.length();
		int[] a = new int['z' - 'a' + 1];
		for (int i = 0; i < len; i++) {
			a[line.charAt(i) - 'a']++;
		}
		int max = a[0];
		int index = 0;
		int c = 0;
		for (int i = 1; i < 'z' - 'a'+1; i++) {
			if (a[i] > max) {
				max = a[i];
				index = 0;
				c = i;
			} else if (a[i] == max) {
				index = 1;
			}
		}
		if (index == 1) {
			w.write("?");
		} else {
			w.write('A' + c);
		}
		w.flush();
	}
}
