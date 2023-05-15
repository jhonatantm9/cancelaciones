package com.udea.cancelaciones.DTO;

public class CancelarMateriaDTO {
    private String idMateria;
    private String motivo;

    public CancelarMateriaDTO(String idMateria, String motivo) {
        this.idMateria = idMateria;
        this.motivo = motivo;
    }
    public String getIdMateria() {
        return idMateria;
    }
    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
