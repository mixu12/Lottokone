import java.util.ArrayList;
import java.util.Scanner;

public class Lottorivi {
	private ArrayList<Numero> lottorivi;
	private Scanner lukija;
	
	public Lottorivi() {
		lottorivi = new ArrayList<>();
		lukija = new Scanner(System.in);
	}
	
	public void setLottorivi(){
		System.out.println("Anna 7 eri numeroa. Paina jokaisen jälkeen Enter");
		
		while (lottorivi.size() < 7) {
			Numero numero = new Numero(Integer.valueOf(lukija.nextLine()));
				
			if (!lottorivi.contains(numero)) {
				lottorivi.add(numero);
			}
		}
	}
	
	public void tulostaLottorivi() {
		for (int i = 0; i < lottorivi.size(); i++) {
			System.out.println(lottorivi.get(i).getLottonumero());
		}
	}
	
	public ArrayList<Numero> getLottorivi(){
		return lottorivi;
	}
}