package main;

import java.util.Scanner;

public class LancerPartie {

    public static void lancerPartie(){

        jeu();


    }

    public static void tourAttaque(Personnage joueur1, Personnage joueur2){

        Scanner sc = new Scanner(System.in);
        System.out.println(joueur1.nomPerso + " Que voulez vous faire ? (1 - " + joueur1.nomAttBase + "  2 - " + joueur1.nomAttSpe + "  3 - Points de vie)");
        int att = sc.nextInt();
        while (att != 1 && att != 2 && att != 3){
            System.out.println("Tapez 1, 2 ou 3");
            System.out.println(joueur1.nomPerso + " Quelle attaque voulez vous faire ? (1 - " + joueur1.nomAttBase + "  2 - " + joueur1.nomAttSpe);
            att = sc.nextInt();
        }

        if (att == 1){
            joueur1.attaqueDeBase(joueur2);
            System.out.println("Vous utilisez " + joueur1.nomAttBase + ", vous infligez des dégats à " + joueur2.nomPerso);
        }else if (att == 2){
            joueur1.attaqueSpecial(joueur2);
        }else {
            System.out.println("Vous avez actuellement " + joueur1.vie);
            tourAttaque(joueur1, joueur2);
        }
    }

    public static void jeu(){
        int answer;

        System.out.println("Bienvenue à MagiWorld, veuillez créer vos combattants");
        do {
            Scanner sc = new Scanner(System.in);
            Personnage joueur1 = creation();
            System.out.println("\n");
            Personnage joueur2 = creation();
            System.out.println("");
            System.out.println("");
            while (true) {
                tourAttaque(joueur1, joueur2);
                if (joueur2.vie <= 0) {
                    System.out.println("Félicitation " + joueur1.nomPerso + " vous avez battu " + joueur2.nomPerso);
                    break;
                }
                System.out.println("");
                tourAttaque(joueur2, joueur1);
                if (joueur1.vie <= 0) {
                    System.out.println("Félicitation " + joueur2.nomPerso + " vous avez battu " + joueur1.nomPerso);
                    break;
                }
            }
            System.out.println("");
            System.out.println("Voulez-vous recommencer? 1 - Oui  2 - Non");
            answer = sc.nextInt();

        }while(answer == 1);
        System.out.println("Merci d'avoir joué ! A bientôt !");

    }

    public static String choixClasse(){
        String classe;
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez choisir la classe de votre personnage (Guerrier - Mage - Rodeur)");
        classe = sc.nextLine();

        while(!classe.equals("Guerrier") && !classe.equals("Mage") && !classe.equals("Rodeur")){
            System.out.println("Choisissez entre les 3 classe disponibles (Guerrier - Mage - Rodeur)");
            classe = sc.nextLine();
        }
        return classe;
    }

    public static Personnage creation(){
        String classe = choixClasse();
        Scanner sc = new Scanner(System.in);
        String nomPerso;
        int niv;
        int vie;
        int force = 0;
        int agi = 0;
        int intel = 0;

        System.out.println("Entrez votre nom");
        nomPerso = sc.nextLine();
        System.out.println("Entrez votre niveau");
        niv = sc.nextInt();
        if(niv > 100){
            System.out.println("Lvl max 100");
            System.out.println("Entrez votre niveau");
            niv = sc.nextInt();
        }
        vie = niv*5;
        System.out.println("Entrez votre force");
        force = sc.nextInt();
        System.out.println("Entrez votre agilité");
        agi = sc.nextInt();
        System.out.println("Entrez votre intelligence");
        intel = sc.nextInt();
        while((force+agi+intel) > niv || force < 0 || agi < 0 || niv < 0 || intel <0){
            System.out.println("La somme de vos caractéristiques ne peut pas être supérieur à votre niveau (" +niv + ") ou inférieur à 0");
            System.out.println("Entrez votre niveau");
            niv = sc.nextInt();
            if(niv > 100){
                System.out.println("Lvl max 100");
                niv = sc.nextInt();
            }
            System.out.println("Entrez votre force");
            force = sc.nextInt();
            System.out.println("Entrez votre agilité");
            agi = sc.nextInt();
            System.out.println("Entrez votre intelligence");
            intel = sc.nextInt();

        }

        if (classe.equals("Guerrier")){
            return  new Guerrier(nomPerso, niv, vie, force, agi, intel, "Coup d'épée", "Coup de Rage");
        }else if (classe.equals("Mage")){
            return  new Mage(nomPerso, niv, vie, force, agi, intel, "Boule de Feu", "Soin");
        }else{
            return new Rodeur(nomPerso, niv, vie, force, agi, intel, "Tir à l'Arc", "Concentration");
        }
    }
}
