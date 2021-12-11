package br.com.wgsolution.msproduct.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 5255653883574974078L;
	
	public ResourceNotFoundException(String ex) {
		super(ex);
	}
}
