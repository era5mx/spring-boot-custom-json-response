/*
 * Copyright david.rengifo.mx 
 * Todos los derechos reservados
 */
package com.anglobal.spring.jsonresponse.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * The Class JSONResponse.
 */
public class JSONResponse {

	/** The data. */
	private Map<String, List<? extends IResponseDTO>> data = new HashMap<String, List<? extends IResponseDTO>>();
	
	/** The status. */
	private ResponseStatus status;
	
	/** The message. */
	private String message;

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public Map<String, List<? extends IResponseDTO>> getData() {
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
	public ResponseStatus getStatus() {
		return status;
	}

	/**
	 * Sets the data.
	 *
	 * @param data the data
	 */
	public void setData(Map<String, List<? extends IResponseDTO>> data) {
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
	public void setStatus(ResponseStatus status) {
		this.status = status;
	}

}
