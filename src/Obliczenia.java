
public class Obliczenia {
	private int liczba;

	public int getLiczba() {
		return liczba;
	}

	public void setLiczba(int liczba) {
		this.liczba = liczba;
	}

	public Obliczenia(int liczba) {
		this.liczba = liczba;
	}
	
	public void funkcja() {
		int licznik = 0;
		int i = 1;
		
		while(i <= liczba) {
			if(liczba % i == 0) {
				licznik++;
			}
			i++;
		}
		if(licznik == 2) {
			System.out.println(liczba + " jest liczba pierwsza.");
		}else {
			System.out.println(liczba + " nie jest liczba pierwsza.");
		}
	}
}
