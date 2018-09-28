package Jogo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 160015
 */
public class NaveJogador extends Base {
    
    private int vidas = 100;
    
    public NaveJogador(String url) {
        super(url);
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
    
}
