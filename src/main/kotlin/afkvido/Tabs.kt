package afkvido

/**
 * Generate a TSR tab from title, icon, and href.
 */
fun Tab (title : String, icon : String, href : String) : String {
    return "<a href=\"$href\"<i class=\"$icon\"></i> $title</a>"
}