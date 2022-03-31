package com.example.kotlintodo.domain.todo

import java.time.LocalDateTime
import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@Table(name = "todos")
class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
    @Lob
    @Column(name = "content")
    var content: String? = null
    @Column(name = "done")
    var done: Boolean = false
    @Column(name = "created_at")
    var createdAt: LocalDateTime = LocalDateTime.now()
    @Column(name = "modified_at")
    var modifiedAt: LocalDateTime = createdAt
}