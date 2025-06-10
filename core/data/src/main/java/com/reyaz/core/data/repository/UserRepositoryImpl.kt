package com.reyaz.core.data.repository

import com.reyaz.core.domain.model.User
import com.reyaz.core.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepositoryImpl @Inject constructor() : UserRepository {
    
    private val users = listOf(
        User("1", "John Doe", "john@example.com"),
        User("2", "Jane Smith", "jane@example.com")
    )
    
    override fun getUsers(): Flow<List<User>> {
        return flowOf(users)
    }
    
    override suspend fun getUserById(id: String): User? {
        return users.find { it.id == id }
    }
}