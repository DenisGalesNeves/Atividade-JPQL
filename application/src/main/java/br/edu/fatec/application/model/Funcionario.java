package br.edu.fatec.application.model;

import jakarta.persistence.*;

@Entity
@Table(name= "Funcionarios")
public class Funcionario {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private double salario;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;

    public Funcionario() {}
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        departamento.setFuncionario(this);
        this.departamento.add(departamento);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                ", departamento=" + departamento +
                '}';
    }
}





