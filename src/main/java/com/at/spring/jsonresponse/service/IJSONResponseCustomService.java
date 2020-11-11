/*
* 
 * Todos los derechos reservados
 */
package com.at.spring.jsonresponse.service;

import com.at.spring.jsonresponse.response.IResponseCustomDTO;


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
