/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;
import java.util.Scanner;
/**
 *
 * @author Patryk
 */
public class Stos {

    
    Scanner w = new Scanner(System.in);
    
    private int indeks = 0;
    private int rozmiar;
    public int stos[];
    
    public Stos(int n){
        this.rozmiar = n;
        this.stos = new int[n];
    }
    
    public void push(){
        if (indeks < rozmiar) {
            System.out.print("Podaj liczbe, ktora chcesz dodac na stos: ");
            indeks++;
            stos[indeks] = w.nextInt();
        } else {
            System.out.println("Stos jest pelny");
        }
    }
    
    public void pop(){
         if (indeks >= 1) {
            System.out.println("Usuwam element ze stosu");
            stos[indeks] = 0;
            indeks--;
        } else {
            System.out.println("Stos jest pusty");
        }
    }
    
    public void wyswietlStos(){
        System.out.println("Stos: ");
        for(int i = indeks; i>=1; i--){
            System.out.println(stos[i]);
        }
    }
    
    
}
