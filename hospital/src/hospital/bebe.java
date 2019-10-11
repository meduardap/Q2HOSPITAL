package hospital;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class bebe  implements Identificavel{
	@Id
	private Long id;
	private String nome;
	private Date datadenascimento;
	private int peso;
	private String nomedamae;
	private String nomedomedico;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDatadenascimento() {
		return datadenascimento;
	}

	public void setDatadenascimento(Date datadenascimento) {
		this.datadenascimento = datadenascimento;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getNomedamae() {
		return nomedamae;
	}

	public void setNomedamae(String nomedamae) {
		this.nomedamae = nomedamae;
	}

	public String getNomedomedico() {
		return nomedomedico;
	}

	public void setNomedomedico(String nomedomedico) {
		this.nomedomedico = nomedomedico;
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
