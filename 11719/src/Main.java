import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNextLine()) {
			String a = s.nextLine();
			System.out.println(a);
		}
		s.close();
	}
}