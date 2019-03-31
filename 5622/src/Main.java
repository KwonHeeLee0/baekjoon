import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
public static void main(String[] args)throws IOException {
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	int sum=0;
	int a[]= {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
	String word=r.readLine();
	int len=word.length();
	char[]c=new char[len];
	for(int i=0;i<len;i++) {
		c[i]=word.charAt(i);
	}
	for(int i=0;i<len;i++) {
		sum+=a[c[i]-'A'];
	}
	w.write(sum+"");
	w.flush();
}
}
