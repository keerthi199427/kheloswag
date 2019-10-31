package com.myworks.creation.kheloswag.exception;

import com.myworks.creation.kheloswag.model.ApplicationError;
import com.myworks.creation.kheloswag.model.KheloError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(DuplicateRecordException.class)
    public ResponseEntity<KheloError> handleDuplicateRecordException(DuplicateRecordException ex, WebRequest request) {
        List<ApplicationError> applicationErrorList = new ArrayList<>();
        ApplicationError applicationError = new ApplicationError();
        KheloError kheloError = new KheloError();
        applicationError.setCode(ApplicationErrorCode.DUPLICATE_RECORD.getCode());
        applicationError.setMessage(ApplicationErrorCode.DUPLICATE_RECORD.getMessage());
        applicationError.setField(ex.getLocalizedMessage());
        applicationErrorList.add(applicationError);
        kheloError.setErrors(applicationErrorList);
        return  new ResponseEntity<>(kheloError, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoRecordFoundException.class)
    public ResponseEntity<KheloError> handleNoRecordFoundException(NoRecordFoundException ex, WebRequest request) {
        List<ApplicationError> applicationErrorList = new ArrayList<>();
        ApplicationError applicationError = new ApplicationError();
        KheloError kheloError = new KheloError();
        applicationError.setCode(ApplicationErrorCode.NO_RECORD_IN_DB.getCode());
        applicationError.setMessage(ApplicationErrorCode.NO_RECORD_IN_DB.getMessage());
        applicationError.setField(ex.getLocalizedMessage());
        applicationErrorList.add(applicationError);
        kheloError.setErrors(applicationErrorList);
        return  new ResponseEntity<>(kheloError, HttpStatus.NOT_FOUND);
    }
}
