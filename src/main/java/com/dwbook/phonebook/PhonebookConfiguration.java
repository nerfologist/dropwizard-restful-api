package com.dwbook.phonebook;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;

public class PhonebookConfiguration extends Configuration {
    @JsonProperty
    @NotEmpty
    private String message;

    @JsonProperty
    @Max(10)
    private int messageRepetitions;

    @JsonProperty
    private String additionalMessage = "Optional message not assigned!";

    public String getMessage() {
        return this.message;
    }

    public int getMessageRepetitions() {
        return this.messageRepetitions;
    }

    public String getAdditionalMessage() {
        return this.additionalMessage;
    }
}
