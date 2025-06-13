package ch10;

// p410~412
public class _08_GenericPrinterTest {

	public static void main(String[] args) {
		_08_GenericPrinter<_08_Powder> powderP = new _08_GenericPrinter<_08_Powder>();
		
		powderP.setMaterial(new _08_Powder());
		_08_Powder powder = powderP.getMaterial();
		System.out.println(powderP);
		System.out.println(powder);
		powder.doPrinting();
		
		System.out.println();
		
		_08_GenericPrinter<_08_Plastic> plasticP = new _08_GenericPrinter<_08_Plastic>();
		
		plasticP.setMaterial(new _08_Plastic());
		_08_Plastic plastic = plasticP.getMaterial();
		System.out.println(plasticP);
		System.out.println(plastic);
		plastic.doPrinting();
	}
	
}
