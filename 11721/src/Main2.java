import java.util.Scanner;

public class Main2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String line=s.next();
	int size=line.length();
	s.close();
	for(int i=0;i<size;i++) {
		System.out.print(line.charAt(i));
		if(i%10==9) {
			System.out.println();
		}
	}
}
}
