package teste1;

public class Teste {
	
	public static void main(String[] args) {
		
		Carro c = new Carro();
		Moto m = new Moto();
		
		c.setAno(2018);
		c.setValor(40000.0);
		
		m.setCilindradas(200);
		m.setValor(20000.0);
		
		c.calcIpva();
		m.calcIpva();
		
		System.out.println("O Ano: "+c.getAno());
		System.out.println("O IPVA: R$ "+c.getIpva());
		
		System.out.println("O Cilindradas: "+m.getCilindradas());
		System.out.println("O IPVA: R$ "+m.getIpva());
	}

}
