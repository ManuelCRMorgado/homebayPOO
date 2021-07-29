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
@Table(name="visita")
public class Visita {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="V_id")
    private int id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name="V_Data")
    private Date data;

    @Column(name="V_hora")
    private int hora;

    @Column(name="C_Id")
    private int cId;

    @Column(name="IM_Id")
    private int imId;

    public Visita() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public int getImId() {
		return imId;
	}

	public void setImId(int imId) {
		this.imId = imId;
	}

    
}
