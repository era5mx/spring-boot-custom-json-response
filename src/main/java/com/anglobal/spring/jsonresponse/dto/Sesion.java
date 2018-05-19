
package com.anglobal.spring.jsonresponse.dto;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;

public class Sesion {

    private String vigenciaCookie;
    private String vigenciaToken;
    private String accessToken;
    private String appId;
    private String centroCostos;
    private long expireToken;
    private String idHash;
    private String perfil;
    private String puesto;
    private String sessionId;
    private String usuario;
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sesion() {
    }

    /**
     * 
     * @param centroCostos
     * @param vigenciaCookie
     * @param appId
     * @param accessToken
     * @param usuario
     * @param sessionId
     * @param puesto
     * @param expireToken
     * @param idHash
     * @param perfil
     * @param vigenciaToken
     */
    public Sesion(String vigenciaCookie, String vigenciaToken, String accessToken, String appId, String centroCostos, long expireToken, String idHash, String perfil, String puesto, String sessionId, String usuario) {
        super();
        this.vigenciaCookie = vigenciaCookie;
        this.vigenciaToken = vigenciaToken;
        this.accessToken = accessToken;
        this.appId = appId;
        this.centroCostos = centroCostos;
        this.expireToken = expireToken;
        this.idHash = idHash;
        this.perfil = perfil;
        this.puesto = puesto;
        this.sessionId = sessionId;
        this.usuario = usuario;
    }

    public String getVigenciaCookie() {
        return vigenciaCookie;
    }

    public void setVigenciaCookie(String vigenciaCookie) {
        this.vigenciaCookie = vigenciaCookie;
    }

    public String getVigenciaToken() {
        return vigenciaToken;
    }

    public void setVigenciaToken(String vigenciaToken) {
        this.vigenciaToken = vigenciaToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getCentroCostos() {
        return centroCostos;
    }

    public void setCentroCostos(String centroCostos) {
        this.centroCostos = centroCostos;
    }

    public long getExpireToken() {
        return expireToken;
    }

    public void setExpireToken(long expireToken) {
        this.expireToken = expireToken;
    }

    public String getIdHash() {
        return idHash;
    }

    public void setIdHash(String idHash) {
        this.idHash = idHash;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
