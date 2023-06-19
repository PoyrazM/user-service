package com.poyrazmkotlin.userservice.servicelayer.impl

import com.poyrazmkotlin.userservice.dao.IUserRepository
import com.poyrazmkotlin.userservice.dto.request.UserCreateRequest
import com.poyrazmkotlin.userservice.dto.request.UserUpdateRequest
import com.poyrazmkotlin.userservice.dto.response.BaseResponse
import com.poyrazmkotlin.userservice.entity.User
import com.poyrazmkotlin.userservice.servicelayer.service.IUserService
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class UserServiceImpl(val userRepository: IUserRepository) : IUserService {


    override fun findAllUsers(): List<BaseResponse> {
        TODO()
    }

    override fun saveUser(userCreateRequest: UserCreateRequest) {
        TODO("Not yet implemented")
    }

    override fun findUserByUserName(username: String): BaseResponse {
        TODO("Not yet implemented")
    }

    override fun updateUserByUserName(username: String, userUpdateRequest: UserUpdateRequest) {
        TODO("Not yet implemented")
    }

    override fun deleteUserByUserName(username: String) {
        TODO("Not yet implemented")
    }
}