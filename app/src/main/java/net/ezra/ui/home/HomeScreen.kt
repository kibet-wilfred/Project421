package net.ezra.ui.home






//noinspection UsingMaterialAndMaterial3Libraries
//noinspection UsingMaterialAndMaterial3Libraries

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.activity.compose.ManagedActivityResultLauncher
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Card
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_MAKE_RESERVATION
import net.ezra.navigation.ROUTE_VIEW_RESERVATION


data class Screen(val title: String, val icon: Int)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ResourceAsColor")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {

    var isDrawerOpen by remember { mutableStateOf(false) }

    val callLauncher: ManagedActivityResultLauncher<Intent, ActivityResult> =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.StartActivityForResult()) { _ ->

        }


    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "Best Tours and  Travel Company")
                },

                navigationIcon = @Composable {
                    if (!isDrawerOpen) {
                        IconButton(onClick = { isDrawerOpen = true }) {
                            Icon(
                                Icons.Default.Menu,
                                contentDescription = "Menu",
                                tint = Color.White
                                )
                        }
                    }
                },


                actions = {
                    IconButton(onClick = {
                        navController.navigate(ROUTE_LOGIN) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }

                    }) {
                        Icon(
                            imageVector = Icons.Filled.AccountCircle,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                },

                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Red,
                    titleContentColor = Color.White,

                )

            )
        },

        content = @Composable {

          LazyColumn(modifier = Modifier.background(color = Color.LightGray)
          ){
              item{
                Spacer(modifier = Modifier.height(50.dp))

               Card(

                   modifier= Modifier
                       .padding(10.dp)

                       .clickable {
                           navController.navigate(ROUTE_MAKE_RESERVATION) {
                               popUpTo(ROUTE_HOME) { inclusive = true }
                           }
                       }
                       .fillMaxWidth(),
                   elevation = 5.dp,



               ) {
                Row {

                    Image(
                        painter = painterResource(id = R.drawable.image1),
                        contentDescription = "Logo",
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(50.dp)


                    )
                }
                   Row {
                       Text(text = "Nairobi national Park ",
                           fontFamily = FontFamily.Cursive,
                           textAlign = TextAlign.Center,
                           fontSize = 10.sp,
                           modifier = Modifier
                               .padding(5.dp)
                       )
                   }

               }
                  Spacer(modifier = Modifier.height(5.dp))


                  Card(modifier= Modifier
                      .padding(10.dp)
                      .fillMaxWidth()

                  ) {
                      Card {
                          Image(painter = painterResource(id = R.drawable.image2),
                              contentDescription = "Logo",
                              modifier = Modifier
                                  .size(200.dp)
                          )
                      }

                      Spacer(modifier = Modifier.height(15.dp))
                      Row {
                          Text(text = "Mount Kenya adventures ")
                      }

                  }

                  Card(modifier= Modifier
                      .padding(10.dp)
                      .fillMaxWidth()
                      .clickable {
                          navController.navigate(ROUTE_MAKE_RESERVATION) {
                              popUpTo(ROUTE_HOME) { inclusive = true }
                          }
                      }

                  ) {
                      Image(painter = painterResource(id = R.drawable.image3),
                          contentDescription = "Logo",
                          modifier = Modifier
                              .size(200.dp)
                      )
                      Spacer(modifier = Modifier.height(10.dp))
                      Text(text = "Unlimited Pool parties  ")

                  }

                  Card(modifier= Modifier
                      .padding(10.dp)
                      .fillMaxWidth()
                      .clickable {
                          navController.navigate(ROUTE_MAKE_RESERVATION) {
                              popUpTo(ROUTE_HOME) { inclusive = true }
                          }
                      }

                  ) {
                      Row {
                          Image(painter = painterResource(id = R.drawable.image4),
                              contentDescription = "Logo",
                              modifier = Modifier
                                  .size(200.dp)
                          )
                      }

                      Spacer(modifier = Modifier.height(10.dp))
                      Row {
                          Text(text = "Weekend getaway at our resorts ")
                      }
                  }

                  Row{
                      Column {

                      }
                      Card(
                          modifier = Modifier
                              .padding(50.dp)
                              .clickable {
                                  navController.navigate(ROUTE_MAKE_RESERVATION) {
                                      popUpTo(ROUTE_HOME) { inclusive = true }
                                  }
                              }
                      ) {
                          Text(

                              text = "BOOK WITH US NOW!!!",
                              textAlign = TextAlign.Center,
                              fontSize = 30.sp,
                              modifier = Modifier.padding(10.dp)
                          )
                      }
                     Column {

                     }
                  }

                LazyRow{
                    item{
                        Card(modifier= Modifier
                            .padding(10.dp)
                            .fillMaxWidth()

                        ) {
                            Image(painter = painterResource(id = R.drawable.image5),
                                contentDescription = "Logo",
                                modifier = Modifier
                                    .size(200.dp)
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "Experience The Savannah ")
                        }

                        Card(modifier= Modifier
                            .padding(10.dp)
                            .fillMaxWidth()

                        ) {
                            Image(painter = painterResource(id = R.drawable.image6),
                                contentDescription = "Logo",
                                modifier = Modifier
                                    .size(200.dp)
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "A taste of our exquisite Green Lodges ")
                        }

                        Card(modifier= Modifier
                            .padding(10.dp)
                            .fillMaxWidth()
                            .clickable {
                                navController.navigate(ROUTE_MAKE_RESERVATION) {
                                    popUpTo(ROUTE_HOME) { inclusive = true }
                                }
                            }

                        ) {
                           Row {
                               Image(painter = painterResource(id = R.drawable.image7),
                                   contentDescription = "Logo",
                                   modifier = Modifier
                                       .size(200.dp)
                               )
                           }
                            Spacer(modifier = Modifier.height(20.dp))
                            Row {
                                Text(text = "Camping with friends ")
                            }

                        }

                        Spacer(modifier = Modifier.height(50.dp))


                        }

                }



              }

          }









          },














//            Box(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .clickable {
//                        if (isDrawerOpen) {
//                            isDrawerOpen = false
//                        }
//                    }
//            ) {
//
//
//                Column(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .background(Color(0xff9AEDC9)),
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//
//
//
//
//                    Text(
//                        modifier = Modifier
//
//                            .clickable {
//                                navController.navigate(ROUTE_LOGIN) {
//                                    popUpTo(ROUTE_HOME) { inclusive = true }
//                                }
//                            },
//                        text = "Login ",
//                        textAlign = TextAlign.Center,
//                        fontSize = 20.sp,
//                        color = MaterialTheme.colorScheme.onSurface
//                    )
//
//
//
//                    Text(
//                        modifier = Modifier
//
//                            .clickable {
//                                navController.navigate(ROUTE_ADD_PRODUCT) {
//                                    popUpTo(ROUTE_HOME) { inclusive = true }
//                                }
//                            },
//                        text = "Add Products",
//                        textAlign = TextAlign.Center,
//                        fontSize = 20.sp,
//                        color = MaterialTheme.colorScheme.onSurface
//                    )
//

//
//                    Text(
//                        modifier = Modifier
//
//                            .clickable {
//                                navController.navigate(ROUTE_VIEW_PROD) {
//                                    popUpTo(ROUTE_HOME) { inclusive = true }
//                                }
//                            },
//                        text = "view Products",
//                        textAlign = TextAlign.Center,
//                        fontSize = 20.sp,
//                        color = MaterialTheme.colorScheme.onSurface
//                    )
//
//
//
//                    Spacer(modifier = Modifier.height(15.dp))
//
//
//
//
//
//                }
//
//            }



        bottomBar = { BottomBar(navController = navController) }







    )

    AnimatedDrawer(
        isOpen = isDrawerOpen,
        onClose = { isDrawerOpen =false}
    )
}

@Composable
fun AnimatedDrawer(isOpen: Boolean, onClose: () -> Unit,) {
    val drawerWidth = remember { Animatable(if (isOpen) 250f else 0f) }

    LaunchedEffect(isOpen) {
        drawerWidth.animateTo(if (isOpen) 250f else 0f, animationSpec = tween(durationMillis = 300))
    }


    Surface(
        modifier = Modifier
            .fillMaxHeight()
            .width(drawerWidth.value.dp)
            ,
        color = Color.LightGray,
//        elevation = 16.dp
    ) {
        Column {


            Text(
                text = "Make reservation",
                modifier = Modifier


            )
            Spacer(modifier = Modifier.height(16.dp))


        }
    }
}






@Composable
fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }
    val callLauncher: ManagedActivityResultLauncher<Intent, ActivityResult> =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.StartActivityForResult()) { _ ->

        }
    BottomNavigation(
        elevation = 10.dp,
        backgroundColor = Color.Red


    ) {

//        BottomNavigationItem(icon = {
//            Icon(imageVector = Icons.Default.Home,"", tint = Color.White)
//        },
//            label = { Text(text = "Home",color =  Color.White) }, selected = (selectedIndex.value == 0), onClick = {
//
//            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Phone,"", tint = Color.White)
        },
            label = {     Row (){

                Text(
                    text = "call us",
                    fontSize = 11.sp,
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {

                            val intent = Intent(Intent.ACTION_DIAL)
                            intent.data = Uri.parse("tel:+254758006560")

                            callLauncher.launch(intent)
                        }
                )



            }
            }, selected = (selectedIndex.value == 0), onClick = {

            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.ShoppingCart, "",tint = Color.White)
        },
            label = { Text(
                text = "My reservations",
                color =  Color.White) },
            selected = (selectedIndex.value == 2),
            onClick = {

                navController.navigate(ROUTE_VIEW_RESERVATION) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }

            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Info , "",tint = Color.White)
        },
            label = { Text(
                text = "About us",
                color =  Color.White) },
            selected = (selectedIndex.value == 2),
            onClick = {

                navController.navigate(ROUTE_ABOUT) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }

            })

    }
}