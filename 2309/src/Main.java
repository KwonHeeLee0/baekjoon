import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
public static void main(String[] args) throws IOException{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	int array[]=new int [9];
	for(int i=0;i<9;i++) {
		array[i]=Integer.parseInt(r.readLine());
	}
	int sum=0;
	for(int i=0;i<9;i++) {
		sum+=array[i];
	}
	int a;
	boolean check=false;
	a=sum-100;
	int tem;
	for(int i=0;i<9;i++) {
		for(int j=i+1;j<9;j++) {
			if(array[i]>array[j]) {
				tem=array[i];
				array[i]=array[j];
				array[j]=tem;
			}
		}
	}
	for(int i=0;i<9;i++) {
		for(int j=i+1;j<9;j++) {
			if(array[i]+array[j]==a) {
				array[i]=-1;
				array[j]=-1;
				check=true;
				break;
			}
			if(check) {
				break;
			}
		}
	}
	
	for(int i=0;i<9;i++) {
		if(array[i]!=-1) {
			w.write(array[i]+"");
			w.newLine();
		}
	}
	w.flush();
}
}
