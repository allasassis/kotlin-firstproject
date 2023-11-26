import com.google.gson.annotations.SerializedName

class Game(@SerializedName("title") private val title: String,@SerializedName("thumb")  private val cover: String) {

    private val description = ""

    override fun toString(): String {
        return "Game(title = $title, cover = $cover, description = $description)"
    }
}