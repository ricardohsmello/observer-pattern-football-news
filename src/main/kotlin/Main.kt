import model.Fan
import model.Team
import util.NewsSystemBuilder

fun main() {
    val ricardo = Fan("Ricardo")
    val maria = Fan("Maria")

    NewsSystemBuilder.forTeam(Team.CORINTHIANS)
        .subscribe(ricardo)
        .subscribe(maria)
        .notify("Corinthians has won the FIFA World Cup 2 times.")
        .notify("Great news! Roger Guedes scored a hat trick against Palmeiras!")
        .unsubscribe(ricardo)
        .notify("Corinthians will face Flamengo in the COPA DO BRASIL semi-finals.")

    NewsSystemBuilder.forTeam(Team.LIVERPOOL)
        .subscribe(ricardo)
        .notify("Luis Diaz is set to return to Liverpool team training this week having been sidelined since October with a knee injury")
}