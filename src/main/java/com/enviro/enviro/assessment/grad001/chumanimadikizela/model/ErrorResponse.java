package com.enviro.enviro.assessment.grad001.chumanimadikizela.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ErrorResponse {

    public ErrorResponse(String message, List<String> details) {
        super();
        this.message = message;
        this.details = details;
    }
    private String message;
    private List<String> details;
}
