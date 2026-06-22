class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {

    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, de $artist, lançado em $yearPublished.")
    }
}

fun main() {
    val song = Song(
        title = "Shape of You",
        artist = "Ed Sheeran",
        yearPublished = 2017,
        playCount = 5000
    )

    song.printDescription()
    println("É famosa? ${song.isPopular}")
}
