import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
public static void main(String[] args)throws IOException {
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	String a=r.readLine();
	String array[]=a.split(" ");
	int v1=Integer.parseInt(array[0]);
	int v2=Integer.parseInt(array[1]);
	int v3=Integer.parseInt(array[2]);
	int q1=v1-v2;
	int q2=v2-v3;
	if(q1*q2>0) {
		w.write(v2+"");
	}
	else if(Math.abs(q1)>Math.abs(q2)) {
		w.write(v3+"");
	}
	else {
		w.write(v1+"");
	}
	w.flush();
}
}
