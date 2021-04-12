package com.kimbyulook.app.Service;

import java.util.List;
import java.util.Scanner;

public class MenuService {
	/*
	 * 생성자에 매개변수 선언 menuservice클래스를 사용하여 객체를 생성할때는 title변수와 menuList에 값을 담아서 파라미터로
	 * 전달하고 생성자를 호출해야한
	 * 
	 */
	protected String title;
	protected List<String> menuList;
	protected Scanner scan;

	public MenuService(String title, List<String> menuList) {
		// 객체를 생성할때 전달한 매개변수 title을
		// 맴버변수 this.title

		this.title = title;
		this.menuList = menuList;
		scan = new Scanner(System.in);
		
	}
	
	public Integer selectMenu() {
		while(true) {
			
			System.out.println("=".repeat(50));
			System.out.println(title);
			System.out.println("-".repeat(50));
			
			int nSize = menuList.size();
			
			for (int menuIndex = 0; menuIndex < nSize; menuIndex++) {
				System.out.printf("%d.%s\n",
						menuIndex +1,
						menuList.get(menuIndex));
			}
			System.out.println("QUIT. 업무종료");
			System.out.println("-".repeat(50));
			System.out.print(" > > ");
			String strEnter = scan.nextLine();
			if(strEnter.equals("QUIT")) {
				return null;
			} 
			Integer intEnter = null;
			try {
				intEnter = Integer.valueOf(strEnter);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
//			e.printStackTrace();
				System.out.printf("업무는 1 ~ %d , 또는 QUIT만 입력하세요\n",nSize);
				continue;
			}
			if(intEnter < 1 || intEnter > nSize) {
				System.out.printf("업무는 1 ~ %d 까지 선택하세요\n ",nSize);
				continue;
			}
			return intEnter;
		}//while end 
		
	}
}
