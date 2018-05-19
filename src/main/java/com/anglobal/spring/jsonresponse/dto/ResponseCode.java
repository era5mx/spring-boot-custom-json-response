
package com.anglobal.spring.jsonresponse.dto;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;

public class ResponseCode {

    private String code;
    private String message;
    private String level;
    private String description;
    private String moreInfo;
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseCode() {
    }

    /**
     * 
     * @param message
     * @param level
     * @param description
     * @param code
     * @param moreInfo
     */
    public ResponseCode(String code, String message, String level, String description, String moreInfo) {
        super();
        this.code = code;
        this.message = message;
        this.level = level;
        this.description = description;
        this.moreInfo = moreInfo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
