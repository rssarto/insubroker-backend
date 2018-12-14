package com.insubroker.person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="PERSON")
public class PersonModel {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotBlank(message="Email cannot be null or empty")
	@Email(message="Invalid email address")
	private String login;
	
	@NotBlank(message="Nome cannot be null or empty")
	@Length(min=2, message="Nome needs to have at least 2 characters")
	private String nome;
	
	@NotBlank(message="Senha cannot be null or empty")
	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	private String senha;
	
	public PersonModel() {
	}
	
	public PersonModel(String email, String nome, String senha) {
		super();
		this.login = email;
		this.nome = nome;
		this.senha = senha;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String email) {
		this.login = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return String.format("nome {1}, e-mail {2}, senha {3}", this.nome, this.login, this.senha);
	}
}
