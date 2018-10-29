/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117074.latihan62.livingthing;

/**
 *Nama  : Brigita Julia Puspita Nai Goncalves
 *Kelas : PBO2
 *NIM   :10117074
 *Deskripi Program : program ini berisi program yang berisi tentang livingthing
 *                   seseorang
 */
public class PBO210117074Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human human = new Human();
        human.setNama("Brigita Julia P N G");
       
        human.walk(human.getNama());
        human.Breath(human.getNama());
        human.eat(human.getNama());
    }
    
}
