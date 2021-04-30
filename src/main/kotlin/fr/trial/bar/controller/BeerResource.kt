package fr.trial.bar.controller

import fr.trial.bar.domain.Beer
import fr.trial.bar.service.BeerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BeerResource(val beerService: BeerService) {

    @GetMapping
    fun index(): List<Beer> = beerService.findBeers()

    @PostMapping
    fun post(@RequestBody beer: Beer) {
        beerService.post(beer)
    }
}