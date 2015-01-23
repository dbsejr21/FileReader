package com.solbox.filereader.reader;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class RandomReaderTest {
	
	private RandomReader randomReader;
	
	@Before
	public void setup() {
		randomReader = new RandomReader();

	}
	
	@Test
	public void readChunkRandomlyTest_시작Offset에서_시작하여_Chunk만큼_READ한다() throws IOException {
		int size = randomReader.readChunkRandomly("그린웨어기능시연_140411_2.mp4", 10023);
		System.out.println(size);
	}

}
