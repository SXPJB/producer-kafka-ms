package com.fsociety.producerkafkams.domain.repository

import com.fsociety.producerkafkams.domain.entity.TodoUser
import org.springframework.data.jpa.repository.JpaRepository

interface TodoUserRepository : JpaRepository<TodoUser, Long>