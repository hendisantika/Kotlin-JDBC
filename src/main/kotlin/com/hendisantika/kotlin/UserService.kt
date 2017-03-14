package com.hendisantika.kotlin

import org.springframework.data.repository.CrudRepository
import javax.transaction.Transactional

/**
 * Created by hendisantika on 24/01/17.
 */
@Transactional
interface UserDao : CrudRepository<User, Long> {
    fun findByEmail(email: String): User?
}