import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
public static void main(String[] args)throws IOException {
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	int num=Integer.parseInt(r.readLine());
	int array[]=new int[num];
	int index=0;
	String array_st[]=new String[num];
	array_st=r.readLine().split(" ");
	for(int i=0;i<num;i++) {
		array[i]=Integer.parseInt(array_st[i]);
	}
	for(int i=0;i<num;i++) {
		int a=2;
		if(array[i]!=1) {
		while(a<array[i]) {
			if((array[i]/a)*a==array[i]) {
				index++;
				break;
			}
			a++;
		}
	}
		else {
			index++;
		}
	}
	w.write(num-index+"");
	w.flush();
}
}
