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
public class Pracownik {

 Scanner s= new Scanner(System.in);
    public String imie;      
    public String nazwisko;  
    public int wiek;         
    public String stanowisko;

    /* --------------------------
     * Constructors - 3 overloads
     * -------------------------- */
    
    public Pracownik(String imie, String nazwisko, int wiek, String stanowisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }

    public void nowyPracownik()
      {
          
          System.out.println("Podaj imię");
          imie =s.nextLine();
          System.out.println("Podaj nazwisko");
          nazwisko=s.nextLine();
          System.out.println("Podaj wiek");
          wiek=s.nextInt();
          System.out.println("Podaj stanowisko");
          stanowisko=s.nextLine();
      }
    public Pracownik() {
        this("","",0,"");
        
    }

    /* -------
     * Methods
     * ------- */
        public void pokazDane() {
        System.out.println("Osoba");
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("wiek: " + this.wiek + " lat");
    }
}
