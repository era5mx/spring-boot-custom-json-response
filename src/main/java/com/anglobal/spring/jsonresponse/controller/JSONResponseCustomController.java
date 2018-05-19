/*
 * Copyright david.rengifo.mx 
 * Todos los derechos reservados
 */
package com.anglobal.spring.jsonresponse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anglobal.spring.jsonresponse.response.JSONCustomResponse;
import com.anglobal.spring.jsonresponse.response.CustomResponseStatus;
import com.anglobal.spring.jsonresponse.service.IJSONResponseCustomService;


/**
 * The Class JSONResponseCustomController.
 */
@RestController
@RequestMapping(value = "/custom")
public class JSONResponseCustomController {

	/** The i JSON response service. */
	@Autowired
	private IJSONResponseCustomService iJSONResponseCustomService;

	/**
	 * Gets the person list.
	 *
	 * @return the person list
	 */
	@RequestMapping(method = RequestMethod.GET)
	public JSONCustomResponse getCustomList() {

		JSONCustomResponse jsonCustomResponse = new JSONCustomResponse();

		try {
			jsonCustomResponse.getData().put("responseData", iJSONResponseCustomService.getCustomResponse());
			jsonCustomResponse.setStatus(CustomResponseStatus.SUCCESS);
			jsonCustomResponse.setMessage("Custom list fetched successfully.");
		} catch (Exception e) {
			jsonCustomResponse.setStatus(CustomResponseStatus.FAILURE);
			jsonCustomResponse.setMessage("Unable to fetch the list.");
		}

		return jsonCustomResponse;
	}
}
