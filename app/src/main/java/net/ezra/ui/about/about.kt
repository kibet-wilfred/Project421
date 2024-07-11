package net.ezra.ui.about

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME



@Composable
fun AboutScreen(navController: NavHostController) {



    Image(
        modifier = Modifier
            .fillMaxSize(),
        contentScale = ContentScale.Crop,
        painter = painterResource(id = R.drawable.logo1),
        contentDescription=null)
    LazyColumn(modifier = Modifier.background(color = Color.LightGray).fillMaxSize()) {
        item{

                Spacer(modifier = Modifier.height(10.dp))
               Column {
                   Text(
                       modifier = Modifier
                           .padding(50.dp)
                           .clickable {
                               navController.navigate(ROUTE_HOME) {
                                   popUpTo(ROUTE_ABOUT) { inclusive = true }
                               }
                           },
                       text = "Home",
                       textAlign = TextAlign.Center,
                       color = MaterialTheme.colorScheme.onSurface
                   )


                   Card(modifier= Modifier
                       .padding(10.dp)
                       .fillMaxWidth()

                   ) {
                       Image(painter = painterResource(id = R.drawable.logo1),
                           contentDescription = "Logo",
                           modifier = Modifier
                               .size(200.dp)
                           //.clip(shape = RoundedCornerShape(50)
                       )
               }


            }
        }





    }

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    AboutScreen(rememberNavController())
}

