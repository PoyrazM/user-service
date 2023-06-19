package com.poyrazmkotlin.userservice.dto.response

import java.time.LocalDateTime

data class BaseResponse
(
    val status: String,
    val timeStamp: LocalDateTime,
    val userResponse: UserResponse
)
