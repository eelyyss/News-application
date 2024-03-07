package com.example.iorga_elys_practicapmdmfinal.util

import android.app.Activity

class Constants {
    companion object{
        const val API_KEY = "56d33185aba34d5b9d9a34938c3d9d91"
        const val BASE_URL = "https://newsapi.org"
        const val SEARCH_NEW_DELAY = 500L

        fun finishWithFadeTransition(activity: Activity) {
            activity. overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            activity.finish()
        }

    }


}