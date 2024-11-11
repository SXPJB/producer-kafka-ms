package com.fsociety.producerkafkams.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Id
import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import java.time.LocalDateTime

@Entity
@Table(name = "app_user")
class AppUser(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column(name = "fist_name")
    val firstName: String,
    @Column(name = "last_name")
    val lastName: String,
    @Column(name = "created_at")
    val createAt: LocalDateTime,
    @Column(name = "update_at")
    val updatedAt: LocalDateTime
)