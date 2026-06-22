open class Phone {
    var isScreenLightOn = false
        protected set

    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }
}

class FoldablePhone : Phone() {
    var isFolded = true
        private set

    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun fold() {
        isFolded = true
    }

    fun unfold() {
        isFolded = false
    }
}

fun main() {
    val foldablePhone = FoldablePhone()

    foldablePhone.switchOn()
    println(foldablePhone.isScreenLightOn) // false

    foldablePhone.unfold()
    foldablePhone.switchOn()
    println(foldablePhone.isScreenLightOn) // true
}
