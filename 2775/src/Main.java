
/*
 * import java.io.BufferedReader; import java.io.BufferedWriter; import
 * java.io.IOException; import java.io.InputStreamReader; import
 * java.io.OutputStreamWriter;
 * 
 * public class Main { public static void main(String[] args) throws
 * IOException{ BufferedReader r=new BufferedReader(new
 * InputStreamReader(System.in)); BufferedWriter w=new BufferedWriter(new
 * OutputStreamWriter(System.out)); int test=Integer.parseInt(r.readLine());
 * for(int i=0;i<test;i++) { int sum=0; int index=0; int
 * floor=Integer.parseInt(r.readLine()); int ho=Integer.parseInt(r.readLine());
 * int array[][]=new int[floor+1][ho]; for(int j=0;j<ho;j++) { array[0][j]=j+1;
 * } for(int j=0;j<floor;j++) { array[j][0]=1; }
 * 
 * w.write(sum+""); w.newLine(); } w.flush(); } }
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int array[][] = new int[15][15];
		for (int i = 0; i < 15; i++) {
			array[0][i] = i + 1;
			array[i][0] = 1;
		}
		for (int i = 1; i < 15; i++) {
			for (int j = 1; j < 15; j++) {
				array[i][j] = array[i - 1][j] + array[i][j - 1];
			}
		}
		int test = Integer.parseInt(r.readLine());
		for (int i = 0; i < test; i++) {

			int floor = Integer.parseInt(r.readLine());
			int ho = Integer.parseInt(r.readLine());

			w.write(array[floor][ho - 1] + "");
			w.newLine();
		}
		w.flush();
	}
}
