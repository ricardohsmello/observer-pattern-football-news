import domain.model.Fan
import domain.util.GroupBuilder
import domain.util.TeamEnum

fun main(args: Array<String>) {

    val group = GroupBuilder()
    val ricardo = Fan("Ricardo")
    val camila = Fan("Camilla")
    val emerson = Fan("Emerson")
    val pedro = Fan("Pedro")
    val john = Fan("John")
    val bruno = Fan("Bruno")
    val julia = Fan("Julia")

    group.create(TeamEnum.CORINTHIANS)
        .subscribe(emerson)
        .subscribe(ricardo)
        .notify("Corinthians has won the FIFA World Cup 2 times.")
        .subscribe(pedro)
        .notify("Great news! Roger Guedes scored a hat trick against Palmeiras!")
        .subscribe(camila)
        .notify("The debut of Coringão in the CONMEBOL Libertadores 2023 is scheduled for April 4th or 5th")

    group.create(TeamEnum.LIVERPOOL)
        .subscribe(john)
        .subscribe(bruno)
        .notify("Liverpool chairman left in tears after striking worst deal in club history")
        .subscribe(ricardo)
        .notify("Liverpool transfer news - Jude Bellingham 'bid', Ryan Gravenberch interest, Joe Gomez latest")
        .unsubscribe(ricardo)
        .notify("Liverpool may have to sanction £20m deal as difficult summer transfer decision awaits\n")
        .subscribe(julia)
        .notify("Luis Diaz is set to return to Liverpool team training this week having been sidelined since October with a knee injury")
}