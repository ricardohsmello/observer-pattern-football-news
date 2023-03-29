package domain.service

import domain.util.TeamEnum

interface FootballNews {
    fun notify(teamEnum: TeamEnum, msg: String)
}