/* SPDX-License-Identifier: BSD-3-Clause */

package it.mds.sdk.rest.api.controller.sdkritorno;

import it.mds.sdk.rest.persistence.entity.sdkritorno.RisultatoElaborazione;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface MonitoraggioService {
    public ResponseEntity<RisultatoElaborazione> getStatoElaborazioni(@RequestParam List<String> idsUpload,@RequestParam(required = false) String nomeFlusso, @RequestParam(required = false) String idRun);
}
