package fr.trial.bar.repository

import fr.trial.bar.domain.Beer
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface BeerRepository: CrudRepository<Beer, String> {

    @Query("select * from beers")
    fun findBeers(): List<Beer>
}