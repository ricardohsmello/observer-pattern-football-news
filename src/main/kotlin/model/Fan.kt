package model

import publisher.NewsObserver

data class Fan(
    private val name: String
) : NewsObserver {
    override fun notify(team: Team, message: String) {
        println("Hello $name, please check the following news about $team: \n$message\n")
    }
}