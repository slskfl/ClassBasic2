
public class Person {
	//final �ʵ� >> �ʱⰪ�� �����Ǹ� ���Ŀ� ���� ���� ���� �Ұ�.
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	
	//��� ����
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}

}
