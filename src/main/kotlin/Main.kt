import com.google.gson.Gson
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

fun main() {
    val client: HttpClient = HttpClient.newHttpClient()
    val request = HttpRequest.newBuilder().uri(URI.create("https://www.cheapshark.com/api/1.0/games?id=146")).build()
    val response = client.send(request, HttpResponse.BodyHandlers.ofString())

    val gson = Gson()
    val myGame = gson.fromJson(response.body(), InfoGame::class.java)
    println(myGame)
}