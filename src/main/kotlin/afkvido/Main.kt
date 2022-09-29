package afkvido

import io.javalin.Javalin
import io.javalin.http.staticfiles.Location

fun main(args: Array<String>) {

    Config.init();

    val app = Javalin.create { config ->
        config.http.maxRequestSize = 2500000000L // 25mb
        config.staticFiles.add("./public/", Location.EXTERNAL)
    }.start(80)

    app.ws ("/") { ws ->

        ws.onConnect {

        }

    }
}