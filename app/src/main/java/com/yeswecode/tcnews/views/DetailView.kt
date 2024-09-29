package com.yeswecode.tcnews.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.yeswecode.tcnews.ui.theme.TCNewsTheme

@Composable
fun DetailView(
    imageUrl: String,
    category: String,
    title: String,
    description: String
) {
    val painter = rememberAsyncImagePainter(imageUrl)

    LazyColumn {
        item {
            Image(
                painter = painter,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(317.dp)
                    .fillMaxWidth()
            )
        }
        item {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = category,
                    style = MaterialTheme.typography.labelMedium,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                Text(
                    text = title,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                Text(
                    text = description,
                    style = MaterialTheme.typography.bodyMedium,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailViewPreview() {
    TCNewsTheme {
        DetailView(
            imageUrl = "https://techcrunch.com/wp-content/uploads/2024/07/Index-Ventures-Nina-Achadjian-Shardul-Shah-2.jpg",
            category = "AI",
            title = "El Futuro de las Películas Generadas por IA",
            description = "Meta presenta Emu Video, una herramienta de IA que crea clips animados desde descripciones o imágenes. Aunque impresiona con su calidad visual, plantea..."
        )
    }
}