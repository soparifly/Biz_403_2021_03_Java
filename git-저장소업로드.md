#git repository(저장소) 업로드 하기
## 원격저장소
* http://github.com/soparifly/프로젝트.git
* github.com 의 생성한 repository

## local 프로젝트
* c:/bizworks/javaworks

## local 저장소
* local 프로젝트를 local 저장소로 설정

##git-hub 저장소 생성
1. http://github.com/soparifly/ 접속
2. github 로그인
3. New repository 생성
4. soparifly/Biz_403_2021_03_Java 이름 지정하고 create

##local 저장소 설정(생성)
* local 프로젝트 폴더를 local 저장소로 설정하기
1. C:/bizworks/javaworks 플더에서 git bash 실행
-bash shell 화면 생성, window cmd창과 유사 

2. local 저장소 선언
- git init

3. local 저장소를 github 계정과 연결
* git config --local user.name soparifly
* git config --local user.email soparifly@naver.com

4. local 프로젝트 압축 준비
* 압축금지 파일 설정
* touch .gitignore 로 파일생성
* .gitignore 파일을 sublime text로 열어서 압축금지 파일 정보 등록
5. local 프로젝트를 압축하여 local 저장소에 옮길 준비를 하라
* git add .
6. local 저장소에 옮겨라
* got commit -m "comment"

7. local 저장소애 있는 파일들을 원격 저장소로 업로드 하라
* git push http://github.com/soparifly/Biz_403_2021_Java.git master 입력 엔터

##git local 저장소 설정
* git init 
* git config --local user.name soparifly
* git config --local user.email soparifly@naver.com
* git add .
* git commit -m "처음"
* git push https://github.com/soparifly/Biz_403_2021_03_Java.git master

##원격 저장소와 연결된 프로젝트에 새로운 코드 추가하기 :unamused:
* git add .
* git commit -m "Hello_02 추가"
* git push https://github.com/soparifly/Biz_403_2021_03_Java.git master

## 원격 저장소 주소를 단축하여 입력하기
1. 원격 저장소 주소를 별명으로 설정하기
* git remote add orgin https://github.com/soparifly/Biz_403_2021_03_Java.git