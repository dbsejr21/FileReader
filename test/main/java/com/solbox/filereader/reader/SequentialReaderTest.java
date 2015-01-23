package com.solbox.filereader.reader;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class SequentialReaderTest {
	
	public SequentialReader sequentialReader;

	@Before
	public void setup() throws IOException {
		sequentialReader = new SequentialReader();
	}

	@Test
	public void readFileTest_READ해온크기가_실제크기와같다() throws IOException {
		int size = sequentialReader.readSequentialy("그린웨어기능시연_140411_2.mp4");
		System.out.println(Integer.toString(size));
	}

}
