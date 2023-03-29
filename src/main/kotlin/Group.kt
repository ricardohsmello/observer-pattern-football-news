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

    fun subscribe(user: FootballNews) {
        val list: MutableList<FootballNews> = listeners[teamEnum]!!
        list.add(user)
    }

    fun unsubscribe(user: FootballNews) {
        val list: MutableList<FootballNews> = listeners[teamEnum]!!
        list.remove(user)
    }

    fun notify(msg: String) {
        val users: List<FootballNews> = listeners[teamEnum]!!
        for (sub in users) {
            sub.notify(teamEnum, msg)
        }
    }
}