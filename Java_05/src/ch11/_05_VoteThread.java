package ch11;

import java.util.Random;

// 지역별 투표 현황
public class _05_VoteThread implements Runnable {

	int sum = 0;	// 총 투표율
	int targetNum = 100;	// 개표율 100%
	Random random = new Random();	// 난수 발생 => 개표율 속도 
	
	
	@Override
	public void run() {
		StringBuffer sb = new StringBuffer();	// *모양의 그래프를 출력하기 위함 => 개표율을 *의 개수로 출력
		
		while(true) {

			try {
				Thread.sleep(1000);		// 1000 = 1초 => cpu의 시간을 다른 스레드에게 넘겨주는 효율적인 방법이다. 현작업을 중지하고 념겨준다
			} catch(InterruptedException e) {
				e.printStackTrace();
			} finally {
				
			}
			
			sum += random.nextInt(10);	// 총 개표율 : 10까지의 난수발생숫자를 누적
			sb.delete(0, sb.length());	// 그래프를 0으로 초기화, *의 길이만큼
			
			if(sum > targetNum) {	
				sum = 100;
				for(int i = 0; i < sum; i++) {
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName() + " 개표율 : " + sum + " \t" + sb);
				break;	// 무한루프 탈출
			} else {
				for(int i = 0; i < sum; i++) {
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName() + " 개표율 : " + sum + "\t" + sb);
			}
			

		} // while 무한루프
		
	} // run
	
}
