package hello;

import javax.swing.JOptionPane;

public class WczytajOsobe {
	
	public static Osoba nowaOsoba() {
		
		//ta metoda wczytuja nowa osobe na podstawie okna dialogowego
		String imię = JOptionPane.showInputDialog("Jak masz na imię?");
		String nazwisko = JOptionPane.showInputDialog("Jak masz na nazwisko?");
		return new Osoba(imię, nazwisko);
	}

}
