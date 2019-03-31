import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
public static void main(String[] args) throws IOException{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	long num=Integer.parseInt(r.readLine());
	int cnt=0;
	long i=0;
	int jump;
	boolean check=true;
	if(num<1023) {
	while(cnt<=num&check) {
		if(fun(i)==0){
			cnt++;
			
		}
				/*
				 * else { jump=10^((int)Math.log10(i)-1); i+=jump; i=(i/jump)*jump-1; }
				 */
		i++;
		
		if(i>9876543210.0) {
			w.write("-1");
			check=false;
			break;
		}
	}
	if(check) {
	w.write(i-1+"");
	}
	}
	else {
		w.write("-1");
	}
	w.flush();
}
public static int fun(long num) {
	int index=0;
	if(num>10) {
	long a=num%10;
	num/=10;
	long b=num%10;	
	while(num>0) {
		if(b<=a) {
			index=1;
			break;
		}
		else {
			a=b;
			num/=10;
			b=num%10;
		}
		}
	}

	else {
		index=0;//°¨¼Ò¼ö
	}
	
	return index;
}
}
