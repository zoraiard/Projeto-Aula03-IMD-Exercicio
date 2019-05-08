package br.ufrn.imd.model;

public class PontoTaxi {
	
		
	private String endereco;
	
	private String horaiorInicio; 
	
	private String horaiorFim;
	
	private Motorista motorista;
	
	
	public PontoTaxi() {
		this.motorista = new Motorista();
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getHoraiorInicio() {
		return horaiorInicio;
	}


	public void setHoraiorInicio(String horaiorInicio) {
		this.horaiorInicio = horaiorInicio;
	}


	public String getHoraiorFim() {
		return horaiorFim;
	}


	public void setHoraiorFim(String horaiorFim) {
		this.horaiorFim = horaiorFim;
	}


	public Motorista getMotorista() {
		return motorista;
	}


	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	
}
