package com.solbox.filereader.data;


/**
 * 
 * @author Deok
 * Test에 대한 정보를 명시
 *
 */
public class TestInfo {
	
	// Default Test Info는 아래와 같음
	public static int TEST_LOOP = 5;
	public static int FILE_SIZE_MB = 300;
	public static int CHUNK_SIZE_MB = 1;
	public static int FILE_EA = 35;
	public static TestCase TEST_CASE = TestCase.SEQUENTIAL;
	public static String TEST_DIRECTORY = "/stg/solboxtb3/size/300M";
	

	public static String toString(int num) {
		return Integer.toString(num);
	}
	
}
