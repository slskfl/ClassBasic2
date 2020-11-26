
public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456759", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.name = "을지문덕";
		//p1.nation = "America"; >>불가
		
		System.out.println("지구의 반지름 : " + Person.EARTH_RADIUS + " km");
		System.out.println("지구의 표면적 : " + Person.EARTH_SURFACE_AREA + " km^2");
	}

}
