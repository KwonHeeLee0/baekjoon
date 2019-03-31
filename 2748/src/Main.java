import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
public static void main(String[] args)throws IOException {
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	int num=Integer.parseInt(r.readLine());
	long a=0;
	long b=1;
	long c=0;
	if(num==0) {
		w.write(a+"");
	}
	else if(num==1) {
		w.write(b+"");
	}
	else {
		for(int i=1;i<num;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		w.write(c+"");
	}
	w.flush();
	
}
}
