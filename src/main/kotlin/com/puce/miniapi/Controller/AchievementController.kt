package com.puce.miniapi.Controller

import com.puce.miniapi.Model.Achievement
import com.puce.miniapi.Service.AchievementService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/achievements")
class AchievementController(private val service: AchievementService) {

    @GetMapping
    fun getAll(): List<Achievement> = service.findAll()

    @PostMapping
    fun create(@RequestBody achievement: Achievement): Achievement = service.save(achievement)
}
