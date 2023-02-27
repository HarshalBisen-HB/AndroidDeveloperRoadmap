package io.getstream.androiddeveloperroadmap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.rememberImagePainter
import com.mxalbert.zoomable.Zoomable
import io.getstream.androiddeveloperroadmap.ui.theme.AndroidDeveloperRoadmapTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AndroidDeveloperRoadmapTheme {
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    Roadmap()
                }
            }
        }
    }
}

@Composable
private fun Roadmap() {
    Zoomable(
        modifier = Modifier.fillMaxSize(),
    ) {
        Image(
            painter = rememberImagePainter(
                "https://user-images.githubusercontent.com/24237865/144350753-5a52e6e5-3517-476c-8e5c-adad919abe8e.png",
                builder = {
                    placeholder(R.drawable.roadmap)
                }
            ),
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Fit,
            contentDescription = null
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    AndroidDeveloperRoadmapTheme {
        Roadmap()
    }
}
