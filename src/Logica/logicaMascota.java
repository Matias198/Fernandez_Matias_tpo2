package Logica;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
/**
 *
 * @author Matias
 */
@Entity
public class logicaMascota implements Serializable {
    @Id 
    private String numero;  
    @Basic
    private String nombre;
    private String raza;
    private String color;
    private String alergico;
    private String atencionEsp;
    private String nombreDuenio;
    private String celDuenio;
    private String observacion;
    private boolean eliminado;
    public logicaMascota() {
    }
    public logicaMascota(String numero, String nombre, String raza, String color, String alergico, String atencionEsp, String nombreDuenio, String celDuenio, String observacion, boolean eliminado) {
        this.numero = numero;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencionEsp = atencionEsp;
        this.nombreDuenio = nombreDuenio;
        this.celDuenio = celDuenio;
        this.observacion = observacion;
        this.eliminado = eliminado;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getAlergico() {
        return alergico;
    }
    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }
    public String getAtencionEsp() {
        return atencionEsp;
    }
    public void setAtencionEsp(String atencionEsp) {
        this.atencionEsp = atencionEsp;
    }
    public String getNombreDuenio() {
        return nombreDuenio;
    }
    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }
    public String getCelDuenio() {
        return celDuenio;
    }
    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }
    public String getObservacion() {
        return observacion;
    }
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }   
    public boolean isEliminado() {
        return eliminado;
    }
    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
}
