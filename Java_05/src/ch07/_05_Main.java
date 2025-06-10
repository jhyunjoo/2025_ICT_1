package ch07;

public class _05_Main {
	
	public static void main(String[] args) {
		
		System.out.println("<< 방법1. 다형성 적용, 부모는 인터페이스 >>");
		System.out.println("<< _05_Mobile 타입 선언시 >>");
		_05_Mobile mobile = new _05_SmartPhone();
		mobile.sendSMS();
		mobile.receivesSMS();
		_05_SmartPhone sphone1 = (_05_SmartPhone)mobile;
		/*((_05_MP3) mobile).play();
		((_05_MP3) mobile).stop();
		System.out.println("cal : " + ((_05_SmartPhone)mobile).calculate(4, 2));
		*/
		sphone1.play();
		sphone1.stop();
		System.out.println("cal : " + sphone1.calculator(4, 2));
		System.out.println();
		
		System.out.println("<< _05_MP3 타입 선언시 >>");
		_05_MP3 mp3 = new _05_SmartPhone();
		mp3.play();
		mp3.stop();
		_05_SmartPhone sphone2 = (_05_SmartPhone)mp3;
		/*((_05_Mobile)mp3).sendSMS();
		((_05_Mobile)mp3).receivesSMS();
		System.out.println("cal : " + ((_05_SmartPhone)mp3).calculate(32, 4));
		*/
		sphone2.sendSMS();
		sphone2.receivesSMS();
		System.out.println("cal : " + sphone2.calculator(32, 4));
		System.out.println();
		
		System.out.println("<< 방법2. 다형성 적용, 부모는 클래스 >>");
		_05_PDA pda = new _05_SmartPhone();
		/*((_05_Mobile)pda).sendSMS();
		((_05_Mobile)pda).receivesSMS();
		((_05_MP3)pda).play();
		((_05_MP3)pda).stop();
		System.out.println("cal : " + pda.calculate(15,3));
		*/
		_05_SmartPhone sphone3 = (_05_SmartPhone) pda;
		sphone3.sendSMS();
		sphone3.receivesSMS();
		sphone3.play();
		sphone3.stop();
		System.out.println("cal : " + pda.calculator(15,3));
		
	}

}
