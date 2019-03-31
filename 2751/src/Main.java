import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
public static void main(String[] args)throws IOException {
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	int num =Integer.parseInt(r.readLine());
	int array[] =new int [num];
	for(int i=0;i<num;i++) {
		array[i]=Integer.parseInt(r.readLine());
	}
	Arrays.sort(array);
	for(int i=0;i<num;i++) {
		w.write(array[i]+"");
		w.newLine();
	}
	w.flush();
}
}
