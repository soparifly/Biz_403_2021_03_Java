package com.callor.apps.service;

public class TimeServiceV1A {
	//int[] nums; 클래스안에서 변의 유형을 지정해
	int nums[];
	
//	********************생성자 안에서 배열을 지정함
	public TimeServiceV1A() {
		nums = new int[8];
	}
	/*
	 * 배열은 총  8개
	 * 배열에 저장할 값은 2부터 시작하기때문에 +2를 더
	 */
	public void makeTime() {     					//계산을 하기위한 
		for (int i = 0 ; i < nums.length ; i++) { 	// 0~7까지 이기때문에 8개 배열의 수는 8개 위의 생성자 안에 지정한배
			int num = i + 2; 						// 구구단은 2단부터 0~7까지 2를 더함 => 2~ 9
													//첨자의 값보다 배열의 반복횟수가 초과될수없
			nums[i] = num; 							//배열을 변수로 지정
		}
	}
	/*
	 * 배열에 담긴 값 = 단에 해당하는 값
	 *
	 */
	public void printTimes() {
		for (int i =0 ; i <nums.length ; i ++) {

			
			//method에 return  ??명령문이 있으면
			//변수 = method() 형식으로 코드를 작성하고 
			//method가 reture 해준 결과값을 변수에 저장할수 있다.
			String dLines = LinesService.dLines(50);
			String sLines = LinesService.sLines(50);
			
			System.out.println(dLines);
			
			System.out.printf("%d 단 구구단\n",
												nums[i]); //nums의 i까지 의 값
			
			
			
			System.out.println(sLines);
			
			for(int j = 2; j < 10 ; j++) {
			
				
				System.out.printf("%d x %d = %d\n",nums[i],j,nums[i]*j); //2~9까지의 숫자를 만들어
			}
		}
	}
}

