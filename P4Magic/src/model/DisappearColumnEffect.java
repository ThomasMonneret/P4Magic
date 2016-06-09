/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Random;
/**
 *
 * @author p1506193
 */
public class DisappearColumnEffect extends Effect {
    
    /**
     * This effect changes the color of the tile that has just been played and
     * thus the owner of the tile)
     *
     * @param line ligne concernée par l'effet
     * @param column colonne concernée par l'effet
     * @param game jeu en cours
     */
    @Override
    public void playEffect(int line, int column, Game game) {
        for(int i = 0;i<game.getBoard().getHeight();i++){
            game.getBoard().getTileIJ(line, column).setStatus(-1);
        }
    }

}

