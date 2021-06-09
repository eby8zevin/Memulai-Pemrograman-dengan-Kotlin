fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun Int.validateNumber(){
        if (this == 0) {
            throw IllegalArgumentException("valu must be better than 0")
        }
    }

    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

    return valueA + valueB + valueC
}