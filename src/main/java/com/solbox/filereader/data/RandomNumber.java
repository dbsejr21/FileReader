package com.solbox.filereader.data;

import java.util.Random;

/**
 * 
 * @author Deok 
 * 
 * @Description
 * 파일 단위 난수, 청크 단위 난수 생성
 *
 * @Usage
 * RandomNumber randomNumber = new RandomNumber();
 * int[] files = randomNumber.getFiles();
 * int[] chunks = randomNumber.getChunks();
 */
public class RandomNumber {

	private int min;
	private int maxForFiles;
	private int maxForChunks;
	private int counterForTotalRead;

	private int[] files;
	private int[] chunks;

	public RandomNumber() {

		min = 1;
		maxForFiles = TestInfo.FILE_EA;
		maxForChunks = (TestInfo.FILE_SIZE_BYTE / TestInfo.CHUNK_SIZE_BYTE) - 1;
		counterForTotalRead = (TestInfo.FILE_SIZE_BYTE / TestInfo.CHUNK_SIZE_BYTE) * maxForFiles;
			
		files = new int[counterForTotalRead];
		chunks = new int[counterForTotalRead];
		
	}

	private void makeRandomNumber(int[] array, int min, int max, int count) {
		Random random = new Random();
		for (int i = 0; i < count; i++) {
			array[i] = random.nextInt(max) + min;
		}
	}
	
	public int[] getFiles() {
		makeRandomNumber(files, min, maxForFiles, counterForTotalRead);
		return files;
	}

	public int[] getChunks() {
		makeRandomNumber(chunks, min, maxForChunks, counterForTotalRead);
		return chunks;
	}

}
