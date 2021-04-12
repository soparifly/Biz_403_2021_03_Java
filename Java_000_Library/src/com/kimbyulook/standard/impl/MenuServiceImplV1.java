package com.kimbyulook.standard.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kimbyulook.standard.MenuService;

public class MenuServiceImplV1 implements MenuService {
	protected String title;
	protected List<String> menuList;
	protected Scanner scan;

	/*
	 * 생성자에 매개변수 선언
	 * MenueServiceImplV1 클래스를 사용하여 객체를 생성할때는 
	 * title변수와  menuList에 값을 담아서 파라미터로 전달하고 
	 * 생성자를 호출해야한다.
	 * 
	 */
	
	
	public MenuServiceImplV1(String title, List<String>menuList) {
		
		//객체를 생성할때 전달한 매개변수 title을
		//맴버변수 this.title
		this.title = title;
		
//		menuList = new ArrayList<String>();
		this.menuList = menuList;
		scan = new Scanner(System.in);
		
	}

	@Override
	public Integer selectMenu() {
		while(true) {
			
			System.out.println("=".repeat(50));
			// TODO Auto-generated method stub
			System.out.println(title);
			System.out.println("-".repeat(50));
			int nSize = menuList.size();
			for (int menuIndex = 0; menuIndex < nSize; menuIndex++) {
				
				System.out.printf("%d. %s\n", menuIndex + 1, menuList.get(menuIndex));
				
			}
			System.out.println("QUIT . 업무종료");
			
			System.out.println("=".repeat(50));
			System.out.print("업무선택 >>");
			String strM = scan.nextLine();
			if (strM.equals("QUIT")) {
				return null;
			}
			Integer intM = null;
			try {
				intM = Integer.valueOf(strM);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.printf("업무는 1 ~ %d, 또는 QUIT만 입력하세요.\n", nSize);
//			e.printStackTrace();
				continue;
			}
			if(intM < 1 || intM > nSize) {
				System.out.printf("업무는 1 ~ %d 까지 선택하세요\n",nSize);
				continue;
			}
			return intM;
		} //while end 

	}

}
