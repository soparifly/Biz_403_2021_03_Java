package com.heart.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.heart.model.PlayerVO;

public class BlackJackRuleImplV2 extends BlackJackRuleImplV1 {
	protected final Integer 유저명 = 0;
	protected final Integer 저장된점수 = 1;
	protected List<PlayerVO> playerInfo;
	protected PlayerVO playerVO;
	protected String playerName;

	public BlackJackRuleImplV2() {

		playerInfo = new ArrayList<PlayerVO>();
		playerVO = new PlayerVO();

		// 현재 메소드 2곳이상 계속 쓰이는 변수이므로 생성자에 지정한다
		// 여기에 저장된 VO는 불러올파일에있는 정보도 포함된다
		playerName = playerVO.getName();
		// TODO Auto-generated constructor stub
	}

	public String inputGamer() {
		// TODO 플레이어의 정보 입력
		System.out.println("-".repeat(lineNum));
		System.out.println("1. 게임 시작");
		System.out.println("2. 아이디를 다시 입력합니다");
		System.out.println("3. EXIT ");
		System.out.println("..");
		System.out.println("..");
		System.out.print(">> ");
		// 메뉴입력 프롬프트
		String strEnt = scan.nextLine();
		while (true) {
			try {
				Integer intEnt = Integer.valueOf(strEnt);
				if (intEnt == 1) {
					setId();
					gameMainScreen(playerName);
					break;
				} else if (intEnt == 2) {
					loadGame();
				} else if (intEnt == 3) {
					break;
				}
			} catch (NumberFormatException e) {
//			e.printStackTrace();
				System.out.println("정확한 메뉴의 번호를 입력해주세요");
				continue;
			}
		}
		return strEnt;
	}

	// 진입시 ID를 입력한다
	// 그리고 playerVO에 저장을 하고 이후에 저장 메서드를 위해 미리 PlayInfo리스트에 추가한다
	private String setId() {
		while (true) {
			System.out.println("이름을 입력합니다. 이미 저장된 아이디가 있으면 불러옵니다.");
			System.out.println("-".repeat(lineNum));
			System.out.print(" 이름 입력 >> ");
			String id = scan.nextLine();
			if (id.equals("QUIT")) {
				return null;
			}
			playerVO.setName(id);
			playerInfo.add(playerVO);
			break;
			// 추가를 완료하면 game스크린을 불러온다
		}
		return playerName;
	}

//새로운 게임을 시작하는데 아이디를 입력한다
//입력하는 아이디가 저장이 되어있으면 점수를 불러오고 
//값이 null이라면 그아이디가 새로운 아이디가 된다
//이명령어는 로드게임에서 파일명을 확인하고 익셉션이 발생하면 newGame을 호출하는 방식으로 진행된다
	private void newGame() {
		this.gameMainScreen(playerVO.getName());
	}

	private void gameMainScreen(String playerName) {
		// TODO 게임 첫 화면
		playerName = playerVO.getName();
		System.out.println("*".repeat(lineNum));
		System.out.println("*" + "            " + "블랙잭게임" + "            " + "*");
		System.out.println("*".repeat(lineNum));

		if (playerName == null) {
			System.out.println("\n ** 게임을 종료합니다. ** ");
			this.saveGame();
			return;
		}
		while (true) {
			System.out.println("\n현재" + playerName + "님의 재산은" + playerMoney + "원 입니다.");
			System.out.println("\n" + "-".repeat(lineNum));
			System.out.println("게임을 시작하시겠습니까?");
			System.out.println("▷ GO : 게임하기");
			System.out.println("▷ QUIT : 그만하기");
			System.out.println("-".repeat(lineNum));
			System.out.print(" ▷ ");
			String goQuit = scan.nextLine();
			// 게임 선택
			if (goQuit.equals("GO")) {
				this.playScreen();
			}
			// 게임종료 선택
			else if (goQuit.equals("QUIT")) {
				saveGame();
				System.out.println("\n게임을 종료합니다.");
				return;
			}
			// 잘못입력
			else {
				System.out.println("입력은 GO / QUIT 만 가능합니다.");
				continue;
			}

		}

	}

	private void saveGame() { // 저장파트
		System.out.println("게임을 저장합니다");
		while (true) {
			FileWriter fileWriter = null;
			PrintWriter out = null;
			String saveName = playerVO.getName();
			Integer saveMoney = playerVO.getMoney();

			try {
				fileWriter = new FileWriter("src/com/heart/impl/" + saveName + ".txt");
				out = new PrintWriter(fileWriter);

				out.println(saveName + ":" + saveMoney);

				out.flush();
				out.close();
				break;
			} catch (IOException e) {
				// TODO Auto-generated catch block
//			e.printStackTrace();
				System.out.println("저장하는도중에 문제가 발생했습니다");
				continue;
			}
		} // while end
	}

	// setid에 입력했던 player이름을 파일목록에서 로드한다.
	// 만약 목록에 파일이 없으면 ,
	// 익셉션예외처리로 플레이어의 이름을 매개변수로 넣은 newGame을 호출한다
	// 만약 IO익셉션이 발생하면 저장파일이 문제가 잇꺼나 리드하는 상황에 문제가 있으므로
	// 다른 아이디를 입력받도록 한다
	// 이후문제
	private PlayerVO loadGame() {
		String fileName = ("src/com/heart/impl/" + playerName + ".txt");
		FileReader fileReader = null;
		BufferedReader buffer = null;
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			while (true) {
				String reader = buffer.readLine();
				if (reader == null)
					break;
				String[] player = reader.split(":");
				playerVO = new PlayerVO();
				playerVO.setName(player[유저명]);
				playerVO.setMoney(Integer.valueOf(player[저장된점수]));
			} // while end
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			newGame();
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("저장했던 파일에 문제가 있으므로 다른 이름을 입력하세요.");
		}
		return playerVO;
	}
}
