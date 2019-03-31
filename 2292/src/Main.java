import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
public static void main(String[] args) throws IOException{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	int num=Integer.parseInt(r.readLine())-1;
	int a=0;
	int index=1;
	while(num>a) {
		a+=6*index;
		index++;
	}
	w.write(index+"");
	w.flush();
}
}
