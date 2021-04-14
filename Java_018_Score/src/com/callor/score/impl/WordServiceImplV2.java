package com.callor.score.impl;

import java.util.Arrays;
import java.util.Random;

import com.callor.score.model.WordVO;

public class WordServiceImplV2 extends WordServiceImplV1A {

	@Override
	public void viewWord() {
		Random rnd = new Random();

		WordVO word = this.getWord();
		String strEng = word.getEnglish();

		String[] strWords = strEng.split("");

		for (int i = 0; i < 100; i++) {

			int index1 = rnd.nextInt(strWords.length);
			int index2 = rnd.nextInt(strWords.length);

			String temp = strWords[index1];
			strWords[index1] = strWords[index2];
			strWords[index2] = temp;

		}
		System.out.println(word.toString());
		System.out.println("-".repeat(50));
		System.out.println(Arrays.toString(strWords));
		System.out.print(">>   ");
		String strInput = scan.nextLine();
		if (strInput.equalsIgnoreCase(word.getEnglish())) {
			System.out.println("맞았습니다. 참 잘했어요");
		} else {
			System.out.println("힌트 : " + word.getKorea());
			System.out.println("다시한번 생각해보세요");
		}
	}

	public void selectMenu() {

		System.out.println("★".repeat(50));
		System.out.println("☆".repeat(3) + "                                            " + "☆☆☆");
		System.out.println("☆".repeat(3) + "                Word Game                   " + "☆☆☆");
		System.out.println("☆".repeat(3) + "                                            " + "☆☆☆");
		System.out.println("★".repeat(50));

		System.out.println("--------------게임을 시작하지----------------");

		System.out.println("원하는 메뉴를 입력하세요");
		System.out.println("1. 게임 시작");
		System.out.println("2. 점수 확인");
		System.out.println("3. 랭킹 확인");

		int choies = scan.nextInt();
		if (choies == 1) {

			System.out.println("다음 다섯개의 단어를 보여드립니다");

			String[] words = new String[5];
			for (int i = 0; i < words.length; i++) {
			}

			System.out.println();
		}
	}

	private void words() {
	}
}
