package OOPS;

public class FractionUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(20,1);
		f1.print();
		
		Fraction f2 = new Fraction(40,20);
		//f2.setdenominator(2);
		f2.print();
		
		Fraction f3= new Fraction(10,20);
		f3.add(f2);
		f3.print(); 
		
		Fraction f4= new Fraction(40,50);
        Fraction f5=Fraction.add(f2,f3);
        f5.print();
		
	}

}
