package datastructure

class HashEntry {

    var key: Int = 0
        internal set
    lateinit var value: Any
        internal set
    internal var next: HashEntry? = null

    constructor(key: Int, value: Any) {
        this.key = key
        this.value = value
        next = null
    }

    constructor() {
        next = null
    }

}
