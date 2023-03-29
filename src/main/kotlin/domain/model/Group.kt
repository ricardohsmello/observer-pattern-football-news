package domain.model

import domain.service.FootballNews
import domain.util.TeamEnum
import java.util.*
import kotlin.collections.ArrayList

class Group(teamEnum: TeamEnum) {
    private val listeners: MutableMap<TeamEnum, MutableList<FootballNews>> = EnumMap(TeamEnum::class.java)
    private val teamEnum: TeamEnum

    init {
        this.teamEnum = teamEnum
        listeners[teamEnum] = ArrayList()
    }

    fun subscribe(fan: FootballNews) {
        val list: MutableList<FootballNews> = listeners[teamEnum]!!
        list.add(fan)
    }

    fun unsubscribe(fan: FootballNews) {
        val list: MutableList<FootballNews> = listeners[teamEnum]!!
        list.remove(fan)
    }

    fun notify(message: String) {
        val fans: List<FootballNews> = listeners[teamEnum]!!
        for (sub in fans) {
            sub.notify(teamEnum, message)
        }
    }
}

