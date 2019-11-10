package main;

public abstract class  Personnage implements Attaque {
    protected String nomPerso;
    protected String nomAttBase;
    protected String nomAttSpe;
    protected int niv;
    protected int vie;
    protected int force;
    protected int agilite;
    protected int intelligence;


    Personnage(String nomPerso, int niv, int vie, int force, int agilite, int intelligence, String nomAttBase, String nomAttSpe){
        this.nomPerso = nomPerso;
        this.niv = niv;
        this.vie = vie;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
        this.nomAttBase = nomAttBase;
        this.nomAttSpe = nomAttSpe;
    }

    public String getNomPerso() {
        return nomPerso;
    }

    public void setNomPerso(String nomPerso) {
        this.nomPerso = nomPerso;
    }

    public String getNomAttBase() {
        return nomAttBase;
    }

    public void setNomAttBase(String nomAttBase) {
        this.nomAttBase = nomAttBase;
    }

    public String getNomAttSpe() {
        return nomAttSpe;
    }

    public void setNomAttSpe(String nomAttSpe) {
        this.nomAttSpe = nomAttSpe;
    }

    public int getNiv() {
        return niv;
    }

    public void setNiv(int niv) {
        this.niv = niv;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}

