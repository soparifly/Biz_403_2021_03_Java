package com.collar.var;

public class Varriable_19 {
	public static void main(String[] args) { //main 실행순서대로 한번실행한다
	
		//console 에 숫자 0이 반복되며 출력
		//무한이 반복되는 코드를 "조건을 부여"하여 유한 반복되도록 변경하기
		// for ()명령에 조건부여하기
		// for문에 두번째 명령 구간에
		//비교연산자를 추가 
		//조건문을 작성 ;<
		int intNum = 0;
		
		for( ;intNum < 10; ) { //for문으로 진입한다. 조건이 완성될때까지 반복한다
			System.out.println(++intNum);
			System.out.println();
			System.out.println();
			}
		
		intNum = 0;
		for(; intNum <10 ;) {
			intNum += 2;
			System.out.println(intNum);
			}
		
		intNum = 1;
		for(; intNum <10 ;) {
			intNum += 2;
			System.out.println(intNum);
	
	}
}
}