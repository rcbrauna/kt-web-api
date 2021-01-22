package com.ryanbrauna.ktwebapi.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "ACCOUNTS")
data class Account(
    @Id
    @GeneratedValue
    var id : Long? = null,
    val name : String,
    val document : String,
    val phone : String
) {}