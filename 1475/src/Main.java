import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
public static void main(String[] args) throws IOException{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	String num=r.readLine();
	int len=num.length();
	double a[]=new double[10];

	for(int i=0;i<len;i++) {
		for(int j=0;j<10;j++) {
			if(j==(num.charAt(i)-'0')) {
				a[j]++;
			}
		}
	}
	a[6]=Math.round((a[6]+a[9])/2);
	a[9]=0;
	double max=0;
	for(int i=0;i<10;i++) {
		if(max<a[i]) {
			max=a[i];
		}
	}
	w.write((int)max+"");
	w.flush();
}
}
