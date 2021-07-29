package pt.iade.homebay.models;

import java.util.Date;

public class VisitaCliente {

    private String nome;
    private Date data;
    private int hora;
    private String c_nome;

    public VisitaCliente(String nome, Date data, int hora, String c_nome) {
        this.nome = nome;
        this.data = data;
        this.hora = hora;
        this.c_nome = c_nome;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public String getC_nome() {
		return c_nome;
	}

	public void setC_nome(String c_nome) {
		this.c_nome = c_nome;
	}

    
}
