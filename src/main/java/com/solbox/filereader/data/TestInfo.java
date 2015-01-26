package com.solbox.filereader.data;


/**
 * 
 * @author Deok
 * Test에 대한 정보를 명시
 *
 */
public class TestInfo {
	
	// Default Test Info는 아래와 같음
	
	public static int FILE_SIZE_MB = 300;
	public static int FILE_SIZE_KB = FILE_SIZE_MB * 1024;
	public static int FILE_SIZE_BYTE = FILE_SIZE_KB * 1024;
	
	public static int CHUNK_SIZE_MB = 1;
	public static int CHUNK_SIZE_KB = CHUNK_SIZE_MB * 1024;
	public static int CHUNK_SIZE_BYTE = CHUNK_SIZE_KB * 1024;
	
	public static int FILE_EA = 35;
	
	public static TestCase TEST_CASE = TestCase.SEQUENTIAL;
	public static String TEST_DIRECTORY = "/stg/solboxtb3/size/" + FILE_SIZE_MB + "M";
	

	public static String toString(int num) {
		return Integer.toString(num);
	}
	
}
