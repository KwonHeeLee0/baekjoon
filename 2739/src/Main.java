import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	for(int b=1;b<10;b++) {
		System.out.println(a+" * "+b+" = "+a*b);
	}
	s.close();
}
}
