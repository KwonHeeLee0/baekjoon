import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader sdf;//선언만한거고
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));//이걸 이용해서 객체를 만드는거
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
 * 근데 보통 true보다 조건식으로 써야댐 10번만 받겠다 뭐 이런식으로 for문같이 ㅇㅇ
 * 아까건 close 해가지구 못써먹는거 close만안하면 계속 사용가능해
 * 근데 close도 while 문에 있는데 왜 다시 안열림
 * close에서 닫히는데 한바퀴돌고 두번째 사용할땐 r이 닫혀있어서 오류나는거s
 * 근데 두번째 w 선언할때는 왜 앞에 저거 안붙임?안되네
 * 그럼 bufferedreader를 while 안에 넣으면 가능? ㅇㅇ 근데 매우 비효율적
오키도키 * */