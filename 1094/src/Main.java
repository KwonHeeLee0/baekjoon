import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
public static void main(String[] args) throws IOException{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	int a=Integer.parseInt(r.readLine());
	int start=64;
	int cnt=0;
	if(a>=start) {
		cnt=1;
	}
	else {
	while(a<start) {
	if(a<start) {
		start/=2;
		cnt++;
		if(a==start) {
			break;
		}
		else {
			cnt++;
		}
	}
	}
	}
	w.write(cnt+"");
	w.flush();
}
}
