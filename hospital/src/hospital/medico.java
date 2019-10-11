package hospital;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class medico  implements Identificavel{
	@Id
	private Long id;
	private long crm;
	private String nome;
	private long telefone;
	private String especialidade;

	public long getCrm() {
		return crm;
	}

	public void setCrm(long crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}
}
