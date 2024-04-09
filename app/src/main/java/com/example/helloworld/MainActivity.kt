package com.example.helloworld
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.helloworld.ui.theme.HelloWorldTheme

@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldTheme{
                TelaPrincipal()
            }

        }
    }



    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Composable
    fun TelaPrincipal(modifier: Modifier = Modifier){
       Scaffold(
           topBar = {
               TopAppBar(
                   colors = TopAppBarDefaults.mediumTopAppBarColors(
                       containerColor = MaterialTheme.colorScheme.primaryContainer,
                       titleContentColor = MaterialTheme.colorScheme.primary,
                   ),
                   title = { Text(text = "Top Bar")})
           },
           bottomBar = {
               BottomAppBar {
                   Text(text = "Bottom Bar")
               }
           },
           floatingActionButton = {
               FloatingActionButton(onClick = { }) {
                   Icon(imageVector = Icons.Filled.Add, contentDescription = "add")
               }
           }
       ) {contentPadding ->
           Column(
               modifier.padding(contentPadding).background(Color.Blue).fillMaxWidth().fillMaxHeight(),
               verticalArrangement = Arrangement.Center,
               horizontalAlignment = Alignment.CenterHorizontally
           ) {
               Text(
                   text = "Texto 1",
                   fontSize = 20.sp,
                   )
               Text(text = "Texto 2")
               Text(text = "Texto 3")
           }
       }

    }

    @Preview
    @Composable
    fun TelaPrincipalPreview(){
        TelaPrincipal()
    }
}

