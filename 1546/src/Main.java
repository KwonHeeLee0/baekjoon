import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(reader.readLine());
		String array[] = reader.readLine().split(" ");

		double avg = 0;
		double max = 0;
		int intarray[] = new int[a];
		for (int i = 0; i < a; i++) {
			intarray[i] = Integer.parseInt(array[i]);

		}
		for (int i = 0; i < a; i++) {
			if (intarray[i] > max) {
				max = intarray[i];
			}
		}
		for (int i = 0; i < a; i++) {
			avg = (intarray[i] / max * 100) + avg;
		}
		System.out.printf("%.4f\n",avg/a );
		writer.write(avg / a + "");
		writer.flush();
		//writer.close();
		//System.out.printf("%4f",avg );
	}
}
