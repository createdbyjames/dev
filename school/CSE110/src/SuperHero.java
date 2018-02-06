/*-------------------------------------------------------------------------
// AUTHOR: James J. Kim
// FILENAME: SuperHero.java
// SPECIFICATION: SuperHero Class
// FOR: CSE 110- SuperHero
// TIME SPENT: 20 minutes
//-----------------------------------------------------------*/

public class SuperHero {

    // instance variables go below here
    private static int numberOfHeros;
    private String heroName;
    private String secretIdentity;
    private int numberOfLifeChances;
    private int numberOfPeopleSaved;

    // the two constructors go below here
    public SuperHero(String initHeroName, String initSecretIdentity, int initPeopleSaved){
        numberOfHeros++;
        this.numberOfLifeChances = 2;
        this.heroName = initHeroName;
        this.secretIdentity = initSecretIdentity;
        this.numberOfPeopleSaved = initPeopleSaved;
    }

    public SuperHero(String initHeroName){
        numberOfHeros++;
        this.numberOfLifeChances = 2;
        this.heroName = initHeroName;
        this.secretIdentity = "Unknown";
        this.numberOfPeopleSaved = 0;

    }
    // getNumberOfHeroes() goes below here
    public int getNumberOfHeros(){
        return numberOfHeros;
    }

    // recordSave() goes below here
    public void recordSave(){
        this.numberOfPeopleSaved++;
    }

    // the second recordSave method goes here
    public void recordSave(int numberSaved){
        this.numberOfPeopleSaved += numberSaved;
    }

    // killHero() goes below here
    public void killHero(){
        if (this.numberOfLifeChances > 0){
            this.numberOfLifeChances--;
        } else {
            System.out.println("Your hero is dead.");
        }
    }

    // printSuperHeroRecord() goes below here
    public void printSuperHeroRecord(){
        System.out.println("Name: " + this.heroName);
        System.out.println("Secret Identify: " + this.secretIdentity);

        if (this.numberOfLifeChances > 0) {
            System.out.println("Status: Alive");
        } else {
            System.out.println("Status: Dead");
        }

        System.out.println("People Saved: " + numberOfPeopleSaved);
    }

}
