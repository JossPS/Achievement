package com.puce.miniapi.Repository

import com.puce.miniapi.Model.Achievement
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AchievementRepository : JpaRepository<Achievement, Long>
