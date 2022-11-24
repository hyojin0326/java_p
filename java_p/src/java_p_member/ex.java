/*package java_p_member;

import java.util.Scanner;


public class ex extends member{

	void enter() {
		System.out.println("\n--> 정기 이용 회원인가요? (Y/N)");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int number=1;
		System.out.println("# DMU 도서실 좌석 관리 시스템 #");
		
		do {System.out.println("######### 메  뉴 #########");
		System.out.println("     0. 종   료");
		System.out.println("     1. 입   실");
		System.out.println("     2. 퇴   실");
		System.out.println("     3. 정기 이용권");
		System.out.println("     4. 정기이용 탈퇴");
		System.out.println("########################");	
		number = sc.nextInt();
		
		
		switch(number) {
		case 1 :
			enter();
			break;
			
		case 2 :
			
		case 3 :
			System.out.print("\n 학생인가요? (Y/N) ");
			String std=sc.next();
			if(std=="y") {
				super.std_yn=true;
			} else {
				
			}
		case 4 : 
			}
		}
		
		while(number!=0);
	}
}*/