import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args)throws IOException {
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	int array[]=new int[8];
	String[] line=new String[2];
	for(int i=0;i<4;i++) {
		String a=r.readLine();
		line=a.split(" ");
		array[2*i]=Integer.parseInt(line[0]);
		array[2*i+1]=Integer.parseInt(line[1]);
	}
	int max=array[1];
	int index=max;
	for(int i=1;i<3;i++) {
		index=index-array[2*i]+array[2*i+1];
		if(index>max) {
			max=index;
		}
	}
	w.write(max+"");
	w.flush();
}
}
