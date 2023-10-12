package it.mds.sdk.rest.exception;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Value
@Builder(setterPrefix = "with")
@Data
public class ApiErrorResponse {
    String error;
    String message;
    String descrizione;
    String riga;
}
