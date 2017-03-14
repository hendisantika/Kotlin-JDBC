package com.hendisantika.kotlin

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

/**
 * Created by hendisantika on 24/01/17.
 */
@RestController
class UserController @Autowired constructor(val userDao: UserDao){
//    @Autowired
//    private var userDao: UserDao? = null

    @RequestMapping(value = "/create", method = arrayOf(RequestMethod.POST))
//    fun addUser(@RequestBody user: User) = userDao.save(user) // <- Kalo pake yg ini OK. Tai kao pake yg bawah koq error ya?
    @ResponseBody
    fun create(name: String, email: String): User? {
        try {
            var newUser = User(name = name, email = email)
            userDao?.save(newUser)

            return newUser
        } catch(e: Exception) {
            return throw error("Error nich --> " + e.message.toString())
        }
    }


    @RequestMapping("/delete")
    @ResponseBody
    fun delete(id: Long): String {
        try {
            var user = User(id)
            userDao?.delete(user)

            return id.toString() + "deleted"
        } catch(e: Exception) {
            return "delete error " + e.message.toString()
        }
    }

    @RequestMapping("/get-by-email")
    @ResponseBody
    fun getByEmail(email: String): User? {
        try {
            var user = userDao?.findByEmail(email)
            if (user != null) {
                return user
            } else {
                return null
            }
        } catch(e: Exception) {
            return null
        }
    }

    @RequestMapping("/update")
    @ResponseBody
    fun updateUser(id: Long, name: String, email: String): User? {
        try {
            var user: User? = userDao?.findOne(id) ?: return null

            user?.name = name
            user?.email = email
            userDao?.save(user)

            return user
        } catch(e: Exception) {
            return null
        }
    }


    @RequestMapping("/all")
    @ResponseBody
    fun all() = userDao.findAll()

}