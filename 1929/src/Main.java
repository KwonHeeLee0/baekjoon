//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.StringTokenizer;
//
//public class Main {
//public static void main(String[] args) throws IOException{
//	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
//	BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
//	StringTokenizer st=new StringTokenizer(r.readLine());
//	int min;
//	int max;
//	min=Integer.parseInt(st.nextToken());
//	max=Integer.parseInt(st.nextToken());
//	for(int i=min;i<=max;i++) {
//		if(i!=1) {
//			int index=2;
//			while(index<=(int)Math.sqrt(i)+1) {
//				if(i%index==0) {
//					break;
//				}
//				index++;
//				if((int)Math.sqrt(i)+1==index|i==2|i==3) {
//					w.write(i+"");
//					w.newLine();
//				}
//			}
//		}
//	}
//	w.flush();	
//}
//}

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
	StringTokenizer st=new StringTokenizer(r.readLine());
	int min;
	int max;
	min=Integer.parseInt(st.nextToken());
	max=Integer.parseInt(st.nextToken());
	for(int i=min;i<=max;i++) {
		if(fun(i)!=0) {
			w.write(i+"");
			w.newLine();
		}
	}

	w.flush();
}
public static int fun(int a) {
	int index=2;
	if(a==1) {
		a=0;
	}
	else if(a==2) {
		a=1;
	}
	else {
		while(index<=Math.sqrt(a)+1) {
			if(a%index==0) {
				a=0;
				break;
			}
			index++;
		}
	}
	return a;
}
}

