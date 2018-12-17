fun main(args: Array<String>) {
    val rawString = """
        |A long time ago
            |in a galaxy
                |There's a prince
    """.trimMargin()
    // change | as < , trimMargin("<")

    println(rawString)

    /** Useful technique
     * strA.contentEquals(strB) => return true/false
     * str.contains() => check contain
     * str.subSequence(startIndex, endIndex)
     * In "", "$val is a $var, with ${val.length //Any operation return}" => $val to present val in quotation
     */
}