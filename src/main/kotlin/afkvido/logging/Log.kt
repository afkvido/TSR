package afkvido.logging

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object Log {
    fun connect (ip : String) {
        Log("CONNECTION ✓", ip, c.green);
    }
}

fun Log (content : String, ip : String, pre : String, dt : String = time()) : Unit {
    println("$pre [$dt] [$ip] $content");
}


val format = DateTimeFormatter.ofPattern("HH:mm:ss")

fun time () : String {
    return LocalDateTime.now().format(format)
}
