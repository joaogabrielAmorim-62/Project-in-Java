/*
 *  Classe aluno
 */
package com.mycompany.minhaescola;

/**
 *
 * @author João Gabriel
 */
public class Aluno {
    
    //Atributos
    private String nome;
    private String matricula;
    private int idade;
    private String nomeMae;
    private String telefone;
    private double media;
    
    //Método construtor
    public Aluno(String nome, String matricula, int idade, String nomeMae, String telefone, double media) {
    
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.nomeMae = nomeMae;
        this.telefone = telefone;
        this.media = media;
    }
    
    //Métodos Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    public void verf() {
    
        if(this.media >= 6){
        
            System.out.println("Aluno " +this.nome+ " Aprovado!!");
        }else {
        
            System.out.println("Aluno " +this.nome+ " reprovado!");
        }
    
    }
    
    public void recuperacao() {
        
        if(this.media < 6) {
        
            System.out.println("Aluno de recuperacao!!!");
        }
    }
    
    public void infoAluno() {
    
        System.out.println("Nome: " +this.nome);
        System.out.println("Matricula: " +this.matricula);
        System.out.println("Idade: " +this.idade);
        System.out.println("Nome da mae: " +this.nomeMae);
        System.out.println("Telefone: " +this.telefone);
        System.out.println("Media do aluno: " +this.media);
        System.out.println("-------------------------------------------");
    }
    
    
    
}
