import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		//Scanner s = new Scanner(System.in);
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		//System.in�� InputStreamReader�� �������� ��Ʈ�����·� �о���°Ű� �װ� BufferedReader�� ���θ�
		//System.in���� String���·� ���۸� �̿��ؼ� �������°�
		//InputStreamReader ��ɿ� ���۱���߰��Ѱ�
		//BufferedReader : ���۸� �̿��ؼ� System.in���� ������ ���ڵ��� �о���ڴ�
		//���Ժ��� ���� hello�� ġ��
		//scanner�� ���������� h �ѱ��ھ� �о �ٿ������°Ű�
		//scanner�� �������߿� ������ ��￡�� ���� �����ȵǰ� ���� �� ��� ����� ����ȵ�
		//reader�� ���ۿ� �о���� �װ� �ѹ��� ���ڿ��� ������
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		//BufferedWriter : ���۸� �̿��ؼ� ����ϴ� ������� ���ۿ� ������ �ξ��ٰ� writer.flush()�� �ѹ��� ����ϰڴ�.
		//Scanner�� ���������� ��Ʈ���� ��Ʈ�� �׷����·� �ٲ��ִ°� System.in���� �����°Ŵ� Ű���忡�� �о���°Ŷ� ������ ĳ���� ���·� �о��
		int a = Integer.parseInt(r.readLine());//readline�� ������ String���� -> Int���·� ��ȯ
		//double b = Double.parseDouble(r.readLine())
		//Integer c = new Integer(5);
		//int d = 5;
		//d = c;//d�� c�� �־��ִµ� �̰� Integer���� int�� ������ �־��ִ°��ݾ� ���� �ٸ� Ŭ�������� �̰� �ȵǴµ� �̷��� Integer���� int�� �ٲ��ִ°� �ڵ� ��ڽ��̶����
		//c = 10;//�̰ŵ� �� �̰� Integer�� int �� ������ �־��ִ°ǵ� �̰� �ڵ� �ڽ��̶����
	
		//���¸��� �ٸ� �̰ŵ� 4���ΰ��� ���� Double�� Ŭ������ double�� �����ε� Double�̶�� Ŭ������ double�̶�� ������ �ٲ��ִ� ����� �ڹٿ��� �⺻������ ����Ǿ�����(�ڵ� ��ڽ�)
		//readline�� �ؾ� ���ͱ��� �о��
		//string���� ������ ��ȯ �ʿ����
		//�ڹٿ��� ���ø��̶�°� �ִµ� Arraylist<class ����> t = new ArrayList;
		//�̷�������
		//ArrayList<Integer> arrayList = new ArrayList<Integer>();
		//ArrayList<int> arrayList = new ArrayList<int>();//����
		//E�κп��� Ŭ�����ۿ� ���� int�̷��� primitive ������� Ŭ�����ʹ� �ٸ� �����̰ŵ�
		//�ڿ� .~ �޾Ƽ� ��� �������� ��������  ���� �ٵ� �װŶ����� ���°Ǿƴϰ� ���� 
		//Ŭ������ ������ ���� �ٸ��Űŵ� �׷��� ������ ���� ������ �ϴ� Ŭ������ ���� �����
		//2�忡 Ŭ������ ��ü�� ���� �Լ� ���� ���ò���
		/*
		 * ��ĳ�ʴ� s.nextInt()�ϰԵǸ� System.in�� �Ź� ���θ��� ����ϴµ�
		 * reader�� �ѹ� �־�� System.in�� ��� �����ؼ� ����
		 * */
		for (int b = 0; b < a; b++) {
			for (int c = 0; c <= b; c++) {
				w.write("*");
			}
			w.newLine();//="\n"
		}
		w.flush();
		w.close();//close�ϴٰ� ���ܻ���°�� �Ϲݴ����� �Ȼ���
	}
	//��Ʈ 0��°�ٿ� 1�� 1��°�ٿ� 2�� 2��°�ٿ� 3����� 3
}
