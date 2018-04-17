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
public class Firma {

    Pracownik x = new Pracownik("Patryk", "Michałów",20,"uczeń");
     Pracownik y = new Pracownik("Roman", "Kowalski",24,"uczeń");
       Pracownik z = new Pracownik("Mariusz", "Nowak",20,"uczeń"); 
  
 
      
        public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            Scanner g= new Scanner(System.in);
             Pracownik[] tab= new Pracownik[100];
       tab[0]=new Pracownik("Patryk", "Michałów",20,"uczeń");
       tab[1]= new Pracownik("Roman", "Kowalski",24,"uczeń");
       tab[2]= new Pracownik("Mariusz", "Nowak",20,"uczeń");
       for(Pracownik x:tab)
       {
           x=new Pracownik();
       }
      for(int i=3;i<100;i++){
            System.out.println("Podaj imię");
          String imie =s.nextLine();
          System.out.println("Podaj nazwisko");
          String nazwisko=s.nextLine();
          System.out.println("Podaj wiek");
          int wiek=g.nextInt();
          System.out.println("Podaj stanowisko");
         String stanowisko=s.nextLine();
            tab[i]=new Pracownik(imie,nazwisko,wiek,stanowisko);
       
       for(Pracownik x:tab)
   {
     System.out.println(x.imie);
     System.out.println(x.nazwisko);
     System.out.println(x.wiek);
     System.out.println(x.stanowisko);
   }
       
}
        }}