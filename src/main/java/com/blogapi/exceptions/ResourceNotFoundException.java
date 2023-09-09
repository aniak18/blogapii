package com.blogapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{//Status Code 404

    public ResourceNotFoundException(long id){
        super("Resource Not Found For id:" +id);
    }
}


