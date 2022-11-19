package afkvido


/**
 * Wrapper object for UserBase
 */
object Userbase {


    @JvmStatic val onlineArray : ArrayList<String> = ArrayList();

    @JvmStatic fun isOnline (IP : String) : Boolean {
        return onlineArray.contains(IP);
    }

    /**
     * Adds the IP to the userbase OnlineArray
     */
    fun String.online () {
        onlineArray.add(this);
    }

    /**
     *
     */
    fun String.offline () {
        onlineArray.remove(this);
    }


    /**
     * Collection of IPs and what user they correspond to
     */
    @JvmStatic val source : HashMap<String, User> = HashMap()

    @JvmStatic fun get (IP : String): User? {
        return source[IP]
    }



}


