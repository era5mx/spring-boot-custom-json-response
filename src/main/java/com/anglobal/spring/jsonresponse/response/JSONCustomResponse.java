/*
 * Copyright david.rengifo.mx 
 * Todos los derechos reservados
 */
package com.anglobal.spring.jsonresponse.response;

import java.util.HashMap;
import java.util.Map;

import com.anglobal.spring.jsonresponse.response.IResponseCustomDTO;
import com.anglobal.spring.jsonresponse.response.CustomResponseStatus;


/**
 * The Class JSONResponse.
 */
public class JSONCustomResponse {

	/** The data. */
	private Map<String, IResponseCustomDTO> data = new HashMap<String, IResponseCustomDTO>();
	
	/** The status. */
	private CustomResponseStatus status;
	
	/** The message. */
	private String message;

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public Map<String, IResponseCustomDTO> getData() {
		return data;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public CustomResponseStatus getStatus() {
		return status;
	}

	/**
	 * Sets the data.
	 *
	 * @param data the data
	 */
	public void setData(Map<String, IResponseCustomDTO> data) {
		this.data = data;
	}

	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(CustomResponseStatus status) {
		this.status = status;
	}

}
