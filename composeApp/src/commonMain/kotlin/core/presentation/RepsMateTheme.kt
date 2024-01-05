package core.presentation

import androidx.compose.runtime.Composable

@Composable
expect fun RepsMateTheme(
  darkTheme: Boolean,
  dynamicColor: Boolean,
  content: @Composable () -> Unit
)