package entities;

public class Funcionario {
			
	protected String name;
	protected Integer horas;
	protected Double valorPorHora;
	
	
	
	public Funcionario() {}



	public Funcionario(String name, Integer horas, Double valorPorHora) {
		this.name = name;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}
	
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getHoras() {
		return horas;
	}



	public void setHoras(Integer horas) {
		this.horas = horas;
	}



	public Double getValorPorHora() {
		return valorPorHora;
	}


	public Double pagamento() {
		return horas * valorPorHora;
		
	}



	
	public String toString() {
		return "Name=" + name + ",\nhoras=  " + horas + ", \nvalorPorHora=  " + valorPorHora ;
	}
	
	
	public String mensagem() {
		return "PAGAMENTO  " + name + "  R$" + pagamento();
	}
		
	
	}
	