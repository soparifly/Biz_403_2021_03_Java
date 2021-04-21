package com.callor.app.model;

import java.util.List;
import java.util.Random;

public class DeckServiceV1 {

	
	protected List<DeckVO> deckList;
	String strSuit = "다이아◆:하트♡:스페♠:클로♤";
	String strDenomi = "A23456789KQJ";
	
	
	public DeckVO getDeck() {
		Random rnd = new Random();
		int nSize = deckList.size();
		int deckIndex = rnd.nextInt(nSize);
		
		DeckVO retDeckVO = deckList.get(deckIndex);
		deckList.remove(deckIndex);
		
		return retDeckVO;
	}
	public void makeDeck() {
		String[] denoms = strDenomi.split("");
		String[] suits =strSuit.split(":");

		
		//4번 반복
		for (String suit: suits ){
			for(String denom : denoms) {
				Integer intValue = 0;
				try {
					intValue = Integer.valueOf(denom);
					if(intValue ==0) intValue = 10;
				} catch (NumberFormatException e) {
					// TODO denom 문자열이 A,K,Q,J 인경우 익셉션이 발생함
//					e.printStackTrace();
					if(denom.equals("A")) intValue = 0;
					else intValue = 10;
					
				}
				DeckVO deckVO = new DeckVO();
				deckVO.setSuit(suit);
				deckVO.setDenomiation(denom);
				deckVO.setValue(intValue);
				deckList.add(deckVO);
			}
		}
	}
}
