package com.solbox.filereader.tester;

import java.io.File;
import java.io.IOException;

import com.solbox.filereader.data.RandomNumber;
import com.solbox.filereader.data.TestCase;
import com.solbox.filereader.data.TestInfo;
import com.solbox.filereader.reader.RandomReader;
import com.solbox.filereader.reader.SequentialReader;

/**
 * 
 * @author Deok reader를 사용하여 모드에 따라 Sequential / Random READ 테스트 수행
 * 
 * @Description runTestCaseSequential() 설명: 디렉토리내 모든 파일에 대해 파일 1개씩 청크 크기(1MB)
 *              단위로 Sequential하게 READ함. 반복횟수=파일개수 runTestCaseRandom() 설명: 디렉토리내
 *              모든 파일에 대해 랜덤하게 파일 1개를 pick하고 랜덤한 offset부터 청크 크기(1MB) 만큼을 READ함.
 *              반복횟수=(파일크기/청크크기)*파일개수
 * 
 */
public class Tester {

	private TestCase testCase;
	private File directory;
	private File[] listFile;

	public Tester() {
		this.testCase = TestInfo.TEST_CASE;
		directory = new File(TestInfo.TEST_DIRECTORY);
		listFile = directory.listFiles();
	}


	public void runTest() throws IOException {

		String description = TestInfo.toString(TestInfo.FILE_SIZE_MB)
				+ "MB 파일 " + TestInfo.toString(TestInfo.FILE_EA) + "개에 대해 "
				+ TestInfo.toString(TestInfo.CHUNK_SIZE_KB) + "KB 청크 단위로 "
				+ testCase.toString() + " READ 테스트";

		System.out.println(description);

		if (testCase == TestCase.SEQUENTIAL) {

			runTestCaseSequential();

		} else if (testCase == TestCase.RANDOM) {

			runTestCaseRandom();
		}
	}

	private void runTestCaseRandom() throws IOException {

		RandomNumber randomNumber = new RandomNumber();
		RandomReader randomReader = new RandomReader();
		
		String fullPath;

		int[] files = randomNumber.getFiles();
		int[] chunks = randomNumber.getChunks();
				
		for (int i = 0; i < files.length; i++) {
			fullPath = TestInfo.TEST_DIRECTORY + "/" + "test_" + TestInfo.FILE_SIZE_MB + "M_" + files[i] + ".avi";
			int size = randomReader.readChunkRandomly(fullPath, chunks[i]);
		}
	}

	private void runTestCaseSequential() throws IOException {
		SequentialReader sequentialReader = new SequentialReader();
		for (File file : listFile) {
			if (file.isFile()) {
				int size = sequentialReader.readSequentialy(file.getPath());
			}
		}
	}

}
