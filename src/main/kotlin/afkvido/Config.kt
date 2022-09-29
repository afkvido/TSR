package afkvido

object Config {

    /**
     * Port for the HTTP Server to run on.
     */
    var serverPort : Int = 80;

    /**
     * Administrator Icon
     */
    var adminIcon : String = "<i class=\"fa-solid fa-shield\"></i>";

    /**
     * Bot Icon
     */
    var botIcon : String = "<i class=\"fa-solid fa-keyboard\"></i>";

    /**
     * Detect Alt Accounts by IP
     */
    var altDetection : Boolean = true;

    /**
     * Filter is not case-sensitive & doesn't apply to admins
     */
    var blacklistedUsernames : ArrayList<String> = ArrayList();

    /**
     * Only letters and numbers in username
     */
    var strictUsernames : Boolean = true;

    /**
     * Title displayed to users.
     */
    var htmlTitle : String = "TSR";

    /**
     * Message displayed to first-time joiners.
     */
    var msgWelcome : String = "";

    /**
     * Allow multiple chatrooms
     */
    var multipleRooms : Boolean = true;

    /**
     * Little tabs shown at the top of the screen.
     */
    var tabs : ArrayList<String> = ArrayList();


    fun init () {

        adminIcon += " ";
        botIcon += " ";

        if (msgWelcome.isNotEmpty()) {
            msgWelcome.replace("\n", "<br/>")
            msgWelcome = "<br/>$msgWelcome"
        }



    }
}