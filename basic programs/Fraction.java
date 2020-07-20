package OOPS;

public class Fraction {

	private int numerator;
	private int denominator;
	Fraction(int numerator,int denominator)
	{
		if(denominator==0)
		{
			throw new ArithmeticException("Denominator must be Non-Zero") ;
		}
		simplify(numerator,denominator);
		
	}
	public int getnumerator()
	{
		return numerator;
	}
	public int getdenominator()
	{
		return denominator;
		
	}
	public void setnumerator(int numerator)
	{
		
		this.numerator=numerator;
		this.simplify(this.numerator,denominator);
	}
	public void setdenominator(int denominator)
	{
		if(denominator==0)
		{
			throw new ArithmeticException("denominator must be  Non-zero");
		}
		this.denominator=denominator;
		this.simplify(numerator,this.denominator);
	}
	private void simplify(int numerator, int denominator)
	{
		int gcd=1;
		int smallest= Math.min(numerator, denominator);
		for(int i=2;i<=smallest;i++)
		{
			if(numerator%i==0&&denominator%i==0)
			{
				gcd=i;
			}
		}
		this.numerator=numerator/gcd;
		this.denominator=denominator/gcd;
		
		
	}
	public void print()
	{
		if(denominator==1)
		{
		System.out.println(numerator);	
		}
		else
		{
		System.out.println(numerator+"/"+denominator);
		}
	}
	public Fraction add(Fraction f)
	{
		this.numerator= this.numerator*f.denominator + this.denominator*f.numerator;
		this.denominator=this.denominator*f.denominator;
		this.simplify(numerator,denominator);
		return this;
	}
	public static Fraction add(Fraction f1,Fraction f2)
	{
		int numerator=f1.numerator*f2.denominator + f1.denominator*f2.numerator;
		int denominator=f1.denominator*f2.denominator;
		Fraction f3= new Fraction(numerator,denominator);
		return f3;
	} 
	public  Fraction multiply(Fraction f1, Fraction f2)
	{
		int numerator=f1.numerator*f2.numerator;
		int denominator=f1.denominator*f2.denominator;
		Fraction f4= new Fraction(numerator,denominator);
		return f4;
	}

}
