package com.yeswecode.tcnews.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yeswecode.tcnews.R
import com.yeswecode.tcnews.ui.components.NewsCard
import com.yeswecode.tcnews.ui.theme.TCNewsTheme

@Composable
fun FeedView() {
    Column {
        Column(modifier = Modifier
            .background(MaterialTheme.colorScheme.surface)
            .padding(16.dp)
        ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Image(
                    painterResource(R.drawable.icon),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(32.dp)
                        .height(32.dp)
                )
                Image(
                    painterResource(R.drawable.search),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(32.dp)
                        .height(32.dp)
                )
            }
            Text(
                text = "Latest news",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }
        LazyColumn(modifier = Modifier.padding(16.dp)) {
            item {
                NewsCard(
                    imageUrl = "https://techcrunch.com/wp-content/uploads/2024/07/Index-Ventures-Nina-Achadjian-Shardul-Shah-2.jpg",
                    category = "AI",
                    title = "El Futuro de las Películas Generadas por IA",
                    description = "Meta presenta Emu Video, una herramienta de IA que crea clips animados desde descripciones o imágenes. Aunque impresiona con su calidad visual, plantea..."
                )
            }
            item {
                NewsCard(
                    imageUrl = "https://techcrunch.com/wp-content/uploads/2024/07/Index-Ventures-Nina-Achadjian-Shardul-Shah-2.jpg",
                    category = "AI",
                    title = "El Futuro de las Películas Generadas por IA",
                    description = "Meta presenta Emu Video, una herramienta de IA que crea clips animados desde descripciones o imágenes. Aunque impresiona con su calidad visual, plantea..."
                )
            }
            item {
                NewsCard(
                    imageUrl = "https://techcrunch.com/wp-content/uploads/2024/07/Index-Ventures-Nina-Achadjian-Shardul-Shah-2.jpg",
                    category = "AI",
                    title = "El Futuro de las Películas Generadas por IA",
                    description = "Meta presenta Emu Video, una herramienta de IA que crea clips animados desde descripciones o imágenes. Aunque impresiona con su calidad visual, plantea..."
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FeedViewPreview() {
    TCNewsTheme {
        FeedView()
    }
}