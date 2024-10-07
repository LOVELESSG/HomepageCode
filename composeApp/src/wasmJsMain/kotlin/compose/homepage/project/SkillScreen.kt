package compose.homepage.project

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.compose.HomepageTheme
import longzhenhomepage.composeapp.generated.resources.Outfit_Black
import longzhenhomepage.composeapp.generated.resources.Outfit_Bold
import longzhenhomepage.composeapp.generated.resources.Outfit_Light
import longzhenhomepage.composeapp.generated.resources.Outfit_Regular
import longzhenhomepage.composeapp.generated.resources.Outfit_Thin
import longzhenhomepage.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.Font

@Composable
fun SkillScreen() {
    HomepageTheme {

        val outfit = FontFamily(
            Font(Res.font.Outfit_Bold, FontWeight.Bold),
            Font(Res.font.Outfit_Thin, FontWeight.Thin),
            Font(Res.font.Outfit_Regular, FontWeight.Normal),
            Font(Res.font.Outfit_Black, FontWeight.Black),
            Font(Res.font.Outfit_Light, FontWeight.Light)
        )

        LazyColumn {
            item {
                Column {
                    Text(
                        text = "Programming Languages",
                        style = MaterialTheme.typography.h2,
                        fontFamily = outfit,
                        modifier = Modifier.weight(2.5f)
                    )
                }
            }
        }
    }
}