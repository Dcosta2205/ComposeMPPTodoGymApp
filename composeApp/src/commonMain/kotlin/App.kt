import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import core.presentation.RepsMateTheme

@Composable
fun App(
  darkTheme: Boolean,
  dynamicColor: Boolean
) {
  RepsMateTheme(
    darkTheme = darkTheme,
    dynamicColor = dynamicColor
  ) {
    Surface(
      modifier = Modifier.fillMaxSize(),
      color = MaterialTheme.colorScheme.background
    ) {

    }
  }
}