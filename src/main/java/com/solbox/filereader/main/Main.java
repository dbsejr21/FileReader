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

		Tester tester = new Tester();
		
		Inputer inputer = new Inputer(); 
		inputer.handle(args);
		
			
		
		tester.runTest();
		
	}
}
