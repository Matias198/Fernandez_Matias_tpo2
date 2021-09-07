/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.logicaMascota;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matias
 */
public class ControladoraPersistencia {
    MascotaJpaController MascotaJPA = new MascotaJpaController();
    
    public void crearMascota (logicaMascota mascota){
        try {
            MascotaJPA.create(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void eliminarMascota(logicaMascota mascota) {
        mascota.setEliminado(true);
        try {
            MascotaJPA.edit(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void restaurarMascota(logicaMascota mascota) {
        mascota.setEliminado(false);
        try {
            MascotaJPA.edit(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarMascotaId(String idMascota) {
        try {
            MascotaJPA.destroy(idMascota);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarMascota(logicaMascota mascota){
        try{
            MascotaJPA.edit(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<logicaMascota> findMascotas() {
        List<logicaMascota> listaMascotas = MascotaJPA.findMascotaEntities();
        return listaMascotas;
    }
    
    public logicaMascota agregarDatosMascota (String numero, String nombre, String raza, String color, String alergico, String atencionEsp, String nombreDuenio, String celDuenio, String observacion, boolean eliminado){
        
        logicaMascota mascota = new logicaMascota();
        mascota.setNumero(numero);
        mascota.setNombre(nombre);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencionEsp(atencionEsp);
        mascota.setNombreDuenio(nombreDuenio);
        mascota.setCelDuenio(celDuenio);
        mascota.setObservacion(observacion);
        mascota.setEliminado(eliminado);
        
        return mascota;
    }
}
