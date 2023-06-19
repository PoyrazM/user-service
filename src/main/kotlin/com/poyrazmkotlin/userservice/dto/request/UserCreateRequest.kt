package com.poyrazmkotlin.userservice.dto.request

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.Size
import org.hibernate.validator.constraints.UniqueElements

data class UserCreateRequest(
    @NotEmpty(message = "")
    @Size(min = 3, message = "")
    val firstName : String,

    @NotEmpty(message = "")
    @Size(min = 3, message = "")
    val lastName : String,

    @NotEmpty
    @Email
    val email: String,

    @NotEmpty
    @UniqueElements(message = "")
    val userName: String,

    @NotEmpty
    val password: String,
)
