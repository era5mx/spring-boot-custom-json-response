/*
 * Copyright david.rengifo.mx 
 * Todos los derechos reservados
 */
package com.anglobal.spring.jsonresponse.service.impl;

import org.springframework.stereotype.Service;

import com.anglobal.spring.jsonresponse.dto.CustomDTO;
import com.anglobal.spring.jsonresponse.response.IResponseCustomDTO;


/**
 * The Class JSONResponseServiceImpl.
 */
@Service
public class JSONResponseCustomServiceImpl implements com.anglobal.spring.jsonresponse.service.IJSONResponseCustomService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anglobal.spring.jsonresponse.service.JSONResponseService#getPeople()
	 */
	@Override
	public IResponseCustomDTO getCustomResponse() {

		CustomDTO dto = new CustomDTO();

		return dto;
	}

}
