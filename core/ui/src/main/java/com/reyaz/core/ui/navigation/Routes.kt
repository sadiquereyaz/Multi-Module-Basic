package com.reyaz.core.ui.navigation

object Routes {
    const val HOME = "home"
    const val SETTINGS = "settings"
    const val PROFILE = "profile"
    const val USER_DETAIL = "user_detail/{user_id}"     // user_id is the key to obtain the userId value from the backStackEntry

    /**
     * Generates a route string for a user's detail page.
     *
     * This function is typically used in navigation or routing systems
     * to construct the path to a specific user's profile or detail view.
     *
     * @param userId The unique identifier of the user.
     * @return A string representing the route to the user's detail page,
     *         formatted as "user_detail/{userId}".
     */
    fun userDetail(userId: String) = "user_detail/$userId"
}