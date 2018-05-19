/*
 * Copyright david.rengifo.mx 
 * Todos los derechos reservados
 */
package com.anglobal.spring.jsonresponse.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.anglobal.spring.jsonresponse.dto.PersonDTO;
import com.anglobal.spring.jsonresponse.response.IResponseDTO;


/**
 * The Class JSONResponseServiceImpl.
 */
@Service
public class JSONResponseServiceImpl implements com.anglobal.spring.jsonresponse.service.IJSONResponseService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anglobal.spring.jsonresponse.service.JSONResponseService#getPeople()
	 */
	@Override
	public List<? extends IResponseDTO> getPeople() {

		List<PersonDTO> people = new ArrayList<PersonDTO>();

		// Creating a dummy list of DTO objects
		for (int i = 1; i <= 3; i++) {
			PersonDTO person = new PersonDTO();
			person.setName("Person " + i);
			person.setAge(20 + i);
			person.setCity("City " + i);
			people.add(person);
		}

		return people;
	}

}
