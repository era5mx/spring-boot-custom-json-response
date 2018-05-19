/*
 * Copyright david.rengifo.mx 
 * Todos los derechos reservados
 */
package com.anglobal.spring.jsonresponse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anglobal.spring.jsonresponse.response.JSONResponse;
import com.anglobal.spring.jsonresponse.response.ResponseStatus;
import com.anglobal.spring.jsonresponse.service.IJSONResponseService;


/**
 * The Class JSONResponseController.
 */
@RestController
@RequestMapping(value = "/person")
public class JSONResponseController {

	/** The i JSON response service. */
	@Autowired
	private IJSONResponseService iJSONResponseService;

	/**
	 * Gets the person list.
	 *
	 * @return the person list
	 */
	@RequestMapping(method = RequestMethod.GET)
	public JSONResponse getPersonList() {

		JSONResponse jsonResponse = new JSONResponse();

		try {
			jsonResponse.getData().put("responseData", iJSONResponseService.getPeople());
			jsonResponse.setStatus(ResponseStatus.SUCCESS);
			jsonResponse.setMessage("Person list fetched successfully.");
		} catch (Exception e) {
			jsonResponse.setStatus(ResponseStatus.FAILURE);
			jsonResponse.setMessage("Unable to fetch the list.");
		}

		return jsonResponse;
	}
}
