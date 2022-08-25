package com.example.fifaapp.model

data class FixtureData (
    val id: Long,
    val idCountry: Any? = null,
    val countryName: Any? = null,
    val idLeague: Long,
    val leagueName: String,
    val idSeason: Long,
    val seasonName: String,
    val idHome: Long,
    val homeName: String,
    val idAway: Long,
    val awayName: String,
    val idStage: Long,
    val idVenue: Any? = null,
    val venueName: Any? = null,
    val date: String,
    val status: String,
    val round: Long? = null,
    val attendance: Any? = null,
    val teamHome90MinGoals: Long,
    val teamAway90MinGoals: Long,
    val teamHomeETGoals: Long,
    val teamAwayETGoals: Long,
    val teamHomePENGoals: Long,
    val teamAwayPENGoals: Long,
    val teamHome1StHalfGoals: Long,
    val teamAway1StHalfGoals: Long,
    val teamHome2NdHalfGoals: Long,
    val teamAway2NdHalfGoals: Long,

    val elapsed: Long? = null,
    val elapsedPlus: Long? = null,
    val eventsHash: Any? = null,
    val lineupsHash: Any? = null,
    val statsHash: Any? = null,
    val referees: Any? = null

        ) {
}