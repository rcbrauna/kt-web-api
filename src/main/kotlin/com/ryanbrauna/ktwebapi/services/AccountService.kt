package com.ryanbrauna.ktwebapi.services;

import com.ryanbrauna.ktwebapi.models.Account;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.*

interface AccountService {
    fun create (@RequestBody account :Account): Account

    fun getAll() : List<Account>

    fun getById(id : Long) : Optional<Account>

    fun update(id : Long, account : Account) : Optional<Account>

    fun delete(id : Long)

}
