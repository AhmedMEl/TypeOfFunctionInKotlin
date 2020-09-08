fun main() {

    println("Member Function **********")

    var memberFunction=MemberFunction()
    memberFunction.accumulate(20)
    memberFunction.lambdaFunction()
    println(memberFunction.isMultipleOf(2,3))

    println("******************** ********************")

    println("Infix Function Notation **********")

    var infixFunctionNotation=InfixFunctionNotation()
    infixFunctionNotation.infix()
    infixFunctionNotation.createPyramid(2)

    println("******************** ********************")

    println("User Defined Functions**********")

    var userDefinedFunctions=UserDefinedFunctions()
    userDefinedFunctions.printer()
    println(userDefinedFunctions.sum(2,4))

    println("******************** ********************")

    println("standard Library Function**********")

    var standardLibraryFunction=StandardLibraryFunction()
    standardLibraryFunction.letExample()
    standardLibraryFunction.runExample()

    println("******************** ********************")
}