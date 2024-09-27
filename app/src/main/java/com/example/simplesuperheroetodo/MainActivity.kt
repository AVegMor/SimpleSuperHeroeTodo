package com.example.simplesuperheroetodo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simplesuperheroetodo.model.Heroe
import com.example.simplesuperheroetodo.ui.theme.SimpleSuperheroeTodoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleSuperheroeTodoTheme {
                ListaHeroes()
            }
        }
    }


    fun getHeroes(): List<Heroe> {
        return listOf(
            /*    Heroe(...),
                  Heroe(...),
                  ...*/
        )
    }

    @Composable
    fun ListaHeroes() {
        var context = LocalContext.current
        val lista = getHeroes()

    }

    @Composable
    fun ItemHeroe(heroe: Heroe, onItemSelected: (Heroe) -> Unit) {


    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        SimpleSuperheroeTodoTheme {
            ListaHeroes()
        }
    }
}