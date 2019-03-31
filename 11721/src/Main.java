import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
public static void main(String[] args)throws IOException {
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	String s=r.readLine();
	int a=s.length();
	for(int i=0;i<a;i++) {
		w.write(s.charAt(i));
		if(i%10==9) {
			w.newLine();
		}
		w.flush();
	}
	
}
}
