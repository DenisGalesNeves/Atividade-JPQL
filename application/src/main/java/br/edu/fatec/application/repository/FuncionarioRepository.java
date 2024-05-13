package br.edu.fatec.application.repository;

import br.edu.fatec.application.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Long> {
}
