package Exercio02;

import java.util.Scanner;

public class Aluguel {

	private String dataRetirada, marca, modelo;
	private Condutor condutor;
	private int qtdDiasAluguel;
	private double valorDiarioAluguel;
	
	public Aluguel() {
		
	}

	public Aluguel(Condutor condutor, String dataRetirada, String marca, String modelo, int qtdDiasAluguel,
			double valorDiarioAluguel) {
		super();
		this.condutor = condutor;
		this.dataRetirada = dataRetirada;
		this.marca = marca;
		this.modelo = modelo;
		this.qtdDiasAluguel = qtdDiasAluguel;
		this.valorDiarioAluguel = valorDiarioAluguel;

	}

	public Condutor getCondutor() {
		return condutor;
	}

	public void setCondutor(Condutor condutor) {
		this.condutor = condutor;
	}

	public String getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(String dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQtdDiasAluguel() {
		return qtdDiasAluguel;
	}

	public void setQtdDiasAluguel(int qtdDiasAluguel) {
		this.qtdDiasAluguel = qtdDiasAluguel;
	}

	public double getValorDiarioAluguel() {
		return valorDiarioAluguel;
	}

	public void setValorDiarioAluguel(double valorDiarioAluguel) {
		this.valorDiarioAluguel = valorDiarioAluguel;
	}

	public boolean condutorAptoParaAluguel(Condutor c) {
		if (c.getIdade() >= 18 && c.getTipoHabilitacao().equalsIgnoreCase("B") && c.isPossuiHabilitacao() == true) {
			return true;

		} else {
			return false;
		}

	}

	public double calculoValorAluguel(int qtdDias, double valor) {
		
		if(qtdDias >= 10) {
			return (qtdDias * valor) * 0.5;
		}
		return qtdDias * valor;

	}

}
