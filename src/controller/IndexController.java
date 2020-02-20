package controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named("indexController")
public class IndexController implements Serializable {

	private static final long serialVersionUID = -2701110827897445334L;
	private String nome;
	private String email;
	private String mensagem;
	

	public void receberMensagem() {
		String envio = "A pessoa: " +nome+ ", com o email: " +email+ ", Mandou a seguinte mensagem: " +mensagem;
		System.out.println(envio);
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

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
