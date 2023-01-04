package Practice;

public class Variable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int level;
		level = 10;
		System.out.println(level);
		
		byte bs1 = -128;
		// byte bs2 = 128; //범위를 넘어섰기 때문에 오류 발생
		
		short sVal = 10;
		byte Bval = 20;
		// System.out.println(sVal + bVal); // 자료형이 다르기 때문에 연산 불가
		
		long num1 = 12312412312541243L; // long 뒤에 L 식별자를 붙여줘야 long타입으로 인식
		
		long num2 = 1234; //int 범위 안이라면 자동으로 long타입으로 변환
		
		char ch1 = 'A';
		System.out.println(ch1); //문자 출력
		System.out.println((int)ch1); //문자에 해당하는 아스키코드 값 출력
		
		char ch2 = 66; //정수 값 대입
		System.out.println(ch2); // 정수 값에 해당하는 문자 출력
		
		int ch3 = 67; 
		System.out.println(ch3); //문자 정수 값 출력		
		System.out.println((char)ch3); //정수 값에 해당화는 문자 출력
		
		//''는 문자 
		//문자가 여러개 모이면 문자열
		//문자열은 "" 사용
		//'A'와 "A"는 다른 값
		//문자열은 String클래스를 사용
		
		char ex1 = '한';
		char ex2 = '\uD55C'; //\uD55C = 한
		
		System.out.println(ex1);
		System.out.println(ex2);
				
		double dnum = 3.14; 
		float fnum = 3.14F; //float형은 식별자 필요
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		boolean isMarried = true;
		System.out.println(isMarried);
		
		//c와 파이썬에서는 정수 1이 true로 작동하지만
		//자바에서는 1이랑 true랑 다른 값으로 취급
		
		final double PI = 3.14;
		final int MAX_NUM = 100;
		final int MIN_NUM
		
		MIN_NUM = 10; //사용하기 전에 초기화. 초기화하지 않으면 오류 발생
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		
	}

}
