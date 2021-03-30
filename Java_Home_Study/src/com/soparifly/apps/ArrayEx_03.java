package com.soparifly.apps;

/*
 * 알파뱃을 A~Z까지 저장한후 각요소의 값과 알파벳 문자 정자와 으로출력을 해보
 */
public class ArrayEx_03 {
	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';
		for (int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch;
		}
		for (int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + "," + (int) alphabets[i]);
		}
	}
}
