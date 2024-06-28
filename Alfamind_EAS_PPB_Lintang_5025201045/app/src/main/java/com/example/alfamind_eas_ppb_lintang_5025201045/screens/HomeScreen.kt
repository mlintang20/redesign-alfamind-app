package com.example.alfamind_eas_ppb_lintang_5025201045.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.alfamind_eas_ppb_lintang_5025201045.R

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            painter = painterResource(id = R.drawable.alfamind_logo),
            contentDescription = "Alfamind Logo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Categories",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFFD5EEC)
        )
        Spacer(modifier = Modifier.height(16.dp))
        CategoriesSection()
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Products",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFFD5EEC)
        )
        Spacer(modifier = Modifier.height(16.dp))
        ProductsSection()
    }
}

@Composable
fun CategoriesSection() {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(5) { index ->
            CategoryItem(name = "Cat. ${index + 1}", categoryImage = R.drawable.beras_image)
        }
    }
}

@Composable
fun CategoryItem(name: String, categoryImage: Int) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .size(80.dp)
            .background(Color(0xFF12D1FD), shape = CircleShape)
            .clickable { /* TODO: Handle click */ }
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = categoryImage), // Placeholder image
            contentDescription = null,
            modifier = Modifier.size(40.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = name, style = MaterialTheme.typography.bodyMedium)
    }
}

@Composable
fun ProductsSection() {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            ProductItem(name = "Product 1", productImage = R.drawable.beras_image)
            ProductItem(name = "Product 2", productImage = R.drawable.pisau_image)
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            ProductItem(name = "Product 3", productImage = R.drawable.minyak_image)
            ProductItem(name = "Product 4", productImage = R.drawable.beras_image)
        }
    }
}

@Composable
fun ProductItem(name: String, productImage: Int) {
    Column(
        modifier = Modifier
            .width(160.dp)
            .background(Color.LightGray)
            .padding(8.dp)
            .clickable { /* TODO: Handle click */ }
    ) {
        Image(
            painter = painterResource(id = productImage), // Placeholder image
            contentDescription = null,
            modifier = Modifier
                .height(120.dp)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = name,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "Rp. 30.000,00",
            style = MaterialTheme.typography.bodyMedium,
            color = Color(0xFFFD5E5E)
        )
    }
}