package final_.field;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person("123123", "김시민");
		
//		p1.nation = "미국";
//		p1.ssn = "12322";
		
		System.out.println(p1.nation);
		
		
		Person p2 = new Person("123", "권율");
		
		System.out.println(p1.ssn);
		System.out.println(p2.ssn);
		
//		final int a = 1;
		
	}
}
