import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader sdf;//�����ѰŰ�
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));//�̰� �̿��ؼ� ��ü�� ����°�
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		while (true) {
			String s = r.readLine();
			w.write(s);
			w.flush();
			w.close();
		}
	}
}
/*
 * �ٵ� ���� true���� ���ǽ����� ��ߴ� 10���� �ްڴ� �� �̷������� for������ ����
 * �Ʊ�� close �ذ����� ����Դ°� close�����ϸ� ��� ��밡����
 * �ٵ� close�� while ���� �ִµ� �� �ٽ� �ȿ���
 * close���� �����µ� �ѹ������� �ι�° ����Ҷ� r�� �����־ �������°�s
 * �ٵ� �ι�° w �����Ҷ��� �� �տ� ���� �Ⱥ���?�ȵǳ�
 * �׷� bufferedreader�� while �ȿ� ������ ����? ���� �ٵ� �ſ� ��ȿ����
��Ű��Ű * */