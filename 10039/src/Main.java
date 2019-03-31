import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int array[] = new int[5];
		for (int i = 0; i < 5; i++) {
			array[i] = Integer.parseInt(r.readLine());
			if (array[i] < 40) {
				array[i] = 40;
			}
		}
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + array[i];
		}
		w.write(sum / 5 + "");
		w.flush();

	}
}
