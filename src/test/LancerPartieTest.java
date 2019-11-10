package test;

import main.Guerrier;
import main.Mage;
import main.Personnage;
import main.Rodeur;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class LancerPartieTest {

    @Test
    void tourAttaque() {
        Rodeur rodeur = new Rodeur("Bloup", 75, 75*5, 15, 60, 0, "Tir à l'arc", "Concentration");
        Guerrier guerrier = new Guerrier("Blop", 70, 70*5, 60, 15, 0, "Boule de feu", "Coup de Rage");

        guerrier.attaqueDeBase(rodeur);
        assertTrue(rodeur.getVie() - guerrier.getForce() < rodeur.getVie());

        rodeur.attaqueSpecial(guerrier);
        assertTrue(rodeur.degats == rodeur.getAgilite() + (rodeur.getNiv()/2), "l'agilité est de" + rodeur.degats);



    }

    @Test
    void jeu() {

    }

    @Test
    void choixClasse() {

    }

    @Test
    void creation() {



    }
}