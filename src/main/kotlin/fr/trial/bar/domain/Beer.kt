package fr.trial.bar.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("BEERS")
data class Beer(@Id val id: String?, val name: String)
