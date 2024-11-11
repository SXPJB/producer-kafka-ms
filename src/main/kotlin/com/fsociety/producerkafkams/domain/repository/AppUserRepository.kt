package com.fsociety.producerkafkams.domain.repository

import com.fsociety.producerkafkams.domain.entity.AppUser
import org.springframework.data.jpa.repository.JpaRepository

interface AppUserRepository : JpaRepository<AppUser, Long>