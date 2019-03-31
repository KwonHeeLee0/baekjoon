import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
public static void main(String[] args) throws IOException{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	for(int i=0;i<3;i++) {
		String line[]=new String[4];
		line=r.readLine().split(" ");
		int cnt=0;
		for(int j=0;j<4;j++) {
			//w.write(line[j]);
			if(line[j].equals("0")) {
				cnt++;
			}
		}
		if(cnt==0) {
			w.write("E");
		}
		else {
			w.write('A'+cnt-1);
		}
		w.newLine();
	}
	w.flush();
	
}
}
