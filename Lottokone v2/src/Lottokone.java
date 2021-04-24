import java.util.ArrayList;
import java.util.Random;

public class Lottokone {
	private ArrayList<Numero> arvotutNumerot;
	private Random random;
	
	public Lottokone() {
		arvotutNumerot = new ArrayList<>();
		random = new Random();
	}
	
	public void arvoNumerot() {
		arvotutNumerot.clear();
		while (arvotutNumerot.size() < 7) {
			int arvottuNumero = random.nextInt(40) + 1;
			
			Numero numero = new Numero(arvottuNumero);
			if (!arvotutNumerot.contains(numero)) {
				arvotutNumerot.add(numero);
			}
		}
	}
	
	public void tulostaNumerot() {
		for (int i = 0; i < arvotutNumerot.size(); i++) {
			System.out.println(arvotutNumerot.get(i).getLottonumero());
		}
	}
	
	public ArrayList<Numero> getArvotutNumerot(){
		return arvotutNumerot;
	}
}
