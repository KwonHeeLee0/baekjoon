import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
public static void main(String[] args)throws IOException {
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	int a=Integer.parseInt(r.readLine());
			if(a>=90) {
				w.write("A");
			}
			else if(a>=80) {
				w.write("B");
			}
			else if(a>=70) {
				w.write("C");
			}
			else if(a>=60) {
				w.write("D");
			}
			else {
				w.write("F");
			}
			w.flush();
			w.close();
}
}
