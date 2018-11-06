import java.util.*;
import java.lang.*;
import java.io.*;

public class Test 
{
	public static void main(String args[]) {
	
		System.out.print("----------AND----------\n");
		
		And myAnd = new And();
		
		System.out.print("00 - "+ myAnd.log(0,0) +"\n" );
		System.out.print("01 - "+ myAnd.log(0,1) +"\n");
		System.out.print("10 - "+ myAnd.log(1,0) +"\n");
		System.out.print("11 - "+ myAnd.log(1,1) +"\n");
		
		System.out.print("----------OR----------\n");
		
		Or myOr = new Or();
		
		System.out.print("00 - "+ myOr.log(0,0) +"\n");
		System.out.print("01 - "+ myOr.log(0,1) +"\n");
		System.out.print("10 - "+ myOr.log(1,0) +"\n");
		System.out.print("11 - "+ myOr.log(1,1) +"\n");
		
		System.out.print("----------NAND----------\n");
		
		Nand myNand = new Nand();
		
		System.out.print("00 - "+ myNand.log(0,0) +"\n");
		System.out.print("01 - "+ myNand.log(0,1) +"\n");
		System.out.print("10 - "+ myNand.log(1,0) +"\n");
		System.out.print("11 - "+ myNand.log(1,1) +"\n");
		
		System.out.print("----------NOR----------\n");
		
		Nor myNor = new Nor();
		
		System.out.print("00 - "+ myNor.log(0,0) +"\n");
		System.out.print("01 - "+ myNor.log(0,1) +"\n");
		System.out.print("10 - "+ myNor.log(1,0) +"\n");
		System.out.print("11 - "+ myNor.log(1,1) +"\n");
	
		System.out.print("----------XOR----------\n");
		
		Xor myXor = new Xor();
		
		System.out.print("00 - "+ myXor.log(0,0) +"\n");
		System.out.print("01 - "+ myXor.log(0,1) +"\n");
		System.out.print("10 - "+ myXor.log(1,0) +"\n");
		System.out.print("11 - "+ myXor.log(1,1) +"\n");
		
		System.out.print("----------XNOR----------\n");
		
		Xnor myXnor = new Xnor();
		
		System.out.print("00 - "+ myXnor.log(0,0) +"\n");
		System.out.print("01 - "+ myXnor.log(0,1) +"\n");
		System.out.print("10 - "+ myXnor.log(1,0) +"\n");
		System.out.print("11 - "+ myXnor.log(1,1) +"\n");
		
		
		System.out.print("----------NOT----------\n");
		
		Not myNot = new Not();
		
		System.out.print("0  - "+ myNot.log(0) +"\n");
		System.out.print("1  - "+ myNot.log(1) +"\n");
		
		System.out.print("----------HalfAdder----------\n");
		
		HalfAdder myHalfAdder = new HalfAdder();
		
		System.out.print("00 - s = "+ myHalfAdder.Sum(0,0) + ", Cout = " + myHalfAdder.Cout(0,0) +"\n");
		System.out.print("01 - s = "+ myHalfAdder.Sum(0,1) + ", Cout = " + myHalfAdder.Cout(0,1) +"\n");
		System.out.print("10 - s = "+ myHalfAdder.Sum(1,0) + ", Cout = " + myHalfAdder.Cout(1,0) +"\n");
		System.out.print("11 - s = "+ myHalfAdder.Sum(1,1) + ", Cout = " + myHalfAdder.Cout(1,1) +"\n");
		
		System.out.print("----------FullAdder----------\n");
		
		FullAdder myFullAdder = new FullAdder();
		
		System.out.print("000 - Sum = "+ myFullAdder.Sum(0,0,0) + ", Cout = " + myFullAdder.Cout(0,0,0) +"\n");
		System.out.print("001 - Sum = "+ myFullAdder.Sum(0,0,1) + ", Cout = " + myFullAdder.Cout(0,0,1) +"\n");
		System.out.print("010 - Sum = "+ myFullAdder.Sum(0,1,0) + ", Cout = " + myFullAdder.Cout(0,1,0) +"\n");
		System.out.print("011 - Sum = "+ myFullAdder.Sum(0,1,1) + ", Cout = " + myFullAdder.Cout(0,1,1) +"\n");
		System.out.print("100 - Sum = "+ myFullAdder.Sum(1,0,0) + ", Cout = " + myFullAdder.Cout(1,0,0) +"\n");
		System.out.print("101 - Sum = "+ myFullAdder.Sum(1,0,1) + ", Cout = " + myFullAdder.Cout(1,0,1) +"\n");
		System.out.print("110 - Sum = "+ myFullAdder.Sum(1,1,0) + ", Cout = " + myFullAdder.Cout(1,1,0) +"\n");
		System.out.print("111 - Sum = "+ myFullAdder.Sum(1,1,1) + ", Cout = " + myFullAdder.Cout(1,1,1) +"\n");
		
		System.out.print("----------HalfSubtractor----------\n");
		
		HalfSub myHalfSub = new HalfSub();
		
		System.out.print("00 - Diff = "+ myHalfSub.Sum(0,0) + ", Borr = " + myHalfSub.Cout(0,0) +"\n");
		System.out.print("01 - Diff = "+ myHalfSub.Sum(0,1) + ", Borr = " + myHalfSub.Cout(0,1) +"\n");
		System.out.print("10 - Diff = "+ myHalfSub.Sum(1,0) + ", Borr = " + myHalfSub.Cout(1,0) +"\n");
		System.out.print("11 - Diff = "+ myHalfSub.Sum(1,1) + ", Borr = " + myHalfSub.Cout(1,1) +"\n");
		
		System.out.print("----------FullSubtractor----------\n");
		
		FullSub myFullSub = new FullSub();
		
		System.out.print("000 - Diff = "+ myFullSub.Sum(0,0,0) + ", Borr = " + myFullSub.Cout(0,0,0) +"\n");
		System.out.print("001 - Diff = "+ myFullSub.Sum(0,0,1) + ", Borr = " + myFullSub.Cout(0,0,1) +"\n");
		System.out.print("010 - Diff = "+ myFullSub.Sum(0,1,0) + ", Borr = " + myFullSub.Cout(0,1,0) +"\n");
		System.out.print("011 - Diff = "+ myFullSub.Sum(0,1,1) + ", Borr = " + myFullSub.Cout(0,1,1) +"\n");
		System.out.print("100 - Diff = "+ myFullSub.Sum(1,0,0) + ", Borr = " + myFullSub.Cout(1,0,0) +"\n");
		System.out.print("101 - Diff = "+ myFullSub.Sum(1,0,1) + ", Borr = " + myFullSub.Cout(1,0,1) +"\n");
		System.out.print("110 - Diff = "+ myFullSub.Sum(1,1,0) + ", Borr = " + myFullSub.Cout(1,1,0) +"\n");
		System.out.print("111 - Diff = "+ myFullSub.Sum(1,1,1) + ", Borr = " + myFullSub.Cout(1,1,1) +"\n");
	}
}

class And
{
	int a,b;
	And()
	{
		
	}
	
	int log(int x, int y)
	{
		a = x;
		b = y;
		if(a == 1)
		{
			if(b == 1)
			{
				return 1;
			}
		}
		return 0;
	}
}

class Or 
{
	int a,b;
	Or()
	{
		
	}
	int log(int x, int y)
	{
		a = x;
		b = y;
		if(a+b > 0)
		{
			return 1;
		}
		return 0;
		
	}

}

class Nand 
{
	int a,b;
	Nand()
	{
		
	}
	int log(int x, int y)
	{
		a = x;
		b = y;
		if(a == 0)
		{
			return 1;
		}
		if(b == 0)
		{
			return 1;
		}
		return 0;
		
	}

}

class Nor 
{
	int a,b;
	Nor()
	{
		
	}
	int log(int x, int y)
	{
		a = x;
		b = y;
		if(a == 0)
		{
			if(b == 0)
			{
				return 1;
			}
			
		}
		return 0;
		
	}

}

class Not 
{
	int a;
	Not()
	{
		
	}
	int log(int x)
	{
		a = x;
		if(a == 1)
		{
			return 0;
		}
		return 1;
	}

}

class Xor
{
	int a,b;
	Xor()
	{
		
	}
	int log(int x, int y)
	{
		a = x;
		b = y;
		if(a == b)
		{
			return 0;
		}
		return 1;
		
	}

}

class Xnor
{
	int a,b;
	Xnor()
	{
		
	}
	int log(int x, int y)
	{
		a = x;
		b = y;
		if(a == b)
		{
			return 1;
		}
		return 0;
		
	}

}

class HalfAdder
{
	int s,c;
	HalfAdder()
	{
		
	}
	int Sum(int x, int y)
	{
		Xor myXor = new Xor();
		
		s = myXor.log(x, y);
		
		return s;
	
	
	}
	int Cout(int x, int y)
	{
		And myAnd = new And();
		c = myAnd.log(x, y);
		return c;
	}
}

class FullAdder
{
	int s1,s2,c1,c2,c3;
	FullAdder()
	{
		
	}
	int Sum(int x, int y, int z)
	{
		HalfAdder FirstHalfAdder = new HalfAdder();
		
		s1 = FirstHalfAdder.Sum(x, y);
		
		
		HalfAdder SecondHalfAdder = new HalfAdder();
		
		s2 = SecondHalfAdder.Sum(s1, z);
		
		return s2;
		
	}
	
	int Cout(int x, int y, int z)
	{
		HalfAdder FirstHalfAdder = new HalfAdder();
		
		c1 = FirstHalfAdder.Cout(x, y);
		
		
		HalfAdder SecondHalfAdder = new HalfAdder();
		
		c2 = SecondHalfAdder.Cout(s1, z);
		
		Or myOr = new Or();
		
		c3 = myOr.log(c2,c1);
		
		return c3;
		
	}
}

class HalfSub
{
	int s,c;
	HalfSub()
	{
		
	}
	int Sum(int x, int y)
	{
		Xor myXor = new Xor();
		
		s = myXor.log(x, y);
		
		return s;
	
	
	}
	int Cout(int x, int y)
	{
		Not myNot =  new Not();
		And myAnd = new And();
		c = myAnd.log(myNot.log(x), y);
		return c;
	}
}

class FullSub
{
	int s1,s2,c1,c2,c3;
	FullSub()
	{
		
	}
	int Sum(int x, int y, int z)
	{
		HalfSub FirstHalfSub = new HalfSub();
		
		s1 = FirstHalfSub.Sum(x, y);
		
		
		HalfSub SecondHalfSub = new HalfSub();
		
		s2 = SecondHalfSub.Sum(s1, z);
		
		return s2;
		
	}
	
	int Cout(int x, int y, int z)
	{
		HalfSub FirstHalfSub = new HalfSub();
		
		c1 = FirstHalfSub.Cout(x, y);
		
		
		HalfSub SecondHalfSub = new HalfSub();
		
		Not myNot = new Not();
		
		c2 = SecondHalfSub.Cout(s1, z);
		
		Or myOr = new Or();
		
		c3 = myOr.log(c2,c1);
		
		return c3;
		
	}
}