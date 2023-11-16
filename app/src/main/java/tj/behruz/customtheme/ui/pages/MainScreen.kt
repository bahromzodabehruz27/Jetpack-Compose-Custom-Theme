package tj.behruz.customtheme.ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import tj.behruz.customtheme.ui.theme.AppTheme

@Composable
fun MainScreen() {
    Scaffold(backgroundColor = AppTheme.colors.background, ) { paddingValues: PaddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Jetpack Compose",
                        textAlign = TextAlign.Start,
                        style = AppTheme.typography.h1,
                        color = AppTheme.colors.surface
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Custom Theme using Material Design",
                        textAlign = TextAlign.Start,
                        style = AppTheme.typography.subtitle,
                        color = AppTheme.colors.surface

                    )
                }

            }

            repeat(5) {
                ExampleItem()
            }
        }
    }
}