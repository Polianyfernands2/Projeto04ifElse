/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto04ifelse;

/**
 *
 * @author aluno
 */
public class Projeto04ifElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        if (condicao boleana)
        (
        
            //codigo
        )
        */
        
        int idade = 30;
        if (idade < 18) {
                System.out.println("Menos Idade!");
                
        }
        else{
        
                System.out.println("Maior Idade!");
        }
        
        //operadores logicos
        //E && (conjuncao)
        //OU || (disjuncao)
        boolean amigoDoDono = true;
        if (idade < 18 && amigoDoDono == false) {
            System.out.println("Menor Idade. Entrada Proibida.");
            
        }
        else {
            System.out.println("Maior Idade. Pode Entrar.");
        }
        
        //operador de NEGACAO (!)
        if (idade < 18 && !amigoDoDono){
            System.out.println("Menor Idade. Entrada Proibida. ");
            
        }
        else {
            System.out.println("Maior Idade. Pode entrar.");
                
        }
        
        //operador de igualdade (==)
        int mes = 1;
        if (mes == 1){
            System.out.println("Janeiro");
            
        }
        else {
            System.out.print("Tempo de trabalhar!");
            
        }
    }
}
