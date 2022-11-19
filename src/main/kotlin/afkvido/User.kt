package afkvido

import afkvido.Userbase.offline
import afkvido.Userbase.online

class User {

    var name : String

    var rank : Rank

    var ip : String

    var online : Boolean
        get() {
            return Userbase.onlineArray.contains(this.ip)
        }
        set(value) {
            if (value) {
                this.ip.online()
            } else {
                this.ip.offline()
            }
        }


    constructor (ip: String, name: String, rank: Rank = Rank.FIRSTTIME) {
        this.ip = ip;
        this.name = name
        this.rank = rank
    }


}