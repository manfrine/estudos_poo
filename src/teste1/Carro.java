package teste1;

public class Carro {
	
	private String modelo;
	private String marca;
	private Integer ano;
	private Double valor;
	private Double ipva;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getIpva() {
		return ipva;
	}
	public void setIpva(Double ipva) {
		this.ipva = ipva;
	}
	
	public void calcIpva() {
		if(ano < 2010)
			ipva = valor*2/100;
		else if(ano < 2015)
			ipva = valor*3/100;
		else if(ano < 2018)
			ipva = valor*4/100;
		else
			ipva = valor*2/100;
	}
	
	
	
	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + "]";
	}
	
	
	

}
