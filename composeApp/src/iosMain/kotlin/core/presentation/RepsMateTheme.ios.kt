package core.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.Composable

@Composable
actual fun RepsMateTheme(
  darkTheme: Boolean,
  dynamicColor: Boolean,
  content: @Composable () -> Unit
) {

  MaterialTheme(
    colorScheme = colorScheme,
    typography = MaterialTheme.typography,
    content = content
  )
}