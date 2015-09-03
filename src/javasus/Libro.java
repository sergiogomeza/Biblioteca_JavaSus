/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasus;
import java.util.Scanner;
/**
 *
 * @author practi08
 */
public class Libro {
    private String nombre;
    private String autor;
    private int year,cantidad;
    private String code;
    private String area;
    public Scanner kb;

    public void init(){
        nombre="n_____n";
        autor="nn";
        year=0;
        cantidad=0;
        code="nn";
        area="nn";
        kb=new Scanner(System.in);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    public int Eliminar(String a1){
        if(a1.compareTo(nombre)==0){
            nombre="n_____n";
            autor="nn";
            year=0;
            cantidad=0;
            code="nn";
            area="nn";
            return 1;
        }else{
            return 0;
        }
    }
    public int Buscar(String a1){
        if(a1.compareTo(nombre)==0){
            System.out.print("\n__________________________________________\n");
            System.out.print("Libro:\t\t"+nombre);
            System.out.print("\nAutor:\t\t"+autor);
            System.out.print("\nAño:\t\t"+year);
            System.out.print("\ncodigo:\t\t"+code);
            System.out.print("\ncantidad:\t"+cantidad);
            System.out.print("\narea:\t\t"+area+'\n');
            System.out.print("__________________________________________\n");
            return 1;
        }else{
            return 0;
        }
        
    }
}
