package com.solbox.filereader.main;

import java.io.IOException;

import com.solbox.filereader.data.TestCase;
import com.solbox.filereader.tester.Tester;

/**
 * 
 * @author Deok
 * 
 * @Description
 * FileReader 메인
 * 
 *  
 */
public class Main {
	public static void main(String[] args) throws IOException {

		Tester tester = null;
		
		if ( args[0].equals("Sequential") ) {
			tester = new Tester(TestCase.SEQUENTIAL);
		} else if (args[0].equals("Random")) {
			tester = new Tester(TestCase.RANDOM);
		} else {
			System.out.println("터미널에서 아래명령 입력");
			System.out.println("java -jar FileReader.jar <Sequential | Random>");
			System.exit(-1);
		}
		
		tester.runTest();
		
	}
}
