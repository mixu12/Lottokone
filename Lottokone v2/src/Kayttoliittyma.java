
public class Kayttoliittyma {

	public static void main(String[] args) {
		Lottokone kone = new Lottokone();
		
		Lottorivi rivi = new Lottorivi();
		rivi.setLottorivi();
		
		VoitonTarkastus tarkastus = new VoitonTarkastus();
		
		int arvontakerrat = 0;
		System.out.println("Aloitetaan arvonta");
		while (tarkastus.getTulos() == false) {
			kone.arvoNumerot();
			tarkastus.tarkastaVoitto(kone, rivi);
	
			arvontakerrat++;
		}
		
		System.out.println("Jotta valitsemasi rivi saatiin, piti arvonta suorittaa " + arvontakerrat + " kertaa.");
		
	}

}
