package Exercio07;

import java.util.List;

public class Sala {
	
	private String registroMec;
	private List<Materia>materia;
	private String idSala;
	private String numero;
	
	public Sala() {
		
	}
	public Sala(String registroMec, List<Materia> materia, String idSala, String numero) {
		
		this.registroMec = registroMec;
		this.materia = materia;
		this.idSala = idSala;
		this.numero = numero;
	}
	public String getRegistroMec() {
		return registroMec;
	}
	public void setRegistroMec(String registroMec) {
		this.registroMec = registroMec;
	}
	public List<Materia> getMateria() {
		return materia;
	}
	public void setMateria(List<Materia> materia) {
		this.materia = materia;
	}
	public String getIdSala() {
		return idSala;
	}
	public void setIdSala(String idSala) {
		this.idSala = idSala;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	

}
