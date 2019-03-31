import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
public static void main(String[] args) throws IOException{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	String line=r.readLine();
	int len=line.length();
	int cnt=0;
	char[] a=new char[len];
	for(int i=0;i<len;i++) {
		a[i]=line.charAt(i);
	}
	for(int i=1;i<len;i++) {
		if(a[i]=='-') {
			cnt--;
		}
		if(a[i]=='j') {
			if(a[i-1]=='n'||a[i-1]=='l') {
				cnt--;
			}
		}
		if(a[i]=='=') {
			if(a[i-1]=='c'||a[i-1]=='s'||a[i-1]=='z') {
				cnt--;
			}
			
		}
	}
	for(int i=2;i<len;i++) {
		if(a[i]=='=') {
			if(a[i-1]=='z') {
				if(a[i-2]=='d') {
					cnt--;
				}
			}
		}
	}
	w.write(len+cnt+"");
	w.flush();
}
}
