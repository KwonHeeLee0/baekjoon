import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int test = Integer.parseInt(r.readLine());
		int[] array = new int[3];
		String[] starray = new String[3];
		for (int i = 0; i < test; i++) {
			int a;
			int b;
			starray = r.readLine().split(" ");
			for (int j = 0; j < 3; j++) {
				array[j] = Integer.parseInt(starray[j]);
			}
			a = array[2] % array[0];
			if (a == 0) {
				a = array[0];
			}
			if(array[2]%array[0]!=0) {
			b = array[2] / array[0] + 1;
			}
			else {
				b = array[2] / array[0];
			}
			if (b < 10) {
				w.write(a + "0" + b);
			} else {
				w.write(a + "" + b);
			}
			w.newLine();

		}
		w.flush();
	}
}
