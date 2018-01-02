import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Podaj liczbe by sprawdzic czy jest liczba pierwsza.");

		int liczba = in.nextInt();

		in.close();

		Obliczenia obl = new Obliczenia(liczba);

		obl.funkcja();
	}
}
