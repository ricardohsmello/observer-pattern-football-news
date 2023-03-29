package domain.model

import domain.service.FootballNews
import domain.util.TeamEnum

data class Fan(
    private val name: String
) : FootballNews {
    override fun notify(teamEnum: TeamEnum, msg: String) {
        println("Hello $name, please check the following news about $teamEnum: \n$msg\n")
    }
}