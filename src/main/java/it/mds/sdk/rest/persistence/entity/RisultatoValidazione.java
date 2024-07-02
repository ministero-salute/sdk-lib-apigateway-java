/* SPDX-License-Identifier: BSD-3-Clause */

package it.mds.sdk.rest.persistence.entity;

import it.mds.sdk.gestoreesiti.modelli.EsitiValidazione;
import lombok.Data;

@Data
public class RisultatoValidazione extends AbstractSecurityModel {

    private Boolean isValidato;
    private EsitiValidazione esitiValidazione;
    private String idRun;
    private String idClient;

    public RisultatoValidazione(Boolean isValidato, EsitiValidazione esitiValidazione, String idRun, String idClient) {
        this.isValidato = isValidato;
        this.esitiValidazione = esitiValidazione;
        this.idRun = idRun;
        this.idClient = idClient;
    }

}
