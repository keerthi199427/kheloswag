package com.myworks.creation.kheloswag.exception;

import com.myworks.creation.kheloswag.model.ApplicationError;
import com.myworks.creation.kheloswag.model.DistrictError;
import com.myworks.creation.kheloswag.model.User;
import com.myworks.creation.kheloswag.model.UserError;
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
    public ResponseEntity<UserError> handleDuplicateRecordException(DuplicateRecordException ex, WebRequest request) {
        List<ApplicationError> applicationErrorList = new ArrayList<>();
        ApplicationError applicationError = new ApplicationError();
        UserError userError = new UserError();
        applicationError.setCode(ApplicationErrorCode.DUPLICATE_RECORD.getCode());
        applicationError.setMessage(ApplicationErrorCode.DUPLICATE_RECORD.getMessage());
        applicationError.setField(ex.getLocalizedMessage());
        applicationErrorList.add(applicationError);
        userError.setErrors(applicationErrorList);
        return  new ResponseEntity<>(userError, HttpStatus.BAD_REQUEST);
    }
}
