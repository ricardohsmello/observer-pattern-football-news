package domain.util

import domain.model.Group
import domain.model.Fan

class GroupBuilder {
    private var group: Group? = null
    fun create(team: TeamEnum): GroupBuilder {
        group = Group(team)
        return this
    }

    fun subscribe(fans: List<Fan>): GroupBuilder {
        for (fan in fans) {
            subscribe(fan)
        }
        return this
    }

    fun subscribe(fan: Fan): GroupBuilder {
        group!!.subscribe(fan)
        return this
    }

    fun unsubscribe(fan: Fan): GroupBuilder {
        group!!.unsubscribe(fan)
        return this
    }

    fun notify(message: String): GroupBuilder {
        group!!.notify(message)
        return this
    }
}