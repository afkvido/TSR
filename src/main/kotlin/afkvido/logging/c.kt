/*
 * Copyright (c) 2022, HorseScript
 * All rights reserved.
 */
package afkvido.logging

import java.util.*

/**
 *
 * ANSI Color codes for HorseScript.
 *
 * The default color code is white.
 * <br></br><br></br>
 *
 * @since 0.0.1
 * @author HorseScript
 */
object c {
    /**
     *
     *Set color to **White**.
     *
     * This is the default color.
     *
     * <br></br><br></br>
     * @since 0.0.1
     * @author HorseScript
     */
    val white = "\u001B[0m"

    /**
     *
     *Set color to **Black**.
     *
     * <br></br><br></br>
     * @since 0.0.1
     * @author HorseScript
     */
    val black = "\u001B[30m"

    /**
     *
     *Set color to **Red**.
     *
     * <br></br><br></br>
     * @since 0.0.1
     * @author HorseScript
     */
    val red = "\u001B[31m"

    /**
     *
     *Set color to **Green**.
     *
     * <br></br><br></br>
     * @since 0.0.1
     * @author HorseScript
     */
    val green = "\u001B[32m"

    /**
     *
     *Set color to **Yellow**.
     *
     * <br></br><br></br>
     * @since 0.0.1
     * @author HorseScript
     */
    val yellow = "\u001B[33m"

    /**
     *
     *Set color to **Blue**.
     *
     * <br></br><br></br>
     * @since 0.0.1
     * @author HorseScript
     */
    val blue = "\u001B[34m"

    /**
     *
     *Set color to **Purple**.
     *
     * <br></br><br></br>
     * @since 0.0.1
     * @author HorseScript
     */
    val purple = "\u001B[35m"

    /**
     *
     *Set color to **Cyan**.
     *
     * <br></br><br></br>
     * @since 0.0.1
     * @author HorseScript
     */
    val cyan = "\u001B[36m"

    /**
     *
     *Set color to **Gray**.
     *
     * <br></br><br></br>
     * @since 0.0.1
     * @author HorseScript
     */
    val gray = "\u001B[37m"

    /**
     *
     *Random number generator.
     *
     * <br></br><br></br>
     * @since 0.0.1
     * @author HorseScript
     */
    private val random = Random()

    /**
     *
     *Return a random color code.
     *
     * <br></br><br></br>
     * @since 0.0.1
     * @author HorseScript
     */
    fun random(): String {
        val colors = arrayOf(white, black, red, green, yellow, blue, purple, cyan, gray)
        return colors[random.nextInt(colors.size)]
    }

    /**
     *
     *Return a random bright and colorful color code.
     *
     * <br></br><br></br>
     * @since 0.0.1
     * @author HorseScript
     */
    fun randomHigh(): String {
        val colors = arrayOf(red, green, yellow, blue, purple, cyan)
        return colors[random.nextInt(colors.size)]
    }
}