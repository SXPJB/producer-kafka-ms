package com.fsociety.producerkafkams.domain.repository

import com.fsociety.producerkafkams.domain.entity.Todo
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository : JpaRepository<Todo, Long>