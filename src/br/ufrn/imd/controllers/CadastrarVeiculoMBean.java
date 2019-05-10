package br.ufrn.imd.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.ufrn.imd.model.Veiculo;

@ManagedBean
@SessionScoped
public class CadastrarVeiculoMBean {

	private Veiculo veiculo;
	private List<Veiculo> veiculos;
	
	public CadastrarVeiculoMBean() {
		this.veiculo = new Veiculo();
		veiculos = new ArrayList();
	}
	
	public String cadastrarVeiculo() {
		veiculos.add(veiculo);
		FacesMessage msg = new FacesMessage("Veículo Cadastrado com sucesso!");
		msg.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance().addMessage("", msg);
		return "/form_veiculo.jsf";
	}
	
	public String entrarCadastro() {
		return "form_veiculo.jsf";
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}
	
	
}
