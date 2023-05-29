package com.udea.cancelaciones.DTO;

public class DatosCambiarEstadoDTO {
    private String estadoSolicitud;
    private String idSolicitud;
    
    public DatosCambiarEstadoDTO(String estadoSolicitud, String idSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
        this.idSolicitud = idSolicitud;
    }
    public String getEstadoSolicitud() {
        return estadoSolicitud;
    }
    public void setEstadoSolicitud(String estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }
    public String getIdSolicitud() {
        return idSolicitud;
    }
    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }
}
