package com.callor.app.service.Impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.kimbyulook.standard.InputService;

public class ScoreServiceV2 implements ScoreService {
	protected List<ScoreVO> scoreList;
	protected InputService inService;
	Scanner scan;

	public ScoreServiceV2() {
		// TODO Auto-generated constructor stub
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		Scanner scan = new Scanner(System.in);
	}

	@Override
	public void selectMenu() {
		// TODO 메인메뉴를 생성한다
		Integer intEnter1 = null;
		while (true) {

			System.out.println("=".repeat(50));
			System.out.println("빛고을 고교 성적처리 2021");
			System.out.println("=".repeat(50));
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적리스트 출력");
			System.out.println("3. 성적 저장");
			System.out.println("QUIT. 종료");
			System.out.println("-".repeat(50));
			System.out.println("업무선택");
			System.out.print(" >> ");

			String m_enter1 = scan.nextLine();
			if (m_enter1.equals("QUIT")) {
				break;

			}
			try {
				intEnter1 = Integer.valueOf(m_enter1);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("정확한 메뉴값을 입력해주세요");
			}
			if (intEnter1 == 1) {
				this.inputScore();
			} else if (intEnter1 == 2) {
				this.printScore();
			} else if (intEnter1 == 3) {
				this.saveScore();
			}
		} // while end

	}

	@Override
	public void inputScore() {
		// TODO 1. 성적 입력
		System.out.println("학번을 입력하세요");
		System.out.print(" >> ");
		Integer num = scan.nextInt();

		String name = scan.nextLine();

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {

		while (true) {

			System.out.println("성적리스트저장");
			System.out.println("저장할 파일 이름을 입력하세요");
			System.out.print(" > > ");
			String strFileName = scan.nextLine();
			if (strFileName.equals("")) {
				System.out.println("파일 이름을 입력해야합니다");
				continue;
			}

			FileWriter fileWriter = null;
			PrintWriter out = null;
			strFileName = "" + strFileName;
			strFileName = "src/com/callor/app" + strFileName + ".txt";
			try {
				fileWriter = new FileWriter(strFileName);

				out = new PrintWriter(fileWriter);

				int nSize = scoreList.size();
				for (int i = 0; i < nSize; i++) {
					ScoreVO vo = scoreList.get(i);
					System.out.println(vo.getNum() + ",");
					System.out.println(vo.getName() + ",");
					System.out.println(vo.getKor() + ",");
					System.out.println(vo.getEng() + ",");
					System.out.println(vo.getMath());
				}
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("파일을 생성할 수 없습니다");
				System.out.println("파일 이름을 다시 입력해 주세요");
				continue;

			}

		}

	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
