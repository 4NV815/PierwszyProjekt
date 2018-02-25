package hello;

public class Osoba {
	private String imię, nazwisko;
	
	public Osoba() {	
	}

	public Osoba(String imię, String nazwisko) {
		this.imię = imię;
		this.nazwisko = nazwisko;
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

	@Override
	public String toString() {
		return "Osoba [imię=" + imię + ", nazwisko=" + nazwisko + "]";
	}
	
}
