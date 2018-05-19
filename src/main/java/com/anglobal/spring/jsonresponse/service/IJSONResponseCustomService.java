/*
 * Copyright david.rengifo.mx 
 * Todos los derechos reservados
 */
package com.anglobal.spring.jsonresponse.service;

import com.anglobal.spring.jsonresponse.response.IResponseCustomDTO;


/**
 * The Interface IJSONResponseService.
 */
public interface IJSONResponseCustomService {

	/**
	 * A dummy service which returns a DTO list consisting the objects requested
	 * by client. This list will be converted into json.
	 *
	 * @return the people
	 */
	public IResponseCustomDTO getCustomResponse();
}
