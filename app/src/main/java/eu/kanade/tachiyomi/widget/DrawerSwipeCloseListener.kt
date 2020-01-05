package eu.kanade.tachiyomi.widget

import androidx.drawerlayout.widget.DrawerLayout
import android.view.View
import android.view.ViewGroup

class DrawerSwipeCloseListener(
        private val drawer: androidx.drawerlayout.widget.DrawerLayout,
        private val navigationView: ViewGroup
) : androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener() {

    override fun onDrawerOpened(drawerView: View) {
        if (drawerView == navigationView) {
            drawer.setDrawerLockMode(androidx.drawerlayout.widget.DrawerLayout.LOCK_MODE_UNLOCKED, drawerView)
        }
    }

    override fun onDrawerClosed(drawerView: View) {
        if (drawerView == navigationView) {
            drawer.setDrawerLockMode(androidx.drawerlayout.widget.DrawerLayout.LOCK_MODE_LOCKED_CLOSED, drawerView)
        }
    }
}
