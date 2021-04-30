package fr.trial.bar.service

import fr.trial.bar.domain.Beer
import fr.trial.bar.repository.BeerRepository
import org.springframework.stereotype.Service

@Service
class BeerService(val db:BeerRepository) {

    fun findBeers(): List<Beer> = db.findBeers()

    fun post(beer: Beer) {
        db.save(beer)
    }
}