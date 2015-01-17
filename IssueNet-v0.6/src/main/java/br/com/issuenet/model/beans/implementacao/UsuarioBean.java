package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="usuario")
@Table(name="usuario",schema="puc")
public abstract class UsuarioBean implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_usuario", insertable=true, updatable=false)
	protected int idUsuario;
	@Column(name="nome", nullable=false, length=120, unique=true, updatable=true, insertable=true)
	protected String nome;
	@Column(name="matricula", insertable=true, updatable=false, nullable=true, unique=true, length=12)
	protected String matricula;
	@Column (name="email", insertable=true, updatable=true, nullable=false, length=150)
	protected String email; 
	protected String senha; // campo para receber a senha da tela e validar o tamanho e a composição da senha
	protected String senhaEncriptada; // campo a ser persistido após encriptação com algorítmo SHA256
	protected String perfil;
	/*Método construtor padrão*/
	
	public UsuarioBean() 
	{
		System.out.println("[UsuarioBean][construtor] - Instanciando bean " + this.getClass().getSimpleName() + " .");
	}
	//
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/*Métodos de acesso*/
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
	public String getSenhaEncriptada() {
		return senhaEncriptada;
	}
	public void setSenhaEncriptada(String senhaEncriptada) {
		this.senhaEncriptada = senhaEncriptada;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
}
