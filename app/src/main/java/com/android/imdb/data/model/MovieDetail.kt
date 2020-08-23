package com.android.imdb.data.model

data class MovieDetail(
    val id: Long = 1,
    val imdbID: String,
    val title: String,
    val year: String,
    var rated: String?,
    var released: String?,
    var runtime: String?,
    var genre: String?,
    var director: String?,
    var writer: String?,
    var actors: String?,
    var plot: String?,
    var language: String?,
    var country: String?,
    var awards: String?,
    val poster: String,
    var ratings: List<Rating>?,
    var metascore: String?,
    var imdbRating: String?,
    var imdbVotes: String?,
    val type: String,
    var dvd: String?,
    var boxOffice: String?,
    var totalSeasons: String?,
    var production: String?,
    var website: String?,
    var response: String?,
    var fetchedBefore: Boolean = false
)