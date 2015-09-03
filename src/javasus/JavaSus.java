/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasus;
//import java.util.Scanner;
/**
 *
 * @author practi08
 */
public class JavaSus {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,k=0,op1=0,op2=0,j=0,flag=0,op3=0,n=0;
        String a1="n_____n",a2,a3;
        JavaSus cp= new JavaSus();
        Libro[] L= new Libro[10];
        prestamo[] persona=new prestamo[20];
        for(i=0;i<10;i++){
            L[i]=new Libro();
        }
        for(i=0;i<10;i++){
            L[i].init();
        }
        for(i=0;i<20;i++){
            persona[i]=new prestamo();
        }
        for(i=0;i<20;i++){
            persona[i].init();
        }
        System.out.print("\n__________________________________________\n");
        System.out.print("Bienvenido a la aplicacion de la biblioteca\n");
        while(op1==0){
            System.out.print("Ingrese la opcion que desea\n1.Gestion base de datos\n2.Gestion de prestamos\n3.Salir\n(1/2/3): ");
            op1=L[0].kb.nextInt();
            switch(op1){
                case 1:
                    while(op2==0){
                        System.out.print("\n__________________________________________\n");
                        System.out.print("Que desea hacer?\n1.Ingresar Libro\n2.Actualizar Libro\n3.Eliminar Libro\n4.Buscar Libro\n5.Volver al menú anterior\n(1/2/3/4/5):");
                        op2=L[0].kb.nextInt();
                        //L[0].kb.nextLine();
                        switch(op2){
                            case 1:
                                for(i=0;i<10;i++){
                                    //System.out.print(L[i].getNombre()+'\n');
                                    if("n_____n".compareTo(L[i].getNombre())==0){
                                        j=i;
                                        k=1;
                                    }
                                }
                                if(k==1){
                                    System.out.print("Ingrese el nombre del libro: ");
                                    L[0].kb.nextLine();
                                    L[j].setNombre(L[j].kb.nextLine()); 
                                    System.out.print("Ingrese el autor del libro: ");
                                    L[j].setAutor(L[j].kb.nextLine());
                                    System.out.print("Ingrese el año de publicacion: ");
                                    L[j].setYear(L[j].kb.nextInt());
                                    L[j].kb.nextLine();
                                    System.out.print("Ingrese el codigo del libro: ");
                                    L[j].setCode(L[j].kb.nextLine());
                                    System.out.print("Ingrese la cantidad de libros: ");
                                    L[j].setCantidad(L[j].kb.nextInt());
                                    L[j].kb.nextLine();
                                    while(flag==0){
                                        System.out.print("Ingrese el area del libro: ");
                                        a2=L[j].kb.nextLine();
                                        switch(a2){
                                            case "quimica":
                                            case "fisica":
                                            case "tecnologia":
                                            case "calculo":
                                            case "programacion":
                                                flag=1;
                                                break;
                                            default:
                                                System.out.print("area incorrecta\ndebe ser de quimica,fisica,tecnologia,calculo o programacion\n");
                                        }
                                        L[j].setArea(a2);
                                    }        
                                }else{
                                    System.out.print("Base de datos llena\nTiene que eliminar el registro de algún libro para poder ingresar otro\n");
                                }
                                flag=0;
                                k=0;
                                op2=0;
                                break;
                            case 2:
                                System.out.print("Ingrese el nombre del libro que desea actualizar: ");
                                L[0].kb.nextLine();
                                a2=L[0].kb.nextLine();
                                for(i=0;i<10;i++){
                                    if(a2.compareTo(L[i].getNombre())==0){
                                        j=i;
                                        k=1;
                                    }
                                }
                                if(k==1){
                                        System.out.print("Ingrese el autor del libro: ");
                                        //L[j].kb.nextLine();
                                        L[j].setAutor(L[j].kb.nextLine());
                                        System.out.print("Ingrese el año de publicacion: ");
                                        L[j].setYear(L[j].kb.nextInt());
                                        L[j].kb.nextLine();
                                        System.out.print("Ingrese el codigo del libro: ");
                                        L[j].setCode(L[j].kb.nextLine());
                                        System.out.print("Ingrese la cantidad de libros: ");
                                        L[j].setCantidad(L[j].kb.nextInt());
                                        L[j].kb.nextLine();
                                        while(flag==0){
                                            System.out.print("Ingrese el area del libro: ");
                                            a1=L[j].kb.nextLine();
                                            switch(a1){
                                                case "quimica":
                                                case "fisica":
                                                case "tecnologia":
                                                case "calculo":
                                                case "programacion":
                                                    flag=1;
                                                    break;
                                                default:
                                                    System.out.print("area incorrecta\ndebe ser de quimica,fisica,tecnologia,calculo o programacion\n");
                                            }
                                            L[j].setArea(a1);
                                        }
                                        flag=0;
                                }else{
                                    System.out.print("El libro no esta en la base de datos\n");
                                }
                                k=0;
                                op2=0;
                                break;
                            case 3:
                                //Eliminar();
                                L[0].kb.nextLine();
                                System.out.print("Ingrese el nombre del libro: ");
                                a2=L[0].kb.nextLine();
                                k=0;
                                for(i=0;i<10;i++){
                                    if(k==0){
                                        k=L[i].Eliminar(a2);
                                    }
                                }
                                if(k==0){
                                    System.out.print("\n__________________________________________\n");
                                    System.out.print("El libro no esta en la base de datos\n");
                                    System.out.print("__________________________________________\n");
                                }
                                op2=0;
                                break;
                            case 4:
                                L[0].kb.nextLine();
                                System.out.print("Ingrese el nombre del libro: ");
                                a2=L[0].kb.nextLine();
                                k=0;
                                for(i=0;i<10;i++){
                                    //System.out.print("1");
                                    if(k==0){
                                        k=L[i].Buscar(a2);
                                    }
                                }
                                if(k==0){
                                    System.out.print("\n__________________________________________\n");
                                    System.out.print("El libro no esta en la base de datos\n");
                                    System.out.print("__________________________________________\n");
                                }
                                op2=0;
                                break;
                            case 5:
                                op2=1;
                                break;
                            default:
                                System.out.print("opcion incorrecta\n");
                                System.out.print("\n__________________________________________\n");
                                op2=0;
                        }
                    }
                    op2=0;
                    op1=0;
                    break;
                case 2:
                    while(op3==0){
                        System.out.print("\n__________________________________________\n");
                        System.out.print("1.prestar libro\n2.devolver libro\n3.libros prestados\n4.volver al menu anterior\n(1/2/3/4): ");
                        op3=L[1].kb.nextInt();
                        switch(op3){
                            case 1:
                                L[0].kb.nextLine();                                
                                System.out.print("Ingrese el nombre del libro que desea prestar: ");
                                a2=L[0].kb.nextLine();
                                for(i=0;i<10;i++){
                                    if(a2.compareTo(L[i].getNombre())==0){
                                        j=i;
                                        k=1;
                                    }
                                }
                                if(k==1){
                                    k=0;
                                    if(L[j].getCantidad()>0){
                                        System.out.print("Ingrese el numero de cedula de la persona: ");
                                        a3=L[j].kb.nextLine();
                                        for(i=0;i<20;i++){
                                            //System.out.print(persona[i].getCedula()+'\n');
                                            if(a3.compareTo(persona[i].getCedula())==0){
                                                k=1;
                                            }
                                        }
                                        if(k==0){
                                            for(i=0;i<20;i++){
                                                
                                                if("n_____n".compareTo(persona[i].getCedula())==0){
                                                        n=i;
                                                        k=1;
                                                }
                                            }
                                            if(k==1){
                                                k=0;
                                                persona[n].setCedula(a3);
                                                persona[n].setLibro(a2);
                                            }
                                        }else{
                                            k=0;
                                            System.out.print("Esa persona ya presto libros\n");
                                        }
                                        L[j].setCantidad((L[j].getCantidad()-1));
                                    }else{
                                        System.out.print("Se agotaron los ejemplares\n");
                                    }
                                }else{
                                    System.out.print("\n__________________________________________\n");
                                    System.out.print("El libro no esta en la base de datos\n");
                                    System.out.print("__________________________________________\n");
                                }
                                op3=0;
                                break;
                            case 2:
                                L[0].kb.nextLine();
                                System.out.print("Ingrese el nombre del libro: ");
                                a3=L[j].kb.nextLine();
                                System.out.print("Ingrese la cedula de la persona: ");
                                a2=L[j].kb.nextLine();
                                for(i=0;i<20;i++){
                                    if(k==0){
                                        k=persona[i].devolver(a2,a3);
                                    }
                                }
                                if(k==0){
                                    System.out.print("Ese libro no esta prestado por esa persona\n");

                                }else{
                                    k=0;
                                }
                                op3=0;
                                break;
                            case 3:
                                for(i=0;i<20;i++){
                                    if("n_____n".compareTo(persona[i].getCedula())!=0){
                                        System.out.print(persona[i].getLibro()+'\n');
                                        k=1;
                                    }
                                }
                                if(k==0){
                                    System.out.print("\n__________________________________________\n");
                                    System.out.print("No hay libros prestados!!\n");
                                    System.out.print("__________________________________________\n");
                                }else{
                                    k=0;
                                }
                                op3=0;
                                break;
                            case 4:
                                op3=1;
                                break;
                            default:
                                System.out.print("opcion incorrecta\n");
                                System.out.print("\n__________________________________________\n");
                                op3=0;
                        }
                    }
                    op3=0;
                    op1=0;
                    break;
                case 3:
                    System.out.print("Hasta Luego!!!\n");
                    System.out.print("\n__________________________________________\n");
                    break;
                default:
                    System.out.print("opcion incorrecta\n");
                    System.out.print("\n__________________________________________\n");
                    op1=0;
            }
        }
  //      cp.menu1();
        //System.out.print("");
        //kb2.nextInt();
        //kb2.nextLine();
        
    }
    
}
