import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
public static void main(String[] args)throws IOException {
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	String num[]=new String[2];
	int a,b;
	num=r.readLine().split(" ");
	a=Integer.parseInt(num[0]);
	b=Integer.parseInt(num[1]);
	String[] line=new String[a];
	line=r.readLine().split(" ");
	int line_num[]=new int[a];
	for(int i=0;i<a;i++) {
		line_num[i]=Integer.parseInt(line[i]);
	}
	for(int i=0;i<a;i++) {
		if(line_num[i]<b) {
			w.write(line_num[i]+"");
		}
	}
	w.flush();
}
}
