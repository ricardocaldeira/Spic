package model;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Lotes {
	
	
	
	private int idLote;
	private String lote;
	private java.sql.Date dataValidade;
	private java.sql.Date dataFabricacao;
	private int produto_idproduto;


	public Lotes() {
		
	}


	public void setIdlote(int idlote) {
		this.idLote = idlote;
	}


	public void setLote(String i) {
		this.lote = i;
	}


	public void setDataValidade(String dataValidade) throws ParseException {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date data = df.parse(dataValidade);
		this.dataValidade =	new java.sql.Date(data.getTime());
	}


	public void setDataFabricacao(String dataFabricacao) throws ParseException {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date data = df.parse(dataFabricacao);
		this.dataFabricacao = new java.sql.Date(data.getTime());
	}
	
	public void setProduto_idproduto(int produto_idproduto){
		
		this.produto_idproduto = produto_idproduto;
		
	}


	public int getIdlote() {
		return idLote;
	}


	public String getLote() {
		return lote;
	}


	public Date getDataValidade() {
		return dataValidade;
	}


	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	
	public int getProduto_idproduto(){
		
			return produto_idproduto;
	}
	
}
