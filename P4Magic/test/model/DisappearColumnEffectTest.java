/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import static model.DisappearEffectTest.aGame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author p1506193
 */
public class DisappearColumnEffectTest {
    
    public DisappearColumnEffectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of playEffect method, of class DisappearColumnEffect.
     */
    @Test
    public void testPlayEffect() {
        int column = 0;
        Game game = null;
        game.getBoard().getTileIJ(game.getBoard().getHeight()-1, 0).setEffect(new DisappearColumnEffect());
        for(int i = 0;i<game.getBoard().getHeight();i++){
            game.playMove(column);
        }
        for(int i = 0;i<game.getBoard().getHeight();i++){
        assertEquals(-1, game.getBoard().getTileIJ(i, 0).getStatus());
        }
    }
    
}
