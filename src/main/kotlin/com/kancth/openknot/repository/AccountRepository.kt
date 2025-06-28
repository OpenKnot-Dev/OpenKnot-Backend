package com.kancth.openknot.repository

import com.kancth.openknot.entity.Account
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface AccountRepository: JpaRepository<Account, UUID>