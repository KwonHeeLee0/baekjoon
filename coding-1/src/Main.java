import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
public static void main(String[] args)throws IOException {
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	int a=1;
	int b=5;
	int c=0;
	int array[][]=new int[5][5];
	for(int i=0;i<5;i++) {
		if(i%2==0) {
		for(int j=0;j<5;j++) {
			array[i][j]=a;
			a++;
		}
		}
		else {
			for(int j=5;j>0;j--) {
				array[i][j]=a;
				a++;
			}
		}
	}
	w.write(array+"");
	w.flush();
}
}
