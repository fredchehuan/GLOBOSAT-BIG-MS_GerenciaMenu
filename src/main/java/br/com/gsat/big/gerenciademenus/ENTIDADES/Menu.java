package br.com.gsat.big.gerenciademenus.ENTIDADES;

import java.io.Serializable;
//import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.PrePersist;
//import javax.persistence.PreUpdate;

import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection="menu")
public class Menu implements Serializable {
	//SERIALIZANDO A CLASSE PARA TRANSPORTE EM REDE
	private static final long serialVersionUID = -5770402180091137703L;
	
	@Id
	private String id;
	private int menuId;
	private String titulo;
	private int menuPai;
	private int posicao;
	private String link;
	private int ativacao;
	private String datetime_criacao;
	private String datetime_ultima_modificacao;
	
	public Menu() {	}
	
	
	
	public Menu(String id, int menuId, String titulo, int menuPai, int posicao, String link, int ativacao,
			String datetime_criacao, String datetime_ultima_modificacao) {
		super();
		this.id = id;
		this.menuId = menuId;
		this.titulo = titulo;
		this.menuPai = menuPai;
		this.posicao = posicao;
		this.link = link;
		this.ativacao = ativacao;
		this.datetime_criacao = datetime_criacao;
		this.datetime_ultima_modificacao = datetime_ultima_modificacao;
	}
	
	



	public Menu(int menuId, String titulo, int menuPai, int posicao, String link, int ativacao) {
		this.menuId = menuId;
		this.titulo = titulo;
		this.menuPai = menuPai;
		this.posicao = posicao;
		this.link = link;
		this.ativacao = ativacao;
	}



	public String getId() {
		return id;
	}

	
	public void setId(String id) {
		this.id = id;
	}

	@Column(name="menu_id", nullable = false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	@Column(name="titulo", nullable = false)
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Column(name="menu_pai", nullable = false)
	public int getMenuPai() {
		return menuPai;
	}

	public void setMenuPai(int menuPai) {
		this.menuPai = menuPai;
	}

	@Column(name="posicao", nullable = false)
	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	@Column(name="link")
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Column(name="ativacao", nullable = false)
	public int isAtivacao() {
		return ativacao;
	}

	public void setAtivacao(int ativacao) {
		this.ativacao = ativacao;
	}

	@Column(name="datetime_cricacao", nullable = false)
	public String getDatetime_criacao() {
		return datetime_criacao;
	}
	
	public void setDatetime_criacao(String datetime_criacao) {
		this.datetime_criacao = datetime_criacao;
	}

	@Column(name="datetime_ultima_modificacao", nullable = false)
	public String getDatetime_ultima_modificacao() {
		return datetime_ultima_modificacao;
	}

	
	public void setDatetime_ultima_modificacao(String datetime_ultima_modificacao) {
		this.datetime_ultima_modificacao = datetime_ultima_modificacao;
	}
	
	/*
	@PreUpdate
	public void preUpdate() {
		datetime_ultima_modificacao = new Date();
	}
	
	@PrePersist
	public void prePersist() {
		final Date atual = new Date();
		datetime_criacao = atual;
		datetime_ultima_modificacao=atual;
	}*/
	
	

	@Override
	public String toString() {
		return "Menu [id=" + id + ", menuId=" + menuId + ", titulo=" + titulo + ", menuPai=" + menuPai + ", posicao="
				+ posicao + ", link=" + link + ", ativacao=" + ativacao + ", datetime_criacao=" + datetime_criacao
				+ ", datetime_ultima_modificacao=" + datetime_ultima_modificacao + "]";
	}
	
	
	
	
	
	
	
	/*@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return menuId;
	}*/
	
	
	

}
