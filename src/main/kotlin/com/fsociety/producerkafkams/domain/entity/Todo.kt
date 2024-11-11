package com.fsociety.producerkafkams.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Id
import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import java.time.LocalDateTime

@Entity
@Table(name = "todo")
class Todo(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column(name = "title")
    val title: String,
    @Column(name = "description")
    val description: String,
    @Column(name = "created_at")
    val createdAt: LocalDateTime,
    @Column(name = "updated_at")
    val updatedAt: LocalDateTime
)
