package org.example;

import models.Aktor;
import models.Film;
import models.Person;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Film film1 = new Film();
        film1.setTitle("FILM 1");
        film1.setCategory('B');
        film1.setRating(23);
        film1.setBudget(35.23);

        Film film2 = new Film("Film", 30, 'A', 45.56);
        Film avatar = new Film("Avatar", 1, 'A', 109.4);
        Film topogun = new Film("Top Gun", 11, 'A', 65.5);
        Film klan = new Film("Klan",99,'B',23.6);


        double budzetfilm1 = film1.getBudget();

       // System.out.println("budżet film1: " + budzetfilm1);
       // System.out.println("budżet film2: " + film2.getBudget());

     //   Aktor tomCruise = new Aktor("Tom", "Cruise", 15, false);
     //   Aktor tomHanks = new Aktor("Tom", "Hanks", 13, true);
     //  Aktor sandraBullock = new Aktor("Sandra", "Bullock", 22, false);
     //   Aktor piotrAdamczyk = new Aktor("Piotr", "Adamczyk", 260, false);



        int rankingTopGana;
        int rankingAvatara;
        int rankingKlanu;

        rankingAvatara = avatar.getRating();
        rankingTopGana = topogun.getRating();
        rankingKlanu = klan.getRating();


     //  if (rankingTopGana<11){
     //       System.out.println("To jest popularny film");
     //   } else if (rankingTopGana<51) {
     //       System.out.println("To jest średni film");
     //   } else{
     //       System.out.println("To jest słaby film");
     //   }

     //   if (rankingAvatara<11){
     //       System.out.println("To jest popularny film");
     //       System.out.println(avatar.getTitle());
     //   } else if (rankingAvatara<51) {
     //       System.out.println("to jest średni film");
     //   } else{
     //       System.out.println("To jest słaby film");
     //   }

     //   if (rankingKlanu<11){
     //       System.out.println("To jest popularny film");
     //   } else if (rankingKlanu<51) {
     //       System.out.println("to jest średni film");
     //   } else{
     //       System.out.println("To jest słaby film");
     //   }

     //   if (topogun.getRating()<avatar.getRating()){
     //       System.out.println(topogun.getTitle() + " jest popularniejszy niż " + avatar.getTitle());

     //   } else if (topogun.getRating() == avatar.getRating()) {
     //       System.out.println("To są równorzędne filmy");
     //   } else {
     //       System.out.println(avatar.getTitle() + " jest popularniejśzy niż " + topogun.getTitle());
     //   }

     //  Scanner scanner = new Scanner(System.in);
     //   System.out.println("podaj imię");
     //   String imie = scanner.nextLine();
     //   System.out.println("podaj wiek (numerycznie)");
     //   int wiek = scanner.nextInt();


     //  System.out.println("witaj " + imie +" dziekuję za zakup aplikacji");
     //   System.out.println("masz lat" + wiek);


     //   Scanner scanner = new Scanner(System.in);
     //   System.out.println("Podaj imię: ");
     //   String imie = scanner.nextLine();

     //   if(Objects.equals(imie, "Donald")){
     //       System.out.println("Przykro ale cię nie znam " + imie);
     //       System.exit(1);
     //   } else if(Objects.equals(imie, "Brad")) {
     //       System.out.println("Witaj " + imie + " miło cię widzieć");
     //   } else {
     //       System.out.println("Witaj " + imie);
     //   }

        Person tomHanks = new Person("Tom","Hanks");
        Person angelinaJolie = new Person("Angelina","Jolie");
        int wynagrodzenieToma = tomHanks.caltulateSalary(300000,4);
        int wynagrodzenieAngeliny = angelinaJolie.caltulateSalary(600000,9);
        System.out.println("Wynagrodznie Toma Hanksa " + wynagrodzenieToma);
        System.out.println("Wynagrodznie Angeliny Jolie " + wynagrodzenieAngeliny);



    }
}