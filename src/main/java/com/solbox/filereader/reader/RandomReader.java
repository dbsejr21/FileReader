package com.solbox.filereader.reader;


import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import com.solbox.filereader.data.TestInfo;

/**
 * 
 * @author Deok
 * 
 * @Description
 * TestInfo에 정의된 내용을 바탕으로 1개 파일에 대해 Random READ
 * 
 * RandomReader randomReader = new RandomReader();
 * int size = randomReader.readChunkRandomly(파일경로이름, 시작offset);
 *
 */
public class RandomReader {
	
	private int chunkSizeByte;
	private byte[] chunk;
	
	
	public RandomReader() {

		chunkSizeByte = TestInfo.CHUNK_SIZE_BYTE;
		chunk = new byte[chunkSizeByte];
	}


	public int readChunkRandomly(String filePathName, long seekPosition) throws IOException {
		
		File file = new File(filePathName);
		RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
		
		int readSize = 0;
		randomAccessFile.seek(seekPosition * chunkSizeByte);
		readSize = randomAccessFile.read(chunk);
		
		randomAccessFile.close();
		
		return readSize;
	}
	

}
