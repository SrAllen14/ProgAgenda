/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.sauces.aplicacion;

/**
 *
 * @author alvaro.allper.1
 */
public class Agenda {
    private Contacto contacto;
    
    /**
     *
     * @param nombre
     * @param telefono
     * @param email
     * @return
     */
    public boolean crearContacto(String nombre, String telefono, String email){
        boolean contactoCreado=false;
        if (contacto==null){
            contacto= new Contacto(nombre, telefono, email);
            contactoCreado=true;
        }
        return contactoCreado;
    }
    
    /**
     *
     * @param nombre
     * @return
     */
    public Contacto consultarContacto(String nombre){
        Contacto contacto=null;
        if(this.contacto!=null && nombre.equals(this.contacto.getNombre())){
            contacto=this.contacto;
        }
        return contacto;
    }
    
    /**
     *
     * @param contacto
     * @return
     */
    public boolean modificarContacto(Contacto contacto){
        boolean contactoModificado=false;
        if (contacto!=null && contacto.equals(this.contacto)){
            this.contacto=contacto;
            contactoModificado=true;
        }
        return contactoModificado;
    }
    
    /**
     *
     * @param nombre
     * @return
     */
    public boolean eliminarContacto(String nombre){
        boolean contactoEliminado=false;
        if (this.contacto!=null && nombre.equals(this.contacto.getNombre())){
            contacto=null;
            contactoEliminado=true;
        }
        return contactoEliminado;
    }
}
