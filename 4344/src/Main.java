import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(System.out));
		int num=Integer.parseInt(reader.readLine());
		
		for(int i=0;i<num;i++) {
			
			String col[]=reader.readLine().split(" ");
			int len =Integer.parseInt(col[0]);
			double avg=0;
			for(int j=0;j<len;j++) {
				avg=avg+Integer.parseInt(col[j+1]);
				
			}
			avg = avg / len;
			double count=0;
			for(int j=0;j<len;j++) {
				if(Integer.parseInt(col[j+1])>avg) {
					count++;
				}
				
			}
			writer.write(String.format("%.3f", count/len*100));
			writer.write("%");
			writer.newLine();
		}
		writer.flush();
		
	}
}