import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(r.readLine());
		int cnt = 0;
		int len = 0;
		int a[] = new int['z' - 'a'];
		for (int i = 0; i < num; i++) {
			String line = r.readLine();

			len = line.length();
			boolean isExist = false;
			for (int q = 0; q < len && !isExist; q++) {
				char c = line.charAt(q);
				for (int j = q+1; j < len && !isExist; j++) {
					if (c == line.charAt(j))
						break;
					else {
						for(int k=j;k<len; k++) {
							if(line.charAt(k) == c) {
								isExist = true;
								break;
							}
								
						}
					}

				}
			}
			if(!isExist)
				cnt++;
		}
		w.write(cnt+"");
		w.flush();
	}
}
