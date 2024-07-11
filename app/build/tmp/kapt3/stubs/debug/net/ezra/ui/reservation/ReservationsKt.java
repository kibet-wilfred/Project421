package net.ezra.ui.reservation;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.compose.foundation.layout.*;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.navigation.NavHostController;
import com.google.firebase.Firebase;
import androidx.lifecycle.ViewModel;
import coil.request.ImageRequest;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"StudentList", "", "items", "", "Lnet/ezra/ui/reservation/Student;", "Students", "navController", "Landroidx/navigation/NavHostController;", "viewModel", "Lnet/ezra/ui/reservation/FirestoreViewModel;", "app_debug"})
public final class ReservationsKt {
    
    @androidx.compose.runtime.Composable
    public static final void StudentList(@org.jetbrains.annotations.NotNull
    java.util.List<net.ezra.ui.reservation.Student> items) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    public static final void Students(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull
    net.ezra.ui.reservation.FirestoreViewModel viewModel) {
    }
}