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
	line=line.toLowerCase();
	int[]a=new int['z'-'a'+1];
	int len=line.length();
	for(int i=0;i<len;i++) {
		a[line.charAt(i)-'a']++;
	}
	int max=a[0];
	int index=0;
	int c=0;
	for(int i=1;i<a.length;i++) {
		if(max<a[i]) {
			max=a[i];
			index = i;
			c=0;
		}
		else if(max == a[i])
			c=1;
		
	}
	if(c==1)
		w.write("?");
	else
		w.write(('A'+index));
	w.flush();
}
}
