class InfixFunctionNotation {
    //*** used infix functions
    //*** When you use || and && operations, the compiler look up for or and and functions respectively, and calls them under the hood.
    //*** These two functions support infix notation.

    fun infix() {
        val a = true
        val b = false
        var result: Boolean

        result = a or b // a.or(b)
        println("result = $result")

        result = a and b // a.and(b)
        println("result = $result")
    }


    //*** You can make a function call in Kotlin using infix notation if the function
    //*** is a member function (or an extension function).
    //*** has only one single parameter.
    //*** is marked with infix keyword.

    infix fun createPyramid(rows: Int) {
        var k = 0
        for (i in 1..rows) {
            k = 0
            for (space in 1..rows-i) {
                print("  ")
            }
            while (k != 2*i-1) {
                print("* ")
                ++k
            }
            println()
        }
    }
}