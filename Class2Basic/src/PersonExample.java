
public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456759", "���");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.name = "��������";
		//p1.nation = "America"; >>�Ұ�
		
		System.out.println("������ ������ : " + Person.EARTH_RADIUS + " km");
		System.out.println("������ ǥ���� : " + Person.EARTH_SURFACE_AREA + " km^2");
	}

}
