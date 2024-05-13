package br.edu.fatec.application;

import br.edu.fatec.application.model.Departamento;
import br.edu.fatec.application.model.Funcionario;
import br.edu.fatec.application.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) {

		Departamento departamento1 = new Departamento();
		departamento1.setNome("Departamento 1");

		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Funcionario 1");
		funcionario1.setSalario(3000.00);
		funcionario1.setDepartamento(departamento1);

		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Funcionario 2");
		funcionario2.setSalario(3500.00);
		funcionario2.setDepartamento(departamento1);

		departamento1.setFuncionarios(Arrays.asList(funcionario1, funcionario2));

		em.persist(departamento1);
		em.persist(funcionario1);
		em.persist(funcionario2);

		tx.commit();
		em.close();
		emf.close();

	}
}
