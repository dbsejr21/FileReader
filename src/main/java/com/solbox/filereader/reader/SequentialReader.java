package com.solbox.filereader.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.solbox.filereader.data.TestInfo;

/**
 * 
 * @author Deok
 * 
 * @Description
 * TestInfo에 정의된 내용을 바탕으로 1개 파일에 대해 Sequential READ
 * 
 * @Usage
 * SequentialReader sequentialReader = new SequentialReader();
 * int size = sequentialReader.readSequentialy(파일경로이름);
 *
 */
public class SequentialReader {
	
	private int chunkSizeByte;
	private byte[] chunk;
	
	
	public SequentialReader () {
		
		chunkSizeByte = TestInfo.CHUNK_SIZE_BYTE;
		chunk = new byte[chunkSizeByte];
	}
	
	public int readSequentialy(String filePathName) throws IOException{
		File file = new File(filePathName);
		FileInputStream fileInputStream = new FileInputStream(file);
		
		int readSize = 0;
		int totalSize = 0; 
		
		while ( (readSize = fileInputStream.read(chunk) ) != -1) {
			totalSize += readSize;
		}
		
		fileInputStream.close();
		
		return totalSize;
	}
	
}
