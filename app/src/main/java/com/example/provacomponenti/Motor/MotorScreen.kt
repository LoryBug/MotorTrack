package com.example.provacomponenti.Motor

import android.app.Application
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.provacomponenti.CardPosMotor
import com.example.provacomponenti.CommonItem.TopBarSec
import com.example.provacomponenti.Database.*


import com.example.provacomponenti.Motor.Card.CardAddMoto


@Composable
fun MotorScreen(
    navController: NavController, viewModel: MotorViewModel
) {

    Scaffold(topBar = { TopBarSec("Moto", navController) }) {

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 56.dp), horizontalAlignment = Alignment.CenterHorizontally
        ) {

            item { Spacer(modifier = Modifier.height(12.dp)) }


           item {
                Button(onClick = { AddMotoretta(viewModel) }) {
                    Text(text = "ciao")
                }
            }
            items(viewModel.allMotor) {
                CardPosMotor(motor = it)
            }
            item {
             }
/*
            for (motor in motors) {

                item { CardPosMotor(motor) }
            }*/
            item {
                CardAddMoto()
            }
            item { Spacer(modifier = Modifier.height(6.dp)) }

        }
    }
}



fun AddMotoretta(motorViewModel: MotorViewModel) {
    val moto = Motor(
        4,
        "Ktm",
        "1290",
        "1300cc",
        "Naked",
        180,
        175,
        "290522",
        "301022",
        "https://i.ytimg.com/vi/oH1-OJe8pMI/maxresdefault.jpg"
    )
    motorViewModel.onTriggerEvent(MotorEvent.AddMoto(moto))
}
