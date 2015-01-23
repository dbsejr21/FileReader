package com.solbox.filereader.data;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RandomNumberTest {

	private RandomNumber randomNumber;

	@Before
	public void setup() {

		randomNumber = new RandomNumber();

	}

	@Test
	public void getFilesTest_생성한난수갯수와_테스트대상_파일개수_같다() {
//		for (int file : randomNumber.getFiles()) {
//			System.out.println(file);
//		}
		
		int[] files = randomNumber.getFiles();
//		assertTrue(files.length == TestInfo.FILE_EA);
		
		for (int i = 0; i < files.length; i++) {
//			System.out.println(files[i]);
			assertTrue(files[i] <= 35 && files[i] >= 1);
		}
		
		

	}

	@Test
	public void getChunksTest_생성한난수갯수와_파일한개당_전체청크의수가_같다() {
//		for (int chunk : randomNumber.getChunks()) {
//			System.out.println(chunk);
//		}
		
		int[] chunks = randomNumber.getChunks();
		
		for (int i = 0; i < chunks.length; i++) {
//			System.out.println(files[i]);
			assertTrue(chunks[i] <= 10499 && chunks[i] >= 0);
		}
		
		
	}

}
