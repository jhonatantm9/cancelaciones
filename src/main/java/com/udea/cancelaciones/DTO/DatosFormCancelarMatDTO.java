package com.udea.cancelaciones.DTO;

public class DatosFormCancelarMatDTO {
    private String idMateria;
    private String motivo;
    private String documentoEstudiante;
    
    public DatosFormCancelarMatDTO(String idMateria, String motivo, String documentoEstudiante) {
        this.idMateria = idMateria;
        this.motivo = motivo;
        this.documentoEstudiante = documentoEstudiante;
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
    public String getDocumentoEstudiante() {
        return documentoEstudiante;
    }
    public void setDocumentoEstudiante(String documentoEstudiante) {
        this.documentoEstudiante = documentoEstudiante;
    }
}
