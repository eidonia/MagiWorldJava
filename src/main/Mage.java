package main;

public class Mage extends Personnage {
    int degats = intelligence;


    public Mage(String nomPerso, int niv, int vie, int force, int agilite, int intelligence, String nomAttBase, String nomAttSpe) {
        super(nomPerso, niv, vie, force, agilite, intelligence, nomAttBase, nomAttSpe);
        System.out.println("Je m'appelle " + this.nomPerso + " et je suis un Mage de niveau " + this.niv + ", mes carac sont " + this.vie + " pv, " + this.force + " force, " + this.agilite + " agilite, " + this.intelligence + " intelligence");
    }

    @Override
    public void attaqueDeBase(Personnage persoDef) {
        persoDef.vie -= degats;
    }

    @Override
    public void attaqueSpecial(Personnage persoDef) {
        this.vie += intelligence;
        if (this.vie > (niv *5))
            this.vie = niv*5;
        System.out.println("Vous vous soignez");
        System.out.println("Votre vie est de " + this.vie);

    }
}

