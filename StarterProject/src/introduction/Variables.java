package introduction;

public class Variables {

	public static void main(String[] args) {
		
		// Deklaracija promenljive
		double firstNumber;
		
		// Inicijalizacija promenljive (dodela vrednosti)
		firstNumber=1;
		
		double secondNumber = 5;
		
		double doubleResult = firstNumber/secondNumber;
		System.out.println(doubleResult);
		
		int result = (int) (firstNumber/secondNumber);
		System.out.println(result);
		
		boolean alwaysTrue = true;
		boolean alwaysFalse = false;
		
		// Logicki operatori
		// Konjunkcija (AND)
		System.out.println(alwaysTrue && alwaysFalse); //false
		// Disjunkcija (OR)
		System.out.println(alwaysTrue || alwaysFalse); //true
		// Negacija
		System.out.println(!alwaysTrue); // false
		
		// Konkatenacija (spajanje) Stringova
		String name = "Petar";
		String lastName = "Petrovic";
		System.out.println(name + " " + lastName + " Njegos");
		 
		// Faktorijel broja 5
		
		int factoriel = 1;
		
		for(int i = 5; i>0; i--) 
		{
			factoriel = factoriel * i;
			//factoriel *= i;
		}
		System.out.println("Faktorijel broja 5 je: " + factoriel);
		
		// Neparni brojevi od 1 do 10
		
		for(int i = 1; i <= 10; i++)
		{
			if(i%2 != 0)
				System.out.println(i);
		}
		
		
		
	}

}
