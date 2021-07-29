package pt.iade.homebay.controllers;

import pt.iade.homebay.models.Cliente;
import pt.iade.homebay.models.Visita;

public class RequestWrapper {
    Cliente cliente;
    Visita visita;
	
	}
	public Visita getVisita() {
		return visita;
	}
	public void setVisita(Visita visita) {
		this.visita = visita;
	}
    
    public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
}
