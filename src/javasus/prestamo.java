/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasus;

/**
 *
 * @author Sergio
 */
public class prestamo {
    private String cedula;
    private String libro;
    
    public void init(){
        cedula="n_____n";
        libro="n_____n";
    }
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }
    
    public int devolver(String a1,String a2){
        if(a1.compareTo(cedula)==0){
            if(a2.compareTo(libro)==0){
                cedula="n_____n";
                libro="n_____n";
                return 1;
            }else{
                return 0;
            }
        }else{
            return 0;
        }
    }
    
}
