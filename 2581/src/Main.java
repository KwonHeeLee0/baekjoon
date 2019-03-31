import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
public static void main(String[] args) throws IOException{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	int min=Integer.parseInt(r.readLine());
	int max=Integer.parseInt(r.readLine());
	int sum=0;
	int min_result=0;
	boolean check=true;
	for(int i=min;i<=max;i++) {
		sum=sum+fun(i);
		if(sum!=0&check) {
			min_result=i;
			check=false;
		}
	}
	if(sum==0) {
		w.write("-1");
	}
	else {
		w.write(sum+"");
		w.newLine();
		w.write(min_result+"");
	}
	w.flush();
}
public static int fun(int a) {
	int index=2;
	if(a==1) {
		a=0;
	}
	else {
		while(index<a) {
			if((a/index)*index==a) {
				a=0;
				break;
			}
			index++;
		}
	}
	return a;
}
}
