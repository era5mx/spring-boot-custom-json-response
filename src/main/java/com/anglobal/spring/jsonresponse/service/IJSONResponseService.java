/*
 * Copyright david.rengifo.mx 
 * Todos los derechos reservados
 */
package com.anglobal.spring.jsonresponse.service;

import java.util.List;

import com.anglobal.spring.jsonresponse.response.IResponseDTO;


/**
 * The Interface IJSONResponseService.
 */
public interface IJSONResponseService {

	/**
	 * A dummy service which returns a DTO list consisting the objects requested
	 * by client. This list will be converted into json.
	 *
	 * @return the people
	 */
	public List<? extends IResponseDTO> getPeople();
}
