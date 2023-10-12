package it.mds.sdk.rest.persistence.entity.sdkritorno;

import it.mds.sdk.gestoreesiti.modelli.InfoElaborazione;
import lombok.Data;

import java.util.List;

@Data
public class RisultatoElaborazione {

    private List<InfoElaborazione> infoElaborazioneList;
}
