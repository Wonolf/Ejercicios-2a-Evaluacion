/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubbyhole;

/**
 *
 * @author Bonoso
 */
public class TestMonitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CubbyHole b=new CubbyHole();
        Productor p=new Productor(b,1000);
        Consumidor c=new Consumidor(b,2000);
        p.start();
        c.start();
    }
}
