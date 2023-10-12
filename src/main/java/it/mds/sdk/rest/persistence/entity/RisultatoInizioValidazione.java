package it.mds.sdk.rest.persistence.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RisultatoInizioValidazione extends AbstractSecurityModel {

    private Boolean isIniziato;
    private String descrizioneErrore;
    private String idrun;
    private String idClient;

    public RisultatoInizioValidazione(@JsonProperty("idIniziato") Boolean isIniziato,
                                      @JsonProperty("descrizioneErrore") String descrizioneErrore,
                                      @JsonProperty("idRun") String idrun,
                                      @JsonProperty("idClient") String idClient) {
        this.isIniziato = isIniziato;
        this.descrizioneErrore = descrizioneErrore;
        this.idrun = idrun;
        this.idClient = idClient;
    }

}
