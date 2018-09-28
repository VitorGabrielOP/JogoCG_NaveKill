/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;
import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author 160015
 */
public class Tiro extends Base{
    
    @Override
    public void desenhar(Graphics g){
        g.setColor(Color.green);
        g.fillRect(x, y, altura, largura);
    }    
}
