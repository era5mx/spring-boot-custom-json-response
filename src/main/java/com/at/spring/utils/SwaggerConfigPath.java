package com.at.spring.utils;

import java.io.IOException;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class SwaggerConfigPath {
	
	private String apiDocs;
	private String configUi;
	private String configSecurity;
	private String resources;
	
	@SuppressWarnings("unused")
	private SwaggerConfigPath() {
		throw new NotImplementedException();
	}
	
	public SwaggerConfigPath(String service) {
		try {
			apiDocs = UtilProperties.getPropValue(service.concat(".apiDocs"));
			configUi = UtilProperties.getPropValue(service.concat(".configUi"));
			configSecurity = UtilProperties.getPropValue(service.concat(".configSecurity"));
			resources = UtilProperties.getPropValue(service.concat(".resources"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public String getApiDocs() {
		return apiDocs;
	}

	public String getConfigUi() {
		return configUi;
	}

	public String getConfigSecurity() {
		return configSecurity;
	}

	public String getResources() {
		return resources;
	}	

}
