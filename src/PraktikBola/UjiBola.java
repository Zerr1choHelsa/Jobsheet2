/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikBola;

/**
 *
 * @author Windows 10
 */
public class UjiBola {
    public static void main(String[] args){
        Bola ball = new Bola ();
        ball.setjarijari(14);
        ball.showDiameter();
        ball.showLuasPermukaan();
        ball.showVolume();
        ball.cetak();
    }
}
