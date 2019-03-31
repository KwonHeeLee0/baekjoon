import java.util.Scanner;

public class Main2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	String line=s.next();
	int sum=0;
	int a;
	for(int i=0;i<num;i++) {
		a=line.charAt(i)-'0';
		sum+=a;
	}
	System.out.println(sum);
	s.close();;
}
}
