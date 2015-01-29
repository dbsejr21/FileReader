package com.solbox.filereader.main;

import com.solbox.filereader.data.TestCase;
import com.solbox.filereader.data.TestInfo;

public class Inputer {

	public Inputer() {

	}

	/**
	 * 
	 * @param args
	 * 
	 * 메인 매개변수 받아서 TestInfo에 저장.
	 * FILE_SIZE가 1일 경우 Chunk Size를 256KB로 함. (다른 테스트의 경우 1MB 디폴트)
	 * 
	 * 
	 */
	public void handle(String[] args) {
		
		/*
		 * 매개변수 체크
		 */
		checkArgs(args);

		/*
		 * TEST_CASE 설정
		 */
		if (args[0].equals("Sequential")) {
			TestInfo.TEST_CASE = TestCase.SEQUENTIAL;

		} else if (args[0].equals("Random")) {
			TestInfo.TEST_CASE = TestCase.RANDOM;

		}

		/*
		 * FILE_SIZE 설정
		 */
		TestInfo.setFileSizeMB(Integer.parseInt(args[1]));

		/*
		 * CHUNK_SIZE 설정
		 */
		if (TestInfo.FILE_SIZE_MB == 1) {
			TestInfo.setChunkSizeKB(256);
		}
		
		/*
		 * FILE_EA 설정
		 */
		TestInfo.FILE_EA = Integer.parseInt(args[2]);

	}

	private void checkArgs(String[] args) {

		if (args.length != 3) {
			System.out.println("터미널에서 아래명령 입력");
			System.out
					.println("java -jar FileReader.jar <Sequential | Random> <FILE_SZIE_MB> <FILE_EA>");
			System.exit(-1);
		}
	}

}
