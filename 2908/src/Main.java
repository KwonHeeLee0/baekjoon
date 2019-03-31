import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
public static void main(String[] args)throws IOException {
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	String line=r.readLine();
	String []a=line.split(" ");
	int array[]=new int[2];
	for(int i=0;i<2;i++) {
		int num=Integer.parseInt(a[i]);
		int b=num%10;
		int c=(num/10)%10;
		int d=num/100;
		array[i]=b*100+c*10+d;
	}
	if(array[0]>array[1]) {
		w.write(array[0]+"");
	}
	else {
		w.write(array[1]+"");
	}
	w.flush();
}
}
