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
	int array[]=new int[10];
	while(num>0) {
		array[num%10]++;
		num/=10;
	}
	for(int i=9;i>=0;i--) {
		for(int j=0;j<array[i];j++) {
			w.write(i+"");
		}
	}
	w.flush();
}
}
