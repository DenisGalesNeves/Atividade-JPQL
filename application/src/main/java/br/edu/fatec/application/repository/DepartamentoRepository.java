package br.edu.fatec.application.repository;

public interface DepartamentoRepository {
    List<Funcionario> funcionariosDepartamento = entityManager.createQuery(
                    "SELECT f FROM Funcionario f WHERE f.departamento.nome = :nomeDepartamento", Funcionario.class)
            .setParameter("nomeDepartamento", "Departamento 1")
            .getResultList();

    List<Departamento> departamentosComFuncionario = entityManager.createQuery(
                    "SELECT d FROM Departamento d JOIN d.funcionarios f WHERE f.nome = :nomeFuncionario", Departamento.class)
            .setParameter("nomeFuncionario", "Funcionario 1")
            .getResultList();


    List<Funcionario> funcionariosSalarioMaiorQue = entityManager.createQuery(
                    "SELECT f FROM Funcionario f WHERE f.salario > :salario AND f.departamento.nome = :nomeDepartamento", Funcionario.class)
            .setParameter("salario", 3200.00)
            .setParameter("nomeDepartamento", "Departamento 1")
            .getResultList();
}
