package com.example.myandroid.ui.composables.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.draw.clip
import com.example.myandroid.R

@Composable
fun Carousel_1_Uncontained() {
    data class CarouselItem(
        val id: Int,
        @DrawableRes val imageResId: Int,
        @StringRes val contentDescriptionResId: Int
    )

    val items = listOf(
        CarouselItem(0, R.drawable.image_1, R.string.carousel_image_1_description)
    )

    LazyRow(
        modifier = Modifier
            .width(412.dp)
            .height(221.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(items.size) { i ->
            val item = items[i]
            Image(
                modifier = Modifier
                    .width(186.dp)
                    .height(205.dp)
                    .clip(MaterialTheme.shapes.extraLarge),
                painter = painterResource(id = item.imageResId),
                contentDescription = stringResource(item.contentDescriptionResId),
                contentScale = ContentScale.Crop
            )
        }
    }
}


