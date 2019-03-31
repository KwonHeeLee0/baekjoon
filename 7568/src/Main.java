import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws IOException{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	int num=Integer.parseInt(r.readLine());
	int array[][]=new int[2][num];
	for(int i=0;i<num;i++) {
		StringTokenizer st=new StringTokenizer(r.readLine());
		array[0][i]=Integer.parseInt(st.nextToken());
		array[1][i]=Integer.parseInt(st.nextToken());
	}
	for(int i=0;i<num;i++) {
		int cnt=1;
		for(int j=0;j<num;j++) {
			if(array[0][j]>array[0][i]) {
				if(array[1][j]>array[1][i]) {
					cnt++;
				}
			}
		}
		w.write(cnt+" ");
	}
	w.flush();
}
}
