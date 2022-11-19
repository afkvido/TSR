package afkvido

import afkvido.Userbase.online
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

            /** IP address of user */
            val ip : String = connection.session.remoteAddress.toString();

            val user : User = Userbase.get(ip) ?: User(ip, "Name", Rank.FIRSTTIME);

            if (user.rank == Rank.FIRSTTIME) {
                user.rank = Rank.NORMAL;
                Userbase.source[ip] = user;
            }

            val isAlt = if (!Config.altDetection) user.rank == Rank.NORMAL else true;
            val isBanned = user.rank == Rank.BLACKLIST;
            val isAdmin = user.rank == Rank.ADMINISTRATOR;

            if (isBanned) {
                connection.send("blacklisted-ip-kick");
                connection.closeSession();
            }
            else if (isAlt && isAdmin) {
                ip.online();
            }
            else if (isAlt) {
                connection.send("alt-kick");
                connection.closeSession();
            }




        }

    }
}