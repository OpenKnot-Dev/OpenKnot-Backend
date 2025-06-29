package com.kancth.openknot.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table
import org.hibernate.annotations.SQLDelete
import java.time.LocalDateTime

@Entity
@Table(
    name = "account",
)
@SQLDelete(sql = "UPDATE ACCOUNT SET DELETED_AT = NOW() WHERE id = ?")
class Account(
    @Column(nullable = false)
    var name: String,
    @Column(nullable = false)
    var nickname: String,
    @Column(nullable = false)
    var email: String,
    @Column(nullable = false)
    var password: String,
    @Column(nullable = false)
    var lastLoginAt: LocalDateTime? = null,
): BaseEntity()