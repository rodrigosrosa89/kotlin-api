package com.rodao.bankapi

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity(name = "accounts")
data class Account(

	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	var id: Long? = null,
	var name: String,
	val document: String,
	val phone: String
)

