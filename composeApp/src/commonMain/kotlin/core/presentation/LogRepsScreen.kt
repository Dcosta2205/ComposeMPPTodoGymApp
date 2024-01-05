package core.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen

object LogRepsScreen : Screen {
  @Composable
  override fun Content() {
    var workoutNameField by remember { mutableStateOf("") }
    Column(
      modifier = Modifier.fillMaxSize(),
      horizontalAlignment = Alignment.CenterHorizontally
    ) {
      OutlinedTextField(
        value = workoutNameField,
        onValueChange = { newWorkoutName ->
          workoutNameField = newWorkoutName
        },
        label = {
          Text("Workout Name")
        },
        modifier = Modifier.fillMaxWidth().padding(20.dp)
      )
      Spacer(Modifier.height(25.dp))
      Button(onClick = {}) {
        Text("Save Workout")
      }
    }
  }
}