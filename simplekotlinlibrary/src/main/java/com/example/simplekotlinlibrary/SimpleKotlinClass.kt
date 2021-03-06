package com.example.simplekotlinlibrary

/**
 * <h1>Simple Kotlin Class</h1>
 * A really simple kotlin class
 * <p>
 * It only has a string variable
 *
 * @author  Elye
 * @version 1.0
 * @since   11-08-21
*/
class SimpleKotlinClass {
    val simpleText = "Simple Kotlin One"


    /**
     * This is the only method
     * @param option Useless option parameter just as same
     * @return The string of simpleText
     */
    fun printMe(option: Int) = simpleText

    /**
     * This is a breaking change on purpose
     * @return The string of simpleText
     */
    fun printOne() = simpleText
}