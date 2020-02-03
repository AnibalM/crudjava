/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import models.Persona;

/**
 *
 * @author Usuario
 */
public class PersonaController {
    
    private List<Persona> BD_Persona = new ArrayList<>();
    
    public String Save(Persona persona){
        boolean existe = false;
        
        for(Persona p: BD_Persona){
            if (p.getCedula().equals(persona.getCedula())) {
                existe = true;
            }
        }
        
        if (existe) {
            return "EL MAN YA EXISTE";
        }
        BD_Persona.add(persona);
        return "GUARDADO";
    }
    
     public Persona Find(String cedula){
         for(Persona p: BD_Persona){
            if (p.getCedula().equals(cedula)) {
                return p;
            }
        }
         return null;
     }
     
     public List<Persona> All(){
         
         return BD_Persona;
     }
     
     public String Delete(String cedula){
         for(Persona p: BD_Persona){
            if (p.getCedula().equals(cedula)) {
                BD_Persona.remove(p);
                return "ELIMINADO";
            }
        }
         return "EL MAN NO EXISTE";
     }
     public String Update(Persona persona){
         for(Persona p: BD_Persona){
            if (p.getCedula().equals(persona.getCedula())) {
                
                //p.setCedula(persona.getCedula());
                //p.setNombre(persona.getNombre());
                 p = persona;
                return "ACTUALIZADO";
            }
        }
         return "EL MAN NO EXISTE";
     }
}
