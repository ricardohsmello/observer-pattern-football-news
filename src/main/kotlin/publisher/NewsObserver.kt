package publisher

import model.Team

interface NewsObserver {
    fun notify(team: Team, message: String)
}