/* SPDX-License-Identifier: BSD-3-Clause */

package it.mds.sdk.rest.persistence.entity;

import it.mds.sdk.gestoreesiti.modelli.ModalitaOperativa;
import lombok.Data;

import javax.validation.constraints.Pattern;

@Data
public class FlussoRequest {

    @Pattern(regexp = "^[A-Za-z0-9-_\\.]*$")
    String nomeFile;
    ModalitaOperativa modalitaOperativa;
    @Pattern(regexp = "^\\d+$")
    String idClient;
    @Pattern(regexp = "^\\d+$")
    String annoRiferimento;
    @Pattern(regexp = "^[A-Za-z0-9]*$")
    String periodoRiferimento;
    @Pattern(regexp = "^[A-Za-z0-9]*$")
    String codiceRegione;

}
