package publisher

import model.Team

class NewsPublisher(private val team: Team) {
    private val observers: MutableMap<Team, MutableList<NewsObserver>> = mutableMapOf(team to mutableListOf())

    fun subscribe(observer: NewsObserver) {
        observers.getOrPut(team) { mutableListOf() }.add(observer)
    }

    fun unsubscribe(observer: NewsObserver) {
        observers[team]?.remove(observer)
    }

    fun notify(message: String) {
        observers[team]?.forEach { observer ->
            observer.notify(team, message)
        }
    }
}
