package com.example.examplesayfagecis

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator

class AnaSayfa: Screen {
    @Composable
    override fun Content() {

        val navigator = LocalNavigator.current

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = {
                // Mesaj nesnesini oluştur ve SayfaA'ya geç
                val mesaj = Mesaj(
                    gonderen = "Merve",
                    alici = "Pınar",
                    icerik = "Merhaba, nasılsın?"
                )
                navigator?.push(SayfaA(mesaj))
            }) {
                Text(text = "Mesaj Detay Sayfası")
            }
        }
    }
}
