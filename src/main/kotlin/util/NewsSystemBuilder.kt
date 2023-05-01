package util

import model.Fan
import publisher.NewsPublisher
import model.Team

class NewsSystemBuilder(team: Team) {
    private val newsPublisher: NewsPublisher = NewsPublisher(team)

    fun subscribe(fan: Fan) = apply { newsPublisher.subscribe(fan) }

    fun unsubscribe(fan: Fan) = apply { newsPublisher.unsubscribe(fan) }

    fun notify(message: String) = apply { newsPublisher.notify(message) }
    companion object {
        fun forTeam(team: Team) = NewsSystemBuilder(team)
    }
}
