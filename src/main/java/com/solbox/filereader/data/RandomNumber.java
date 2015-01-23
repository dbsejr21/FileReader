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
	private int counter;

	private int[] files;
	private int[] chunks;

	public RandomNumber() {

		min = 1;
		maxForFiles = TestInfo.FILE_EA;
		maxForChunks = (TestInfo.FILE_SIZE_MB / TestInfo.CHUNK_SIZE_MB) - 1;
		counter = (TestInfo.FILE_SIZE_MB / TestInfo.CHUNK_SIZE_MB) * maxForFiles;
		
		files = new int[counter];
		chunks = new int[counter];
		
	}

	private void makeRandomNumber(int[] array, int min, int max, int count) {
		Random random = new Random();
		for (int i = 0; i < count; i++) {
			array[i] = random.nextInt(max) + min;
		}
	}
	
	public int[] getFiles() {
		makeRandomNumber(files, min, maxForFiles, counter);
		return files;
	}

	public int[] getChunks() {
		makeRandomNumber(chunks, min, maxForChunks, counter);
		return chunks;
	}

}
