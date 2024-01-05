import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.Navigator
import core.presentation.LogRepsScreen
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
    Scaffold(
      content = {
        Column(
          modifier = Modifier.fillMaxSize(),
          verticalArrangement = Arrangement.Center,
          horizontalAlignment = Alignment.CenterHorizontally
        ) {
          Navigator(screen = LogRepsScreen)
        }
      }
    )
  }
}