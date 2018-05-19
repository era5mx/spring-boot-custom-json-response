/*
 * Copyright david.rengifo.mx 
 * Todos los derechos reservados
 */
package com.anglobal.spring.jsonresponse.service.impl;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.anglobal.spring.jsonresponse.dto.CustomDTO;
import com.anglobal.spring.jsonresponse.response.IResponseCustomDTO;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


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
		String path = "C:\\Users\\alexander\\git\\spring-boot-custom-json-response\\src\\main\\java\\com\\anglobal\\spring\\jsonresponse\\dto\\json\\response-gatewayap-mxmultivendoratm.json";
		CustomDTO dto = loadJSON(path);
		return dto;
	}
	
	
	private CustomDTO loadJSON(String path) {
		ObjectMapper mapper = new ObjectMapper();
		CustomDTO dto = null;
		try {
			dto = mapper.readValue(new File(path), CustomDTO.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}

}
