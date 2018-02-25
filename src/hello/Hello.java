package hello;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Druga linia");
		
		Osoba osoba = new Osoba("Ala", "Kowalska");
		System.out.println(osoba);
		
		Osoba druga = WczytajOsobe.nowaOsoba();
		System.out.println("Druga osoba to: " + druga);
	}

}
