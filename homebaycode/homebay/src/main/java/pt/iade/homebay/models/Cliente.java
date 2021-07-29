package pt.iade.homebay.models;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="C_id")
    private int id;

    @Column(name="C_nome")
    private String nome;

    @Column(name="C_email")
    private String email;

    @Column(name="C_telefone")
    private String telefone;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name="C_dnascimento")
    private Date dataNascimento;
    
    @Column(name="C_nif")
    private String nif;

    public Cliente() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	
}
