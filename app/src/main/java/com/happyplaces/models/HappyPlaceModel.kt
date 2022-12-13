package com.happyplaces.models

import java.io.Serializable

/**
 * A Data Model Class for Happy Place details.
 * dealing with local SQLite database.
 */
data class HappyPlaceModel(
    val id: Int,
    val title: String,
    val image: String,
    val description: String,
    val date: String,
    val location: String,
    val latitude: Double,
    val longitude: Double
) : Serializable