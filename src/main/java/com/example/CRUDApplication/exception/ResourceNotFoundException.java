package com.example.CRUDApplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String resourceName, String fieldNAme, Object fieldValue) {
        super(String.format("%s not found with %s : '%s'",resourceName,fieldNAme,fieldValue));
        this.resourceName = resourceName;
        this.fieldNAme = fieldNAme;
        this.fieldValue = fieldValue;
    }

        private String resourceName;
        private String fieldNAme;
        private Object fieldValue;

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getFieldNAme() {
        return fieldNAme;
    }

    public void setFieldNAme(String fieldNAme) {
        this.fieldNAme = fieldNAme;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(Object fieldValue) {
        this.fieldValue = fieldValue;
    }
}
