/*

    Classe Professor!

 */
package com.mycompany.minhaescola;

/**
 *
 * @author João Gabriel
 */
public class Professor {
    
    //Atributos
    private String nome;
    private String cod;
    private String telefone;
    private String materia;
    
    //Método construtor
    public Professor(String nome, String cod, String telefone, String materia) {
        
        this.nome = nome;
        this.cod = cod;
        this.telefone = telefone;
        this.materia = materia;
    
    }
    
    //Métodos Get e Set
    public String getNome() {
        
        return nome;
    }

    public void setNome(String nome) {
        
        this.nome = nome;
    }

    public String getCod() {
        
        return cod;
    }

    public void setCod(String cod) {
        
        this.cod = cod;
    }

    public String getTelefone() {
        
        return telefone;
    }

    public void setTelefone(String telefone) {
        
        this.telefone = telefone;
    }

    public String getMateria() {
        
        return materia;
    }

    public void setMateria(String materia) {
        
        this.materia = materia;
    }
    
    public void infoProf() {
    
        System.out.println("Nome: " +this.nome);
        System.out.println("Codigo: " +this.cod);
        System.out.println("Telefone: " +this.telefone);
        System.out.println("Materia: " +this.materia);
        System.out.println("-------------------------------------------");
    
    }
    
    public void fazChamada() {
    
        System.out.println("O professor " +this.nome+ " fez chamada!");
    }
    
    public void reprovaAluno() {
    
        System.out.println("O professor " +this.nome+ " reprovou o aluno!");
        
    }
    
    
}
