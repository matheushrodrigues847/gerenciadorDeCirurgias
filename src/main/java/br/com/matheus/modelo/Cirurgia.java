package br.com.matheus.modelo;

import java.time.LocalDate;

public class Cirurgia {
	
	private int id;
	private LocalDate data;
	private String paciente;
	private String medico;
	private String procedimento;
	private String hospital;
	private String convenio;
	
	public Cirurgia() {
		
	}
	
	public Cirurgia(String paciente, String procedimento, String medico) {
		this.paciente = paciente;
		this.procedimento = procedimento;
		this.medico = medico;
	}
	
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	
	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}
	
	public String getPaciente() {
		return paciente;
	}
	
	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}
	
	public String getProcedimento() {
		return procedimento;
	}
	
	public void setMedico(String medico) {
		this.medico = medico;
	}
	
	public String getMedico() {
		return medico;
	}
	
	@Override
	public boolean equals(Object obj) {
		Cirurgia c = (Cirurgia) obj;
		
		if(this.id == c.id) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		
		return "Cirurgia: { nome = " + this.paciente + "\nhospital = " + this.hospital 
				+ "\nmédico = " + this.medico;
	}

}
