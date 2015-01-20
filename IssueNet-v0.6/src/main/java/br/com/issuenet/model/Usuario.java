package br.com.issuenet.model;

import br.com.issuenet.model.beans.implementacao.UsuarioBean;


public class Usuario {

	private UsuarioBean usuarioBean;
	
	private int idUsuario;

	private String nome;

	private String matricula;

	private String email; 

	private String senha; 

	private String perfil;

	private IComportamentoResolvedor comportamentoResolvedor;

	private IComportamentoGerenciador comportamentoGerenciador;

	
	
	public Usuario(){};
	
	public Usuario(UsuarioBean usuarioBean){
		this.usuarioBean = usuarioBean;
		this.idUsuario = usuarioBean.getIdUsuario();
		this.nome = usuarioBean.getNome();
		this.matricula = usuarioBean.getMatricula();
		this.email = usuarioBean.getEmail();
		this.senha = usuarioBean.getSenha();
		this.perfil = usuarioBean.getPerfil();
		if(usuarioBean.getComportamentoGerenciador().equals("PodeGerenciar")){
			this.comportamentoGerenciador = new PodeGerenciar();
		}else{
			this.comportamentoGerenciador = new NaoPodeGerenciar();
		}
		if(usuarioBean.getComportamentoResolvedor().equals("PodeResolverTarefa")){
			this.comportamentoResolvedor = new PodeResolverTarefa();
		}else{
			this.comportamentoResolvedor = new NaoPodeResolverTarefa();
		}
	}
	
	
	public UsuarioBean getUsuarioBean() {
		return usuarioBean;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
		this.usuarioBean.setIdUsuario(idUsuario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		this.usuarioBean.setNome(nome);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
		this.usuarioBean.setMatricula(matricula);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		this.usuarioBean.setEmail(email);
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
		this.usuarioBean.setSenha(senha);
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
		this.usuarioBean.setPerfil(perfil);
	}

	public IComportamentoResolvedor getComportamentoResolvedor() {
		return comportamentoResolvedor;
	}

	public void setComportamentoResolvedor(
			IComportamentoResolvedor comportamentoResolvedor) {
		this.comportamentoResolvedor = comportamentoResolvedor;
		this.usuarioBean.setComportamentoResolvedor(comportamentoResolvedor.getComportamento());
	}

	public IComportamentoGerenciador getComportamentoGerenciador() {
		return comportamentoGerenciador;
	}

	public void setComportamentoGerenciador(
			IComportamentoGerenciador comportamentoGerenciador) {
		this.comportamentoGerenciador = comportamentoGerenciador;
		this.usuarioBean.setComportamentoGerenciador(comportamentoGerenciador.getComportamento());
	}
	
	
}
