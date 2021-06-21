import java.util.Scanner;

class Ksiaznica {
	int strony;
	int przeczytane;
	String tytul;

	void listaKsiazek() { 
		System.out.println(tytul + " " + strony + " stron");
	}
	
	void stronDoPrzeczytania() {
		int stronDoPrzeczytania = strony - przeczytane;
		System.out.println("Pozosta³o do przecztania: " + stronDoPrzeczytania + " stron");
	}
	}

public class CzytanieIStatystyki {
	public static void main(String[] args) {


		Ksiaznica ksiazka1 = new Ksiaznica();
		ksiazka1.strony = 105;
		ksiazka1.tytul = "Cierpienia m³odego Wertera - Johann Wolfgang Goethe";
		ksiazka1.listaKsiazek();

		Ksiaznica ksiazka2 = new Ksiaznica();
		ksiazka2.strony = 156;
		ksiazka2.tytul = "Król ¿ycia - Jan Parandowski";
		ksiazka2.listaKsiazek();

		// nie skonczone
		Scanner inputPrzeczytane = new Scanner(System.in);
		int zmiennaPrzeczytane = inputPrzeczytane.hashCode();
		ksiazka1.przeczytane = zmiennaPrzeczytane;
		
		System.out.println("Witamy w aplikacji 'Ile Czytam'");

		// create scanner object
		Scanner inputDowolnyKlawisz = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		// output the promt
		System.out.println("WprowadŸ dowolny znak by kontytuowaæ:");

		String dowolnyklawisz = inputDowolnyKlawisz.next();

		// give back user's input
		System.out.println("Nacisn¹³eœ: " + dowolnyklawisz + "\n" + "£¹czenie z serwerem...");

		for (int i = 3; i > 0; i--) {
			System.out.println(i);
		}
		
		System.out.println("Zosta³eœ po³¹czony z serwerem. \nWybierz ksi¹¿kê: a) lub b)");
		
		String wybierzLitere = input2.next();
		
		System.out.println("Wybra³eœ ksi¹¿kê: " + wybierzLitere);
	
		
		
		/*
		 * System.out.println("a) " + user2.znaki + " " + user2.liczba);
		 * user2.latDoEmerytury(); System.out.println("b) " + user1.znaki + " " +
		 * user1.liczba); user1.latDoEmerytury(); // cos mi ta petla nie dziala String
		 * opcja1 = "a";
		 * 
		 * do { System.out.println("wpisz literê"); opcja1 = input2.next(); } while
		 * (opcja1 != "a");
		 * 
		 * System.out.println("Proszê czekaæ.");
		 */
	}
}
