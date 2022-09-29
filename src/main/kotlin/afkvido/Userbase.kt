package afkvido

/**
 * IP-Username Map
 */
var ipUn : HashMap<String, String> = HashMap()


/**
 * Wrapper object for UserBase
 */
object Userbase {

    /**
     * Collection of IPs and what they correspond to (Admin, Banned, Normal, etc.)
     */
    @JvmStatic var source : HashMap<String, KnownIP> = HashMap()

    @JvmStatic fun get (IP : String): KnownIP {
        return source.getOrDefault(IP, KnownIP.FIRSTTIME)
    }



}


enum class KnownIP {

    /**
     * An Administrator's IP address
     */
    ADMINISTRATOR,

    /**
     * A banned user's IP address
     */
    BLACKLIST,

    /**
     * A normal user's IP address
     */
    NORMAL,

    /**
     * A first timer's IP address
     */
    FIRSTTIME,

}
