package com.fsociety.producerkafkams.domain.entity

import com.fsociety.producerkafkams.common.enums.TodoState
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "todo_user")
class TodoUser(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @ManyToOne
    @JoinColumn(name = "id_todo")
    val todo: Todo,
    @ManyToOne
    @JoinColumn(name = "id_user")
    val user: AppUser,
    @Enumerated(EnumType.STRING)
    @Column(name = "state")
    val state: TodoState,
    @Column(name = "updated_at")
    val updatedAt: LocalDateTime = LocalDateTime.now()
)
