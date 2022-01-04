package teste1;

public class Moto extends Carro{

	private Integer cilindradas;

	public Integer getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(Integer cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	public void calcIpva() {
		if(cilindradas <=150)
			setIpva(getValor()*3/100);
		else if(cilindradas <=250)
			setIpva(getValor()*5/100);
		else
			setIpva(getValor()*7/100);
	}
}
