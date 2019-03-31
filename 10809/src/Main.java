
public class Main {
public static void main(String[] args) {
	Player p = new Player();
	p.age = 5;
	p.id=123;
	System.out.println(p);
}
static class Player{
	int age;
	int id;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return age + "»ì " + id;
	}
}
}
