
package com.at.spring.jsonresponse.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;

import com.at.spring.jsonresponse.response.IResponseCustomDTO;

public class CustomDTO implements IResponseCustomDTO {

    @Valid
    private ResponseCode responseCode;
    @Valid
    private Response response;
    private boolean ok;
    @Valid
    private List<Object> validations = null;
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CustomDTO() {
    }

    /**
     * 
     * @param response
     * @param responseCode
     * @param validations
     * @param ok
     */
    public CustomDTO(ResponseCode responseCode, Response response, boolean ok, List<Object> validations) {
        super();
        this.responseCode = responseCode;
        this.response = response;
        this.ok = ok;
        this.validations = validations;
    }

    public ResponseCode getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(ResponseCode responseCode) {
        this.responseCode = responseCode;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public List<Object> getValidations() {
        return validations;
    }

    public void setValidations(List<Object> validations) {
        this.validations = validations;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
