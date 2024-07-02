/* SPDX-License-Identifier: BSD-3-Clause */

package it.mds.sdk.rest.api.controller;

import it.mds.sdk.gestoreesiti.modelli.InfoRun;
import it.mds.sdk.libreriaregole.dtos.RecordDtoGenerico;
import it.mds.sdk.rest.persistence.entity.FlussoRequest;
import it.mds.sdk.rest.persistence.entity.RecordRequest;
import it.mds.sdk.rest.persistence.entity.RisultatoInizioValidazione;
import it.mds.sdk.rest.persistence.entity.RisultatoValidazione;
import org.springframework.http.ResponseEntity;

/**
 * L'interfaccia mette a disposizione del Client una serie di metodi:
 * 1)Il metodo validaTracciato permette di validare un intero tracciato a partire dal file specificato in ingresso tramite nome del file,
 * il risultato della validazione istanza della classe RisultatoInizioValidazione contiene le informazioni sul corretto avvio del processo di validazione.
 * L’implementazione del metodo chiamerà la libreria delle regole per iniziare l’elaborazione.
 * <p>
 * 2)Il metodo validaRecord permette la validazione del singolo record a partire da un DTO estensione della classe RecordDTOGenerico.
 * Questa validazione è sincrona e il RisultatoValidazione contiene tutte le informazioni sulla validazione.
 * <p>
 * 3)Il metodo informazioniRun dato un idRun o un idClient restituisce le informazioni relative a quella run fornite dalla libreria log.
 * <p>
 * L’interfaccia aderisce alla specifica OpenAPI 3.0.3.
 */
public interface ValidazioneController<T extends RecordDtoGenerico> {

    ResponseEntity<RisultatoInizioValidazione> validaTracciato(FlussoRequest flusso, String nomeFlusso);

    ResponseEntity<RisultatoValidazione> validaRecord(RecordRequest<T> recordRequest, String nomeFlusso);

    ResponseEntity<InfoRun> informazioniRun(String idRun, String idClient);

}
