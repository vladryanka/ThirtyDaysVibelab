package com.smorzhok.thirtydays.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.smorzhok.thirtydays.FitnessItem
import com.smorzhok.thirtydays.R

data class FitnessTip(
    @DrawableRes val imageResourceId: Int,
    @StringRes val tip: Int,
    public val day: Int,
    @StringRes val description: Int
)

val tips = listOf(
    FitnessTip(R.drawable.fitness1, R.string.tip_1, 1, R.string.description_1),
    FitnessTip(R.drawable.fitness2, R.string.tip_2, 2, R.string.description_2),
    FitnessTip(R.drawable.fitness3, R.string.tip_3, 3, R.string.description_3),
    FitnessTip(R.drawable.fitness4, R.string.tip_4, 4, R.string.description_4),
    FitnessTip(R.drawable.fitness5, R.string.tip_5, 5, R.string.description_5),
    FitnessTip(R.drawable.fitness6, R.string.tip_6, 6, R.string.description_6),
    FitnessTip(R.drawable.fitness7, R.string.tip_7, 7, R.string.description_7),
    FitnessTip(R.drawable.fitness8, R.string.tip_8, 8, R.string.description_8),
    FitnessTip(R.drawable.fitness9, R.string.tip_9, 9, R.string.description_9),
    FitnessTip(R.drawable.fitness10, R.string.tip_10, 10, R.string.description_10)
)
