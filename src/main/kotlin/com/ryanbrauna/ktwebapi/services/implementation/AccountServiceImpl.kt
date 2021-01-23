package com.ryanbrauna.ktwebapi.services.implementation

import com.ryanbrauna.ktwebapi.models.Account
import com.ryanbrauna.ktwebapi.repositories.AccountRepository
import com.ryanbrauna.ktwebapi.services.AccountService
import org.springframework.stereotype.Service
import java.util.*

@Service
class AccountServiceImpl(private val repository: AccountRepository) : AccountService {

    override fun create(account : Account) : Account {
        return repository.save(account)
    }

    override fun getAll() : List<Account> {
        return repository.findAll()
    }

    override fun getById(id : Long) : Optional<Account> {
        return repository.findById(id)
    }

    override fun update(id : Long, account : Account) : Optional<Account> {
        val optional = getById(id)
        if (optional.isEmpty) Optional.empty<Account>()

        return optional.map {
            val accountToUpdate = it.copy(
                name = account.name,
                document = account.document,
                phone = account.phone
            )
            repository.save(accountToUpdate)
        }
    }

    override fun delete(id : Long) {
        repository.findById(id).map {
            repository.delete(it)
        }.orElseThrow { throw RuntimeException("Id not found $id") }

    }

}