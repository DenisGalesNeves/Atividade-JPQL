package br.edu.fatec.application.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Departamentos")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Funcionario> funcionarios;

    public Departamento(String nome){
        this.nome = nome;
    }

    @ManyToOne
    private Funcionario funcionario;

    public Departamento() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "id=" + id +
                ", nome='" + nome + '}';
    }
}
