import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = r.readLine().replaceAll("( +) ", " ").trim();
		String array[] = line.split(" ");
		int num = array.length;
		if (line.isEmpty()) {
			w.write("0");
		} else {
			w.write(num + "");
		}

		w.flush();
		w.close();
	}
}
