/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.sauces.aplicacion;

/**
 *
 * @author alvaro.allper.1
 */
import java.util.Scanner;
public class AplicacionAgenda {

    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        String nombre, telefono, email;
        int opcion, swt;
        Contacto contacto=null;
        Agenda agenda;
        
        agenda=new Agenda();
        
        do{ 
            System.out.println("1. Crear contacto.");
            System.out.println("2. Consultar contacto.");
            System.out.println("3. Modificar contacto.");
            System.out.println("4. Eliminar contacto.");
            System.out.println("0. Salir.");
            System.out.print("Introduzca una opcion: ");

            opcion=teclado.nextInt();
            teclado.nextLine();
            if(opcion>=1 && opcion<=4){
                System.out.print("Introduce el nombre del contacto: ");
                nombre=teclado.nextLine();
                if (opcion==1){
                    if(contacto==null){
                        System.out.print("Introduzca el numero de telefono: ");
                        telefono=teclado.nextLine();
                        System.out.print("Introduzca el email: ");
                        email=teclado.nextLine();
                        contacto=new Contacto(nombre, telefono, email);
                        System.out.println("Contacto creado con exito.");
                    }
                }
                else{
                    if(contacto!=null && nombre.equals(contacto.getNombre())){
                        switch (opcion){
                            case 2->{
                                System.out.println(contacto.toString());
                            }
                            case 3->{
                                System.out.println("Introduzca nombre: ");
                                System.out.println(contacto.toString());
                                System.out.println("Ahora vamos a modificar el contacto...");
                                System.out.print("Introduzca el numero de telefono: ");
                                telefono=teclado.nextLine();
                                contacto.setTelefono(telefono);
                                System.out.print("Introduzca el email: ");
                                email=teclado.nextLine();
                                contacto.setEmail(email);
                                System.out.println("Contacto modificado con exito.");
                            }
                            case 4->{
                                System.out.println("Desea borrar el contacto: "+ nombre+ " Si(1) No(0)");
                                swt=teclado.nextInt();
                                if(swt==1){
                                    contacto=null;
                                    System.out.println("Contacto borrado con exito...");
                                }
                            }
                            default->{
                                System.out.println("El numero introducido no esta dentro de las opciones.");
                            }
                        }
                    }
                    else{
                        System.out.println("El contacto no ha sido encontrado.");
                    }
                }
            }
        }while (opcion!=0);
        System.out.println("Cerrando aplicacion...");
    }
}