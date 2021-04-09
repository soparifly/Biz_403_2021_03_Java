package com.callor.app.service.impl;


/*
 * V2는 V1을 상속받고
 * V3는 V2를 상속받고
 * V3는 V1을 상속받고 V2의 재정의 된 inputNum()를 상속받는 효과가 있다.
 * 
 * 
 *즉, V3는 V1에 구현된 객체,변수, 메서드 를 모두 그대로 물려받으면서
 *V2에서 새롭게 작성한 inputNum()를 상속받아서 사용하고있다.
 */
public class ScoreServiceImplV3	extends ScoreServiceImplV2 {

}
