package section01;

public class Child2 extends Parent{
	
	private String car; // Child2만의 필드
	
	public Child2() {
		System.out.println("*** Child2 객체 생성됨 ***");
		
		// 부모의 firstName 필드를 상속 받았으나
		// 접근 제어자가 private이라서 직접 접근 불가능
		// -> 간접 접근 방법 이용
		setFirstName("바다");
		setAddress("경기도 용인시");
		setMoney(7000);
		car = "아반떼";
	}
	
	// [상속 키워드] : extends (확장하다)
	// -> 부모의 필드/메서드를 상속 받은
	//	자식의 크기가 커지기 때문에 "확장하다" 키워드 사용
	
	// [상속 주의 사항]
	// 1) 부모의 생성자는 상속 X
	
	// 2) 부모의 private 필드/메서드도 상속은 되지만 
	//    상속 받은 자식도 직접 접근 불가능
	
	// [상속 메모리 구조]
	// - 자식 객체 생성 시 부모 객체가 같이 생성되어 자식 객체 내부에 배치됨 
	
	// getter/setter 자동 생성  : alt + shift + s -> r
	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}
	
	
	
	
	
	
	
	
	
}
