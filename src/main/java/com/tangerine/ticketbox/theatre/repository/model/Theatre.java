package com.tangerine.ticketbox.theatre.repository.model;

import com.tangerine.ticketbox.theatre.vo.AgeRate;
import com.tangerine.ticketbox.theatre.vo.Genre;
import com.tangerine.ticketbox.theatre.vo.Stage;
import com.tangerine.ticketbox.theatre.vo.TheatreName;

import java.time.LocalDate;
import java.util.UUID;


public record Theatre(
        UUID theatreId,
        TheatreName theatreName,
        Genre genre,
        AgeRate ageRate,
        LocalDate openRun,
        LocalDate closeRun,
        Stage stage
) {

}
