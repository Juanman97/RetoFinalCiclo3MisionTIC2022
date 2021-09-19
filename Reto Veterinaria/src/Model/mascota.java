/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author JuanManuel
 */
public class mascota {
    
    private int mascotaId;
    private String mascotaNombre;
    private String propUsuario;
    
    private String propNombre;
    private String propApellido;
    private String propTelefono;

    public mascota(int mascotaId, String mascotaNombre, String propUsuario, String propNombre, String propApellido, String propTelefono) {
        this.mascotaId = mascotaId;
        this.mascotaNombre = mascotaNombre;
        this.propUsuario = propUsuario;
        this.propNombre = propNombre;
        this.propApellido = propApellido;
        this.propTelefono = propTelefono;
    }

    public mascota(int mascotaId, String mascotaNombre, String propUsuario) { //constructor para update
        this.mascotaId=mascotaId;
        this.mascotaNombre = mascotaNombre;
        this.propUsuario = propUsuario;
    }
    
    public mascota(String mascotaNombre, String propUsuario) { //constructor para add mascota
        this.mascotaNombre = mascotaNombre;
        this.propUsuario = propUsuario;
    }
    

    /**
     * @return the mascotaId
     */
    public int getMascotaId() {
        return mascotaId;
    }

    /**
     * @return the mascotaNombre
     */
    public String getMascotaNombre() {
        return mascotaNombre;
    }

    /**
     * @param mascotaNombre the mascotaNombre to set
     */
    public void setMascotaNombre(String mascotaNombre) {
        this.mascotaNombre = mascotaNombre;
    }

    /**
     * @return the propUsuario
     */
    public String getPropUsuario() {
        return propUsuario;
    }

    /**
     * @param propUsuario the propUsuario to set
     */
    public void setPropUsuario(String propUsuario) {
        this.propUsuario = propUsuario;
    }

    /**
     * @return the propNombre
     */
    public String getPropNombre() {
        return propNombre;
    }

    /**
     * @param propNombre the propNombre to set
     */
    public void setPropNombre(String propNombre) {
        this.propNombre = propNombre;
    }

    /**
     * @return the propApellido
     */
    public String getPropApellido() {
        return propApellido;
    }

    /**
     * @param propApellido the propApellido to set
     */
    public void setPropApellido(String propApellido) {
        this.propApellido = propApellido;
    }

    /**
     * @return the propTelefono
     */
    public String getPropTelefono() {
        return propTelefono;
    }

    /**
     * @param propTelefono the propTelefono to set
     */
    public void setPropTelefono(String propTelefono) {
        this.propTelefono = propTelefono;
    }
    
    
    
}
