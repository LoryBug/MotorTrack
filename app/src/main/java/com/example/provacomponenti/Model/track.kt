package com.example.provacomponenti.Model

data class Track(
    val id: String? = null,
    val name: String? = null,
    val km: Float? = null,
    val description: String? = null,
    val typeOfTrack: String? = null, // sterrato, strada, etc
    val difficulty: String? = null, //facile medio difficile
)
val tracks = listOf(
    Track(
        id = "#001",
        name = "Passo del Muraglione",
        km = 160.8f,
        description = "Uno dei passi più famosi di tutta la Romagna",
        typeOfTrack = "Stradale",
        difficulty = "Medio"
    ),
    Track(
        id = "#002",
        name = "Monte della Birra",
        km = 65.3f,
        description = "Sterrato immerso nella natura",
        typeOfTrack = "Sterrato",
        difficulty = "Medio"
    ),
    Track(
        id = "#003",
        name = "Rocca delle camminate",
        km = 77.6f,
        description = "Re dei tornanti",
        typeOfTrack = "Stradale",
        difficulty = "Medio"
    ),
    Track(
        id = "#004",
        name = "Passo della Futa",
        km = 257.5f,
        description = "Re dei tornanti",
        typeOfTrack = "Stradale",
        difficulty = "Medio"
    )
)
