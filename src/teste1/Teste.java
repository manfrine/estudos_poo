package teste1;

public class Teste {
	
	public static void main(String[] args) {
		
		Carro c = new Carro();
		
		c.setAno(2018);
		c.setValor(40000.0);
		
		c.calcIpva();
		
		System.out.println("O Ano: "+c.getAno());
		System.out.println("O IPVA: R$ "+c.getIpva());
	}

}
