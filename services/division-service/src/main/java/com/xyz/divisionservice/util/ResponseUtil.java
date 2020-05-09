package com.xyz.divisionservice.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.xyz.divisionservice.response.APIResponse;
import com.xyz.divisionservice.response.ErrorResponse;

public class ResponseUtil {
	
	public static <T> ResponseEntity<APIResponse<T>> getApiResponse(T result) {
		return getApiResponse(result, null);
	}

	public static <T> ResponseEntity<APIResponse<T>> getApiResponse(ErrorResponse error) {
		return getApiResponse(null, error);
	}

	public static <T> ResponseEntity<APIResponse<T>> getApiResponse(T result, ErrorResponse error) {
		APIResponse<T> apiResponse = new APIResponse<T>(result, error);
		return new ResponseEntity<APIResponse<T>>(apiResponse, HttpStatus.OK);
	}
}
