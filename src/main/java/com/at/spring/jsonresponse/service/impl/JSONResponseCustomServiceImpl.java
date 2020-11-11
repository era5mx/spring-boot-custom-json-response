/*
* 
 * Todos los derechos reservados
 */
package com.at.spring.jsonresponse.service.impl;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.at.spring.jsonresponse.dto.CustomDTO;
import com.at.spring.jsonresponse.response.IResponseCustomDTO;
import com.at.spring.utils.UtilProperties;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * The Class JSONResponseServiceImpl.
 */
@Service
public class JSONResponseCustomServiceImpl implements com.at.spring.jsonresponse.service.IJSONResponseCustomService {

	private String pathJSON ="pathJSON";
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.at.spring.jsonresponse.service.JSONResponseService#getPeople()
	 */
	@Override
	public IResponseCustomDTO getCustomResponse() {
		//String path = "C:\\Users\\alexander\\git\\spring-boot-custom-json-response\\src\\main\\java\\com\\anglobal\\spring\\jsonresponse\\dto\\json\\response-gatewayap-mxmultivendoratm.json";
		CustomDTO dto = null;
		try {
			dto = loadJSON(UtilProperties.getPropValue(pathJSON));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
