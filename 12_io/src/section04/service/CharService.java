package section04.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharService {

	/* [문자 기반 스트림]
	 * 
	 * - 2byte 문자(char) 단위로 입/출력하는 스트림
	 * 
	 * - 문자만 작성된 파일(txt, bin 등), 
	 *   채팅, JSON, 웹 요청(주소)/응답(HTML) 
	 * 
	 * - 문자 기반 스트림 최상위 인터페이스 : 
	 *   Reader(입력), Writer(출력)
	 */
	
	/** 문자 기반 스트림을 이용한 파일 출력 */
	public void fileOutput1() {
		
		FileWriter fw = null;
		
		try {
			String content = """
					아들아 지구를 부탁하노라
아버지 걱정은 하지마세요
바지 위에 팬티입고 오늘도 난 길을 나서네
아들아 망토는 하고가야지
아뿔싸 어쩐지 허전하더라
파란 타이즈에 빨간 팬티는 내 Charming point
오늘도 달리고 달리고 달리고 달리고
살리고 살리고 살리고 살리고
돌아라 지구 열 두바퀴
올빽머리 근육빵빵 난 슈퍼맨
지구인의 친구 난 슈퍼맨
멋지구나 잘생겼다
대인배의 카라스마 사이즈가 장난아니지
어쨌거나 근육빵빵 난 슈퍼맨
지구인의 친구 난 슈퍼맨
유사품에 주의해요
오각형에 S자야
위아래로 스판100%
아들아 아침은 먹고가야지
아버지 빈 속이 날기 편해요
서울 대전 대구 부산 찍고나서 독도 한바퀴
오늘도 달리고 달리고 달리고 달리고
살리고 살리고 살리고 살리고
돌아라 지구 열 두바퀴
올빽머리 근육빵빵 난 슈퍼맨
지구인의 친구 난 슈퍼맨
멋지구나 잘생겼다
대인배의 카리스마 사이즈가 장난아니지
어쨌거나 근육빵빵 난 슈퍼맨
지구인의 친구 난 슈퍼맨
유사품에 주의해요
오각형애 S자야
위아래로 스판100%
오늘도 달리고 달리고 달리고 달리고
살리고 살리고 살리고 살리고
돌아라 지구 열 두바퀴
올빽머리 근육빵빵 난 슈퍼맨
지구인의 친구 난 슈퍼맨
위기때면 나타난다 밤하늘의 박쥐모양
아참 그건 배트맨이지
어쨌거나 근육빵빵 난 슈퍼맨
지구인의 친구 난 슈퍼맨
위험할땐 불러줘요 언제든지 달려갈게
나는야 정의의 슈퍼맨
					""";
			// 폴더가 없을 경우 생성
			String path = "io_test/char";
			File folder = new File(path);
			if(!folder.exists()) folder.mkdirs();
			
			// 문자 기반 파일 출력 스트림 객체 생성
			fw = new FileWriter(folder + "/" + "애국가1절.txt");
			
			// 문자 기반 스트림을 이용해서 출력하기
			fw.write(content); // String, char[] 출력을 위한 기능이 제공됨
			
			// 스트림에 남은 데이터를 밀어냄
			fw.flush(); // close() 시 자동 수행됨
			
			System.out.println("출력 완료");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw !=null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/** 문자 기반 스트림을 이용한 파일 출력 */
	public void fileOutput2() {
		
		FileWriter fw = null;
		BufferedWriter bw = null; // 버퍼를 이용한 보조 스트림
		
		try {
			String content = """
					아들아 지구를 부탁하노라
아버지 걱정은 하지마세요
바지 위에 팬티입고 오늘도 난 길을 나서네
아들아 망토는 하고가야지
아뿔싸 어쩐지 허전하더라
파란 타이즈에 빨간 팬티는 내 Charming point
오늘도 달리고 달리고 달리고 달리고
살리고 살리고 살리고 살리고
돌아라 지구 열 두바퀴
올빽머리 근육빵빵 난 슈퍼맨
지구인의 친구 난 슈퍼맨
멋지구나 잘생겼다
대인배의 카라스마 사이즈가 장난아니지
어쨌거나 근육빵빵 난 슈퍼맨
지구인의 친구 난 슈퍼맨
유사품에 주의해요
오각형에 S자야
위아래로 스판100%
아들아 아침은 먹고가야지
아버지 빈 속이 날기 편해요
서울 대전 대구 부산 찍고나서 독도 한바퀴
오늘도 달리고 달리고 달리고 달리고
살리고 살리고 살리고 살리고
돌아라 지구 열 두바퀴
올빽머리 근육빵빵 난 슈퍼맨
지구인의 친구 난 슈퍼맨
멋지구나 잘생겼다
대인배의 카리스마 사이즈가 장난아니지
어쨌거나 근육빵빵 난 슈퍼맨
지구인의 친구 난 슈퍼맨
유사품에 주의해요
오각형애 S자야
위아래로 스판100%
오늘도 달리고 달리고 달리고 달리고
살리고 살리고 살리고 살리고
돌아라 지구 열 두바퀴
올빽머리 근육빵빵 난 슈퍼맨
지구인의 친구 난 슈퍼맨
위기때면 나타난다 밤하늘의 박쥐모양
아참 그건 배트맨이지
어쨌거나 근육빵빵 난 슈퍼맨
지구인의 친구 난 슈퍼맨
위험할땐 불러줘요 언제든지 달려갈게
나는야 정의의 슈퍼맨
					""";
			// 폴더가 없을 경우 생성
			String path = "io_test/char";
			File folder = new File(path);
			if(!folder.exists()) folder.mkdirs();
			
			// 문자 기반 파일 출력 스트림 객체 생성
			fw = new FileWriter(folder + "/" + "애국가1절_buffer.txt");
			
			// 보조 스트림 객체 생성
			bw = new BufferedWriter(fw);
			
			// 문자 기반 스트림을 이용해서 출력하기
			bw.write(content); // String, char[] 출력을 위한 기능이 제공됨
			
			// 스트림에 남은 데이터를 밀어냄
			bw.flush(); // close() 시 자동 수행됨
			
			System.out.println("출력 완료");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw !=null) bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 문자 기반 입력 스트림 + 보조 스트림 이용해서 파일 읽어오기
	 */
	public void fileInput() {
		
		/* [try - with - resource]
		 * - 자바 7버전(2011년)에서 추가된 기능
		 * - finally에서 작성하던 close 처리 구문을
		 *   자동으로 수행하도록 만드는 구문
		 */
		String path = "io_test/char/애국가1절.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			// 보조 스트림을 이용해서 파일 내용 읽어오기
			
			StringBuilder sb = new StringBuilder(); // 읽어온 내용 누적
			String temp = null; // 임시 변수 
			
			while(true) {
				temp = br.readLine(); // 한 줄씩 읽어오기
				
				if(temp == null) break; // 읽어온 내용이 없으면 반복 종료
				
				sb.append(temp); // 읽어온 내용 누적(엔터 미포함)
				sb.append("\n"); // 엔터 추가
			}
			
			System.out.println("읽어오기 성공!");
			System.out.println("--------------");
			System.out.println(sb.toString());
			
		}catch (Exception e) {
			e.printStackTrace();		
		}
		// finally에서 close 하던 구문 생략 가능
	}
	
	// Scanner 대신 스트림을 이용한 문자열 입력 받기
	// -> Scanner가 편리하긴 한데 매우 느림!!
	
	// 키보드 입력 -> 바이트(2진수) 코드 입력 -> 문자 변환
	
	public void keyboardInput() {
		
		// System.in : 기본 장치(키보드)와 연결된 InputStream 반환
		
		// InputStreamReader : 바이트 스트림 -> 문자 스트림 변환
		try(BufferedReader br 
				= new BufferedReader( new InputStreamReader(System.in) ) ) {
			
			System.out.println("문자열 입력1 : ");
			String input1 = br.readLine(); // 입력된 한 줄 읽어오기 
			
			System.out.println("문자열 입력2 : ");
			String input2 = br.readLine(); // 입력된 한 줄 읽어오기 
			
			System.out.println("input1 : " + input1);
			System.out.println("input2 : " + input2);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
}