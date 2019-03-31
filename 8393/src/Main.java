import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
public static void main(String[] args) throws IOException {
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	int a=Integer.parseInt(r.readLine());
	int c=0;
	for(int b=1;b<=a;b++) {
		c=c+b;
	}
	w.write(c+"");
	w.flush();
	w.close();
}
}
