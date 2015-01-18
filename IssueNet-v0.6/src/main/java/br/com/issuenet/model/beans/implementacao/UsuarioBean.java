package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="usuario")
@Table(name="usuario", schema="puc")
public class UsuarioBean implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="id_usuario")
	protected int idUsuario;
	
	@Column(name="nome")
	protected String nome;
	
	@Column(name="matricula")
	protected String matricula;
	
	@Column (name="email")
	protected String email; 
	
	@Column (name="senha")
	protected String senha; 
	
	@Column (name="perfil")
	protected String perfil;
	
	/*Metodo construtor padrao*/
	
	public UsuarioBean() 
	{
		System.out.println("[UsuarioBean][construtor] - Instanciando bean " + this.getClass().getSimpleName() + " .");
	}
	//
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/*Metodos de acesso*/
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
/*	public String getSenhaEncriptada() {
		return senhaEncriptada;
	}
	public void setSenhaEncriptada(String senhaEncriptada) {
		this.senhaEncriptada = senhaEncriptada;
	}*/
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
}
