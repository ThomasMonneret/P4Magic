/**
 * MagicP4
 * IUT Lyon 1 - 2016
 */
package model;

/**
 *
 * @author hakkahi - IUT Lyon 1 - 2016
 */
public class DisappearEffect extends Effect {

    /**
     * This effect changes the color of the tile that has just been played and
     * thus the owner of the tile)
     *
     * @param line ligne concernée dans le jeu
     * @param column colunne concernée dans le jeu
     * @param game jeu en cours
     */
    @Override
    public void playEffect(int line, int column, Game game) {
        int tile_id = -1;
        game.getBoard().getTileIJ(line, column).setStatus(tile_id);
    }

}
