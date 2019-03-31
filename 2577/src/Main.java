import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(r.readLine());
		int b = Integer.parseInt(r.readLine());
		int c = Integer.parseInt(r.readLine());
		int num = a * b * c;
		int array[] = new int[10];
		while(num!=0) {
			array[num%10]++;
			num/=10;
		}
		for(int i=0;i<10;i++) {
			w.write(array[i]+"");
			w.newLine();
		}
		w.flush();

	}
}
