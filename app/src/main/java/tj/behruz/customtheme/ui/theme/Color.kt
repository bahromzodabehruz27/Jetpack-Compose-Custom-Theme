package tj.behruz.customtheme.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color


val PrimaryLight = Color(0xFF448AFF)
val PrimarySecondaryLight = Color(0xFF90CAF9)
val SecondaryLight = Color(0xFF64B5F6)
val TextPrimaryColorLight = Color(0xFF000000)
val TextSecondaryColorLight = Color(0xFF9E9E9E)
val BackGroundColor = Color(0xFFE1F5FE)
val BackGroundColorDark = Color(0xFF1E3054)
val ErrorColor = Color(0xFFD50000)
val Card = Color(0xFFFFFFFF)
val CardNight = Color(0xFF162544)
val PrimaryDark = Color(0xFFFF1744)
val PrimarySecondaryDark = Color(0xFFFF6D00)
val TextSecondaryColorDark = Color(0xFFFFCC80)
val BlueText = Color(0xFF1E3054)
val PinkText = Color(0xFFE1F5FE)


fun appLightColors(
    primary: Color = PrimaryLight,
    primarySecondary: Color = PrimarySecondaryDark,
    secondaryLight: Color = SecondaryLight,
    textPrimary: Color = TextPrimaryColorLight,
    textSecondary: Color = TextSecondaryColorLight,
    background: Color = BackGroundColor,
    cardColor: Color = Card,
    surface: Color = BlueText,
    error: Color = ErrorColor
): AppColors = AppColors(
    primary = primary,
    primarySecondary = primarySecondary,
    secondary = secondaryLight,
    textPrimary = textPrimary,
    textSecondary = textSecondary,
    background = background,
    cardColor = cardColor,
    surface = surface,
    error = error,
    isLight = true
)


fun appDarkColors(
    primary: Color = PrimaryDark,
    primarySecondary: Color = PrimarySecondaryLight,
    secondaryLight: Color = SecondaryLight,
    textPrimary: Color = TextPrimaryColorLight,
    textSecondary: Color = TextSecondaryColorDark,
    background: Color = BackGroundColorDark,
    cardColor: Color = CardNight,
    surface: Color = PinkText,
    error: Color = ErrorColor
): AppColors = AppColors(
    primary = primary,
    primarySecondary = primarySecondary,
    secondary = secondaryLight,
    textPrimary = textPrimary,
    textSecondary = textSecondary,
    background = background,
    cardColor = cardColor,
    surface = surface,
    error = error,
    isLight = true
)

val LocalColors = staticCompositionLocalOf { appLightColors() }
