import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
public static void main(String[] args) throws IOException{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	int num=Integer.parseInt(r.readLine());
	for(int i=0;i<num;i++) {
		if(fun(i)==num) {
			w.write(i+"");
			break;
		}
		else if(i==num-1) {
			w.write("0");
		}
	}
	w.flush();
}
public static int fun(int a) {
	int sum=a;
	while(a>0) {
	sum+=a%10;
	a/=10;
	}
	return sum;
	
}
}
