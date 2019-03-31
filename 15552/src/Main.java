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
		int result;
		int a, b = 0;
		for (int i = 0; i < num; i++) {
			String st = r.readLine();
			String array[] = st.split(" ");
			a = Integer.parseInt(array[0]);
			b = Integer.parseInt(array[1]);
			result = a + b;
			w.write(result + "");
			w.newLine();
			;
		}
		w.flush();
	}

}
