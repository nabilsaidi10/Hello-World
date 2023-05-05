/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.presentation;

import de.destatis.ubreg.template.application.StammdatenService;
import de.destatis.ubreg.template.domain.model.stammdaten.Stammdaten;
import de.destatis.ubreg.template.domain.model.stammdaten.StammdatenId;
import de.destatis.ubreg.template.infrastructure.security.MustBeFachadminOrSachbearbeiter;
import de.destatis.ubreg.template.presentation.translation.StammDatenDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/**
 * The MeldedatenPresenter endpoints for access from the frontend viewer.
 *
 * @author cosma
 */
@RestController
@RequestMapping("/presenter/stammdaten")
public class StammdatenPresenter {
	private static final Logger LOG = LoggerFactory.getLogger(StammdatenPresenter.class);

	@Autowired
	private StammdatenService stammdatenService;

	/**
	 * Process allMeldedatenInclFehlerOfBerichtseinheit.
	 *
	 * @param berichtszeitraum        the berichtszeitraum (as specified in
	 *                                {@link Periodizitaet#JAHR}, e.g. 2022-0)
	 * @param berichtseinheitId       the berichtseinheitId
	 * @param bearbeiter              the bearbeiter (may be <code>null</code> or
	 *                                empty if editing is not intended, in case of
	 *                                editing needed to lock the meldedaten and if
	 *                                locking was successful the returned container
	 *                                will include a MeldedatenTicket object, an
	 *                                error message otherwise)
	 * @param forceBearbeiter         <code>TRUE</code> to lock even if the
	 *                                MeldedatenTicket was locked by another
	 *                                bearbeiter
	 * @param excludePlausiFehler     <code>TRUE</code> if PlausiFehler should be
	 *                                excluded
	 * @param includeLieferMeldedaten <code>TRUE</code> if LieferMeldedaten should
	 *                                be included
	 * @return the MeldedatenContainerDto object of the berichtseinheit requested
	 */
	@MustBeFachadminOrSachbearbeiter
	@GetMapping(value = "/{stammdatenId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public @NonNull ResponseEntity<StammDatenDto> allMeldedatenInclFehlerOfBerichtseinheit(
			@NonNull @PathVariable String stammdatenId) {

		Assert.hasLength(stammdatenId, "stammdatenId must not be null or empty.");
		try {
			Stammdaten o = stammdatenService.getStammdatenOfId(new StammdatenId(stammdatenId));
			StammDatenDto dto = new StammDatenDto();
			dto.setQuellregisterId(o.quellregisterId());
			dto.setStammdatenId(o.stammdatenId());

			return new ResponseEntity<StammDatenDto>(dto, HttpStatus.OK);
		} catch (Exception e) {
			String msg = "Reading tammDaten with stammdatenId=" + stammdatenId + " failed due to: "
					+ e.getLocalizedMessage();
			LOG.error(msg);
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, msg);
		}
	}
}
