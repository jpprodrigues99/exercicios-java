/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;
import java.util.Scanner;
/**
 *
 * @author joaorodrigues
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        System.out.println("digite o nome: ");
        String nome = myObj.nextLine();
        System.out.println("digite a idade: ");
        int idade = myObj.nextInt();
        
        
        System.out.println("o nome: "+nome);
        System.out.println("a idade: "+idade);
        myObj.close();
    }
    
}
