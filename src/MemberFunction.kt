class MemberFunction {
    //*** These functions are defined inside a class, object, or interface.
    //** A member function is invoked using the name of the containing class or
    //** object instance with a dot, followed by the function name and the arguments in parentheses

    //** Local functions
    //** Kotlin supports local functions, i.e. it allows you to put a function inside a function
    fun accumulate(number: Int): Int {
        var givenNumber = number
        fun add() {
            givenNumber++
        }
        for (i in 1..10) {
            add()
        }
        return givenNumber
    }

    //** Lambda function is also known as anonymous function because it has no name.

    fun lambdaFunction(){
        val sum = {num1: Int, num2: Int -> num1 + num2}
        println("10+5: ${sum(10,5)}")
    }

    //** Inlining is basically requesting the compiler to copy the (inlined) code at the calling place.
    var localVariable : Int = 8
    inline fun isMultipleOf (number: Int, multipleOf : Int): Boolean {
        println(localVariable) //compilation error
        return number % multipleOf == 0
    }

}
