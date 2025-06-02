package entities;

public class FuncionarioTerceirizado extends Funcionario {

	 private Double adicional;

	public FuncionarioTerceirizado(String name, Integer horas, Double valorPorHora, Double adicional) {
		super(name, horas, valorPorHora);
		this.adicional = adicional;
	}
	 
	@Override
	public Double pagamento() {
		return super.pagamento() + adicional * 1.10;
		
	}

	@Override
	public String toString() {
		return ("Nome: " + name +  
				"\nHoras: " + horas +
				"\nValor por Hora: "	+ valorPorHora +
				"\nAdicional: " + adicional);
	}
	@Override
	public String mensagem() {
		return "PAGAMENTO" + name + "  R$" + pagamento();
	}
}


	

	 
	
