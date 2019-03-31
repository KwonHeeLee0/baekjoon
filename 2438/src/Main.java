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
		//System.in을 InputStreamReader로 가져오면 스트링형태로 읽어오는거고 그걸 BufferedReader로 감싸면
		//System.in에서 String형태로 버퍼를 이용해서 가져오는거
		//InputStreamReader 기능에 버퍼기능추가한거
		//BufferedReader : 버퍼를 이용해서 System.in으로 들어오는 문자들을 읽어오겠다
		//쉽게보면 내가 hello를 치면
		//scanner는 내부적으로 h 한글자씩 읽어서 붙여나가는거고
		//scanner는 쓰레기중에 쓰레기 기억에서 지워 말도안되게 느림 걍 노답 절대로 쓰면안됨
		//reader는 버퍼에 읽어놓고 그걸 한번에 문자열로 리턴함
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		//BufferedWriter : 버퍼를 이용해서 출력하는 내용들을 버퍼에 저장해 두었다가 writer.flush()로 한번에 출력하겠다.
		//Scanner도 내부적으로 스트링을 인트나 그런형태로 바꿔주는거 System.in으로 들어오는거는 키보드에서 읽어오는거라 무조건 캐릭터 형태로 읽어와
		int a = Integer.parseInt(r.readLine());//readline은 무조건 String형태 -> Int형태로 변환
		//double b = Double.parseDouble(r.readLine())
		//Integer c = new Integer(5);
		//int d = 5;
		//d = c;//d에 c를 넣어주는데 이게 Integer형을 int형 변수에 넣어주는거잖아 원래 다른 클래스들은 이게 안되는데 이렇게 Integer형을 int로 바꿔주는걸 자동 언박싱이라고함
		//c = 10;//이거도 됨 이건 Integer에 int 형 변수를 넣어주는건데 이건 자동 박싱이라고함
	
		//형태마다 다름 이거도 4장인가에 나와 Double은 클래스고 double은 변수인데 Double이라는 클래스를 double이라는 변수로 바꿔주는 기능이 자바에는 기본적으로 내장되어있음(자동 언박싱)
		//readline을 해야 엔터까지 읽어옴
		//string으로 받으면 변환 필요없음
		//자바에는 템플릿이라는게 있는데 Arraylist<class 형태> t = new ArrayList;
		//이런형식이
		//ArrayList<Integer> arrayList = new ArrayList<Integer>();
		//ArrayList<int> arrayList = new ArrayList<int>();//오류
		//E부분에는 클래스밖에 못들어감 int이런건 primitive 변수라고 클래스와는 다른 형식이거든
		//뒤에 .~ 달아서 기능 여러가지 쓸수있음  ㅇㅇ 근데 그거때문에 쓰는건아니고 ㅇㅇ 
		//클래스와 변수는 완전 다른거거든 그래서 원시형 변수 역할을 하는 클래스를 따로 만든거
		//2장에 클래스와 객체와 변수 함수 차이 나올꺼임
		/*
		 * 스캐너는 s.nextInt()하게되면 System.in을 매번 새로만들어서 사용하는데
		 * reader는 한번 넣어둔 System.in을 계속 재사용해서 빠름
		 * */
		for (int b = 0; b < a; b++) {
			for (int c = 0; c <= b; c++) {
				w.write("*");
			}
			w.newLine();//="\n"
		}
		w.flush();
		w.close();//close하다가 예외생기는경우 일반덕으로 안색임
	}
	//힌트 0번째줄엔 1개 1번째줄에 2개 2번째줄에 3개출력 3
}
