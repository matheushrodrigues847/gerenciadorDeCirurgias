package br.com.matheus.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Banco {
	
	public static List<Cirurgia> cirurgias = new ArrayList<Cirurgia>();
	public static int id = 1;
	
	
	
	static {
		Cirurgia cirurgia1 = new Cirurgia();
		cirurgia1.setData(LocalDate.now());
		cirurgia1.setConvenio("unimed");
		cirurgia1.setHospital("Nasr faiad");
		cirurgia1.setMedico("Lajovic");
		cirurgia1.setPaciente("fulano da silva");
		cirurgia1.setProcedimento("craniotomia");
		cirurgia1.setId(Banco.id++);
		
		Banco.cirurgias.add(cirurgia1);
	}
	
	
	public List<Cirurgia> listar(){
		return Banco.cirurgias;
	}
	
	public Cirurgia retornaCirurgiaEspecifica(int id) {
		Optional<Cirurgia> cirurgia = cirurgias.stream().filter(c -> c.getId() == id).findAny();
		
		return cirurgia.get();
	}
	
	public void deletarCirurgia(int id) {
		cirurgias.removeIf(c -> c.getId() == id);
	}
	
	public void adicionar(Cirurgia c) {
		c.setId(Banco.id++);;
		Banco.cirurgias.add(c);
	}
	
	

}
