package jUnitTestPackage;

public class jUnitFunctions {
	int x;
	String S;
	public int add(int n1,int n2)
	{
		x=n1+n2;
		System.out.print(x);
		return x;
	}
	public String str(String s1, String s2)
	{
		System.out.print(s1+s2);
		S=s1.concat(s2);
		return S;
	}

}
