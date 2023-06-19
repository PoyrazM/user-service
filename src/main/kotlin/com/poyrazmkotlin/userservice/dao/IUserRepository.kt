package com.poyrazmkotlin.userservice.dao

import com.poyrazmkotlin.userservice.entity.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface IUserRepository : CrudRepository<User, Long> {
    fun findUserByUserName(username: String)
}