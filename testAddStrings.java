package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		String a="a";
		String b="b";
		jUnitFunctions j=new jUnitFunctions();
		String result2=j.str(a,b);
		assertEquals("ab",result2);
	}

}
