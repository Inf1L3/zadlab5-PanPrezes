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
public class Liczba {


    public int liczba;
    Scanner w = new Scanner(System.in);
    
    public Liczba(int liczba){
        this.liczba = liczba;
    }
    
    public int rozmiarTablicy(int liczba) {
        int licznik = 0;
        while (liczba / 10 != 0) {
            liczba = liczba / 10;
            licznik++;
        }
        return licznik;
    }
    int tab[] = new int[rozmiarTablicy(liczba)];
    
    void rozlozLiczbe(int liczba){
        for (int i = 0; i < rozmiarTablicy(liczba); i++) {
            tab[i] = liczba % 10;
            liczba = liczba / 10;
        }
    }
    
    void wypiszLiczbe(){
        System.out.println("podana liczba: "+this.liczba);
    }
    
    void podajLiczbe(){
        System.out.print("Podaj liczbe: ");
        this.liczba = w.nextInt();        
    }
    
    int silnia(int n){
        if (n<=1) 
            return 1;
        else 
            return n*silnia(n-1); 
    }
}

