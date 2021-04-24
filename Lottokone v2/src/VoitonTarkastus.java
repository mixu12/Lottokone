
public class VoitonTarkastus {
	private Boolean tulikoVoitto;
	
	public VoitonTarkastus() {
		tulikoVoitto = false;
	}
	
	public Boolean tarkastaVoitto(Lottokone kone, Lottorivi rivi) {
		tulikoVoitto = true;
		for (int i = 0; i < rivi.getLottorivi().size(); i++) {
			Numero omaNumero = rivi.getLottorivi().get(i);
			
			if (kone.getArvotutNumerot().contains(omaNumero)) {
				continue;
		
			} else {
				tulikoVoitto = false;
				break;
			}
		}
		
		return tulikoVoitto;
	}
	
	
	public Boolean getTulos() {
		return tulikoVoitto;
	}
	
}
