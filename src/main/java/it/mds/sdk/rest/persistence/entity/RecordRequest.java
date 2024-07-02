/* SPDX-License-Identifier: BSD-3-Clause */

package it.mds.sdk.rest.persistence.entity;

import it.mds.sdk.gestoreesiti.modelli.ModalitaOperativa;
import it.mds.sdk.libreriaregole.dtos.RecordDtoGenerico;
import lombok.Data;

@Data
public class RecordRequest<T extends RecordDtoGenerico> {

    String idClient;
    ModalitaOperativa modalitaOperativa;
    T recordDto;
    String annoRiferimento;
    String periodoRiferimento;
    String codiceRegione;

}
