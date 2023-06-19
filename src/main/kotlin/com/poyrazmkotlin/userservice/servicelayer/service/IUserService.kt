package com.poyrazmkotlin.userservice.servicelayer.service

import com.poyrazmkotlin.userservice.dto.request.UserCreateRequest
import com.poyrazmkotlin.userservice.dto.request.UserUpdateRequest
import com.poyrazmkotlin.userservice.dto.response.BaseResponse

interface IUserService {

    fun findAllUsers() : List<BaseResponse>

    fun saveUser(userCreateRequest: UserCreateRequest)

    fun findUserByUserName(username : String) : BaseResponse

    fun updateUserByUserName(username: String, userUpdateRequest: UserUpdateRequest)

    fun deleteUserByUserName(username: String)
}