package domain.util

import domain.model.Group
import domain.model.Fan

class GroupBuilder {
    private var group: Group? = null
    fun create(team: TeamEnum): GroupBuilder {
        group = Group(team)
        return this
    }

    fun subscribe(users: List<Fan>): GroupBuilder {
        for (user in users) {
            subscribe(user)
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