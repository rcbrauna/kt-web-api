package com.ryanbrauna.ktwebapi.repositories

import com.ryanbrauna.ktwebapi.models.Account
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountRepository : JpaRepository<Account, Long> {
}