package com.callor.score.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.WordVO;
import com.callor.score.service.WordService;

public class WordServiceImplV1 implements WordService {
	List<WordVO> wordList;

	public WordServiceImplV1() {
		wordList = new ArrayList<WordVO>();
		this.loadWord();
		// 생성자에서 word.txt파일을 읽어서
		// wordList 데이터를 생성하는 method를
		// 생성자에서 호출하여 이클래스를 생성하면
		// 자동으로 실행되어 wordList데이터를 준비하도록하자
	}

	public void loadWord() {

		FileReader fileReader = null;
		BufferedReader buffer = null;
		String fileName = "src/com/callor/score/word.txt";

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			String reader;
			while (true) {
				try {
					reader = buffer.readLine();
					if (reader == null)
						break;
					String word[] = reader.split(":");
					WordVO wordVO = new WordVO();
					wordVO.setKorea(word[0]);
					wordVO.setEnglish(word[1]);
					wordVO.setCount(wordList.size() + 1);
					wordList.add(wordVO);

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} // while end
//			System.out.println(wordList.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void printWord() {
		System.out.println("=".repeat(50));
		System.out.print("순서\t영문\t번역\n");
		System.out.println("=".repeat(50));
		int nSize = wordList.size();
		for (int i = 0; i < nSize; i++) {
			WordVO vo = wordList.get(i);
			System.out.printf(vo.getCount() + "\t");
			System.out.print(vo.getKorea() + "\t");
			System.out.printf("%10s\n", vo.getEnglish());
		}
		System.out.println("-".repeat(50));

	}

	public void viewWord() {
	}

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		
	}

}
