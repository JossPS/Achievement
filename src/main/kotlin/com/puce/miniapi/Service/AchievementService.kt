package com.puce.miniapi.Service

import com.puce.miniapi.Model.Achievement
import com.puce.miniapi.Repository.AchievementRepository
import org.springframework.stereotype.Service

@Service
class AchievementService(private val repository: AchievementRepository) {
    fun findAll(): List<Achievement> = repository.findAll()
    fun save(achievement: Achievement): Achievement = repository.save(achievement)
}
