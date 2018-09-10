package br.com.alfa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo", nullable = false, length = 11)
	private Long codigo;
	
	@Column(name = "nome_fantasia", nullable = false, length = 60)
	private String nomeFantasia;
	
	@Column(name = "razao_social", nullable = false, length = 60)
	private String razaoSocial;
	
	@Column(name = "email", nullable = true, length = 60)
	private String email;
	
	@Column(name = "cnpj", nullable = false, length = 18)
	private String cnpj;
	
	@Column(name = "endereco", nullable = true, length = 100)
	private String endereco;
	
	@Column(name = "telefone", nullable = true, length = 20)	
	private String telefone;

	public Empresa() {
	}

	public Empresa(Long codigo, String nomeFantasia, String razaoSocial, String email, String cnpj, String endereco,
			String telefone) {
		this.codigo = codigo;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.email = email;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
