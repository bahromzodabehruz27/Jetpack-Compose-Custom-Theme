package tj.behruz.customtheme.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

class AppColors(
    primary: Color,
    primarySecondary: Color,
    secondary: Color,
    textPrimary: Color,
    textSecondary: Color,
    background: Color,
    cardColor:Color,
    surface:Color,
    error: Color,
    isLight: Boolean
) {
    var primary by mutableStateOf(primary)
        private set
    var primarySecondary by mutableStateOf(primarySecondary)
        private set
    var secondary by mutableStateOf(secondary)
        private set
    var textPrimary by mutableStateOf(textPrimary)
        private set

    var textSecondary by mutableStateOf(textSecondary)
        private set

    var background by mutableStateOf(background)
        private set

    var cardColor by mutableStateOf(cardColor)
        private set


    var surface by mutableStateOf(surface)
        private set

    var error by mutableStateOf(error)
        private set
    var isLight by mutableStateOf(isLight)
        internal set

    fun copy(
        primary: Color = this.primary,
        primarySecondary: Color = this.primarySecondary,
        secondary: Color = this.secondary,
        textPrimary: Color = this.textPrimary,
        textSecondary: Color = this.textSecondary,
        background: Color = this.background,
        cardColor: Color = this.cardColor,
        surface: Color = this.surface,
        error: Color = this.error,
        isLight: Boolean = this.isLight
    ): AppColors = AppColors(
        primary = primary,
        primarySecondary = primarySecondary,
        secondary = secondary,
        textPrimary = textPrimary,
        textSecondary = textSecondary,
        background = background,
        cardColor = cardColor,
        surface = surface,
        error = error,
        isLight = isLight
    )

    // will be explained later
    fun updateColorsFrom(other: AppColors) {
        primary = other.primary
        primarySecondary = other.primarySecondary
        textPrimary = other.textPrimary
        textSecondary = other.textSecondary
        background = other.background
        cardColor = other.cardColor
        surface = other.surface
        error = other.error
        isLight = other.isLight
    }
}