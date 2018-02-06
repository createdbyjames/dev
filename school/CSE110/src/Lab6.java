/*-------------------------------------------------------------------------
// AUTHOR: James J. Kim
// FILENAME: Lab6.java
// SPECIFICATION: SuperHero Driver
// FOR: CSE 110- Lab #6
// TIME SPENT: 20 minutes
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args){

        // Create a Scanner object for later use
        Scanner scan = new Scanner(System.in);

        // Create a superhero called Spider-Man
        System.out.println("Creating Spider-Man.......");
        SuperHero spiderman = new SuperHero("Spider-Man");

        // Ask the user to enter a superhero name
        System.out.println("\nWhat is the name of your superhero?");
        String heroName = scan.nextLine();

        System.out.println("What is his secret identity?");
        String secretIdentity = scan.nextLine();

        System.out.println("Creating your super hero.......");
        /** 16: Create the hero called yourHero, who saved 10 people */
        SuperHero myHero = new SuperHero(heroName, secretIdentity, 10);

        System.out.println("\nSpider-Man just saved 100 lives!");
        /** 19: Call recordSave on spiderman with 100 as the input */
        spiderman.recordSave(10);


        System.out.println("Oops, Spider-Man was shot dead twice!");
        /** 22: Kill spiderman twice */
        spiderman.killHero();
        spiderman.killHero();

        System.out.print("\nYour hero saved a kidnapped kid ");
        System.out.println("but was shot once");
        /** 26: Kill your hero once */
        myHero.killHero();

        /** 27: Add 1 to your hero’s lives saved */
        myHero.recordSave();

        System.out.println("\n---- Superhero information ----");
        /** 30: Store the number of heroes in an int called numHeroes */
        int numHeroes = myHero.getNumberOfHeros();

        System.out.println("There are " + numHeroes + " known superheroes.");

        spiderman.printSuperHeroRecord();
        System.out.println();
        /** 33: print the record of yourHero */
        myHero.printSuperHeroRecord();

    }


}
