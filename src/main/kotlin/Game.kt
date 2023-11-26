class Game(private val title: String, private val cover: String) {

    private val description = ""

    override fun toString(): String {
        return "Game(title = $title, cover = $cover, description = $description)"
    }
}