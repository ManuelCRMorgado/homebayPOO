package pt.iade.homebay.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="imovel")
public class Casa {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="IM_id")
    private int id;

    @Column(name="IM_nome")
    private String nome;

    @Column(name="IM_area")
    private String area;

    @Column(name="IM_tipologia")
    private int tipologia;

    @Column(name="IM_preco")
    private int preco;

    @Column(name="IM_M_rua")
    private String mRua;

    @Column(name="IM_M_numero")
    private int mNumero;

    @Column(name="IM_M_cpostal3")
    private String mCPostal3;

    @Column(name="IM_M_cpostal4")
    private String mCPostal4;

    @Column(name="IM_descricao")
    private String descricao;

    @Column(name="AD_id")
    private int adminId;

    @Column(name="A_id")
    private int agenteId;

    public Casa() {}

    

    public String toString() {
        return this.nome + " " + this.id;
    }



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



	public String getArea() {
		return area;
	}



	public void setArea(String area) {
		this.area = area;
	}



	public int getTipologia() {
		return tipologia;
	}



	public void setTipologia(int tipologia) {
		this.tipologia = tipologia;
	}



	public int getPreco() {
		return preco;
	}



	public void setPreco(int preco) {
		this.preco = preco;
	}



	public String getmRua() {
		return mRua;
	}



	public void setmRua(String mRua) {
		this.mRua = mRua;
	}



	public int getmNumero() {
		return mNumero;
	}



	public void setmNumero(int mNumero) {
		this.mNumero = mNumero;
	}



	public String getmCPostal3() {
		return mCPostal3;
	}



	public void setmCPostal3(String mCPostal3) {
		this.mCPostal3 = mCPostal3;
	}



	public String getmCPostal4() {
		return mCPostal4;
	}



	public void setmCPostal4(String mCPostal4) {
		this.mCPostal4 = mCPostal4;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public int getAdminId() {
		return adminId;
	}



	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}



	public int getAgenteId() {
		return agenteId;
	}



	public void setAgenteId(int agenteId) {
		this.agenteId = agenteId;
	}

    // public Casa(int id, String nome, String area, int tipologia, int preco, String mRua, int mNumero, String mCPostal3, String mCPostal4, String descricao, int adminId, int agenteId) {
    //     this.id = id;
    //     this.nome = nome;
    //     this.area = area;
    //     this.tipologia = tipologia;
    //     this.preco = preco;
    //     this.mRua = mRua;
    //     this.mNumero = mNumero;
    //     this.mCPostal3 = mCPostal3;
    //     this.mCPostal4 = mCPostal4;
    //     this.descricao = descricao;
    //     this.adminId = adminId;
    //     this.agenteId = agenteId;
    // }
}