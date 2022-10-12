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

        ws.onConnect { connection ->

            val ip : String = connection.session.remoteAddress.toString();
            val isAlt = if (Config.altDetection) true /* TODO fix */ else false;
            val isBanned = Userbase.get(ip) == KnownIP.BLACKLIST;
            val isAdmin = Userbase.get(ip) == KnownIP.ADMINISTRATOR;

            if (isBanned) {
                connection.send("blacklisted-ip-kick");
                connection.closeSession();
            }
            else if (isAlt && isAdmin) {

            }
            else if (isAlt) {
                connection.send("alt-kick");
                connection.closeSession();
            }




        }

    }
}