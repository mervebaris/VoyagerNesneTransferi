package com.example.examplesayfagecis

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen


data class Mesaj(
    val gonderen: String,
    val alici: String,
    val icerik: String
)


class SayfaA(
    private val mesaj: Mesaj // Geçilen mesajı kabul eder
): Screen {
    @Composable
    override fun Content() {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Gönderen: ${mesaj.gonderen}", fontSize = 20.sp)
            Text(text = "Alıcı: ${mesaj.alici}", fontSize = 20.sp)
            Text(text = "İçerik: ${mesaj.icerik}", fontSize = 20.sp)
        }
    }
}
