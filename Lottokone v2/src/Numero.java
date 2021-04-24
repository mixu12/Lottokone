
public class Numero {
	private int lottonumero;

	public Numero(int lottonumero) {
		this.lottonumero = lottonumero;
	} 
	
	public int getLottonumero() {
		return this.lottonumero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lottonumero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Numero other = (Numero) obj;
		if (lottonumero != other.lottonumero)
			return false;
		return true;
	}
	
	public String toString() {
		return String.valueOf(this.lottonumero);
	}
	
}
