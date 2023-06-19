package com.poyrazmkotlin.userservice.entity

import jakarta.persistence.*

@Entity
@Table(name = "users")
data class User
(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Long?,

    @Column(name = "first_name")
    val firstName: String,

    @Column(name = "last_name")
    val lastName: String,

    @Column(name = "email")
    val email: String,

    @Column(name = "user_name")
    val userName: String,

    @Column(name = "password")
    val password: String
)
