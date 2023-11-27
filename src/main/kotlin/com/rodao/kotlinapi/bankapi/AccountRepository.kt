package com.rodao.kotlinapi.bankapi

import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository : JpaRepository<com.rodao.kotlinapi.bankapi.Account, Long> {
}