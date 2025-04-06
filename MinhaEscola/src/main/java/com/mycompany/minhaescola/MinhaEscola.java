/*
 *  Método principal
 */

package com.mycompany.minhaescola;

/**
 *
 * @author João Gabriel
 */
public class MinhaEscola {

    public static void main(String[] args) {
        
        Aluno obj1 = new Aluno("Joao Gabriel", "12345678", 16, "Iranildes", "(64) 99648-2472", 9.5);
        Professor prof1 = new Professor("Jose Pereira", "98765432", "(64) 99743-7893", "Matematica");
        obj1.infoAluno();
        obj1.setTelefone("(64) 99916-2472");
        obj1.setMedia(2.1);
        obj1.infoAluno();
        obj1.verf();
        
        prof1.fazChamada();
        prof1.reprovaAluno();
    }
}
