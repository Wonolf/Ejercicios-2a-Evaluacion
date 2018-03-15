/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package videoclub;

/**
 *  
 * @author bonos
 */
public class Disco extends Multimedia{
    private Genero genero;
    
    public Disco(String titulo, String autor, Formato formato, int duracion, Genero genero){
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }
    
    public Genero getGenero(){
        return genero;
    }
    
    @Override
    public String toString(){
        String cadena = "";
        if(genero!=null) cadena = super.toString() + "Género: "+genero+"\n\n";
        else             cadena = super.toString() + "\n";
        return cadena;
    }
}
