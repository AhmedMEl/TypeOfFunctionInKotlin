import java.util.*

class StandardLibraryFunction {
    //** The standard library functions are built-in functions in Kotlin that are readily available for use.
    //** example
    // for  run
    fun runExample () {
        var name = "Brijesh"
        println(name) //Brijesh
        name = run {
            name = "This is name"
            name
        }
        println(name) //This is run function
    }

    // for  let
    fun letExample () {
        val name = "Brijesh Kumar"
        name.let {
            println("$it Singh ")
            val length = name.length
            println(length)
        }

    }


    fun applyExample () {
    val date = Calendar.getInstance().apply {
        set(Calendar.YEAR, 2016)
        set(Calendar.MONTH, Calendar.FEBRUARY)
        set(Calendar.DAY_OF_MONTH, 15)
    }

    }

}

fun main() {
    var f=StandardLibraryFunction()
    f.runExample()
    f.letExample()
}