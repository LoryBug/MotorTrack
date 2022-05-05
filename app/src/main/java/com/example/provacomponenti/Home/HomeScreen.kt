package com.example.provacomponenti.Home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.provacomponenti.Home.BottomBar.BottomNavigationBar
import com.example.provacomponenti.Home.TopBar.TopBar
import com.example.provacomponenti.Model.tracks
import com.example.provacomponenti.R
import com.example.provacomponenti.TrackCard

@Composable
fun HomeScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController) },
        topBar = { TopBar() },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                backgroundColor = MaterialTheme.colors.secondary,
                elevation = FloatingActionButtonDefaults.elevation(8.dp)

            ) {
                Icon(painterResource(id = R.drawable.ic_pin), "pin")
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        content = {
            Surface(modifier = Modifier.padding(top = 12.dp)) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {//--------------------sezione notizie
                    Surface(
                        modifier = Modifier.fillMaxWidth(0.8f), border = BorderStroke(
                            2.dp,
                            MaterialTheme.colors.primary
                        ), shape = MaterialTheme.shapes.medium
                    ) {
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                "Notizie",
                                style = MaterialTheme.typography.subtitle1,
                                fontWeight = FontWeight.SemiBold
                            )
                            Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed a condimentum nunc," +
                                    " a sollicitudin quam. Vestibulum ante ipsum primis in faucibus orci luctus et " +
                                    "ultrices posuere cubilia curae; Mauris accumsan vitae leo non pharetra. Orci varius " +
                                    "natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Phasellus" +
                                    " in eros mauris. Ut id est vitae arcu sodales blandit. In iaculis nisl et erat " +
                                    "egestas, quis dapibus arcu sagittis. Sed rutrum est sit amet porta dictum." +
                                    " Aliquam hendrerit euismod dolor, id interdum leo cursus ut. Donec pellentesque accumsan " +
                                    "magna vel vehicula. Maecenas nec libero fermentum, pellentesque tortor vel," +
                                    " mattis mauri",
                            style = MaterialTheme.typography.body1)

                        }


                    }


                }
            }
        }
    )

}


