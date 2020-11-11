
package com.at.spring.jsonresponse.dto;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;

public class Response {

    private String fechaCaducidad;
    private long tiempoValidez;
    private String fechaRegeneracion;
    private long tiempoRegeneracion;
    private String id;
    private String ip;
    private String xml;
    private String versionCookie;
    private String emisorCookie;
    @Valid
    private Sesion sesion;
    private boolean secure;
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Response() {
    }

    /**
     * 
     * @param id
     * @param fechaRegeneracion
     * @param emisorCookie
     * @param tiempoValidez
     * @param versionCookie
     * @param secure
     * @param sesion
     * @param xml
     * @param fechaCaducidad
     * @param ip
     * @param tiempoRegeneracion
     */
    public Response(String fechaCaducidad, long tiempoValidez, String fechaRegeneracion, long tiempoRegeneracion, String id, String ip, String xml, String versionCookie, String emisorCookie, Sesion sesion, boolean secure) {
        super();
        this.fechaCaducidad = fechaCaducidad;
        this.tiempoValidez = tiempoValidez;
        this.fechaRegeneracion = fechaRegeneracion;
        this.tiempoRegeneracion = tiempoRegeneracion;
        this.id = id;
        this.ip = ip;
        this.xml = xml;
        this.versionCookie = versionCookie;
        this.emisorCookie = emisorCookie;
        this.sesion = sesion;
        this.secure = secure;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public long getTiempoValidez() {
        return tiempoValidez;
    }

    public void setTiempoValidez(long tiempoValidez) {
        this.tiempoValidez = tiempoValidez;
    }

    public String getFechaRegeneracion() {
        return fechaRegeneracion;
    }

    public void setFechaRegeneracion(String fechaRegeneracion) {
        this.fechaRegeneracion = fechaRegeneracion;
    }

    public long getTiempoRegeneracion() {
        return tiempoRegeneracion;
    }

    public void setTiempoRegeneracion(long tiempoRegeneracion) {
        this.tiempoRegeneracion = tiempoRegeneracion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public String getVersionCookie() {
        return versionCookie;
    }

    public void setVersionCookie(String versionCookie) {
        this.versionCookie = versionCookie;
    }

    public String getEmisorCookie() {
        return emisorCookie;
    }

    public void setEmisorCookie(String emisorCookie) {
        this.emisorCookie = emisorCookie;
    }

    public Sesion getSesion() {
        return sesion;
    }

    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }

    public boolean isSecure() {
        return secure;
    }

    public void setSecure(boolean secure) {
        this.secure = secure;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
