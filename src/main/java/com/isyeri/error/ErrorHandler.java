package com.isyeri.error;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.boot.web.error.ErrorAttributeOptions;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class ErrorHandler implements ErrorController {

    private final ErrorAttributes errorAttributes;

    @RequestMapping("/error")
    ApiError handleError(WebRequest webRequest, Exception ex){
        Map<String, Object> attributes = this.errorAttributes.getErrorAttributes(webRequest, ErrorAttributeOptions.defaults());
        String message = (String) attributes.get("error");
        String path = (String) attributes.get("path");
        Integer status = (Integer) attributes.get("status");
        return new ApiError(status,message,path);
    }



}
