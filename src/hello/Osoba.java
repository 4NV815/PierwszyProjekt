package hello;

import java.time.LocalDate;

public class Osoba {
	private String imię, nazwisko;
	private LocalDate dataUrodzenia;
	
	public Osoba() {	
	}

	public Osoba(String imię, String nazwisko, LocalDate dataUrodzenia) {
		this.imię = imię;
		this.nazwisko = nazwisko;
		this.dataUrodzenia = dataUrodzenia;
	}

	public String getImię() {
		return imię;
	}

	public void setImię(String imię) {
		this.imię = imię;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	
	public LocalDate getDataUrodzenia() {
		return dataUrodzenia;
	}

	public void setDataUrodzenia(LocalDate dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}

	@Override
	public String toString() {
		return "Osoba [imię=" + imię + ", nazwisko=" + nazwisko + ", dataUrodzenia=" + dataUrodzenia + "]";
	}
	
}
