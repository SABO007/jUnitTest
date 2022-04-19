package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions j=new jUnitFunctions();
		int result=j.add(2,3);
		assertEquals(5,result);
		
		
		
	}

}
