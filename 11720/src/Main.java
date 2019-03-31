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
	String c=r.readLine();
	int t=0;
	for(int b=0;b<a;b++) {

		int c2=c.charAt(b)-'0';	
		t=t+c2;

	}
	w.write(t+"");
	w.flush();

}
}
