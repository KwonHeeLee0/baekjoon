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
		for (int i = 0; i < num; i++) {
			int a[] = new int['z' - 'a' + 1];
			String word = r.readLine();
			int len = word.length();
			int index = 0;
			for (int j = 1; j < len; j++) {
				if (word.charAt(j - 1) == word.charAt(j)) {
					a[word.charAt(j - 1) - 'a']++;
				} else if (a[word.charAt(j) - 'a'] == 1) {
					index = 1;
					break;
				}
			}
			if (index == 0) {
				sum++;
			}
		}
		w.write(sum + "");
		w.flush();
	}
}