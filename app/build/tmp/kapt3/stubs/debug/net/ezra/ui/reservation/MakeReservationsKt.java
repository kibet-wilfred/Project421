package net.ezra.ui.reservation;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.layout.*;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.navigation.NavHostController;
import coil.request.ImageRequest;
import com.google.firebase.Firebase;
import com.google.firebase.storage.FirebaseStorage;
import net.ezra.R;
import java.util.UUID;

@kotlin.Suppress(names = {"NAME_SHADOWING"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u001a\b\u0010\n\u001a\u00020\u0007H\u0007\u001a>\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014\u001a>\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014\"\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\u00a8\u0006\u001c"}, d2 = {"progressDialog", "Landroid/app/ProgressDialog;", "getProgressDialog", "()Landroid/app/ProgressDialog;", "setProgressDialog", "(Landroid/app/ProgressDialog;)V", "AddStudents", "", "navController", "Landroidx/navigation/NavHostController;", "PreviewLight", "saveToFirestore", "imageUrl", "", "Name", "Package", "Email", "Destination", "phone", "context", "Landroid/content/Context;", "uploadImageToFirebaseStorage", "imageUri", "Landroid/net/Uri;", "studentName", "studentClass", "studentEmail", "location", "app_debug"})
public final class MakeReservationsKt {
    @org.jetbrains.annotations.Nullable
    private static android.app.ProgressDialog progressDialog;
    
    @org.jetbrains.annotations.Nullable
    public static final android.app.ProgressDialog getProgressDialog() {
        return null;
    }
    
    public static final void setProgressDialog(@org.jetbrains.annotations.Nullable
    android.app.ProgressDialog p0) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @android.annotation.SuppressLint(value = {"UnusedMaterial3ScaffoldPaddingParameter"})
    public static final void AddStudents(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController) {
    }
    
    public static final void uploadImageToFirebaseStorage(@org.jetbrains.annotations.NotNull
    android.net.Uri imageUri, @org.jetbrains.annotations.NotNull
    java.lang.String studentName, @org.jetbrains.annotations.NotNull
    java.lang.String studentClass, @org.jetbrains.annotations.NotNull
    java.lang.String studentEmail, @org.jetbrains.annotations.NotNull
    java.lang.String location, @org.jetbrains.annotations.NotNull
    java.lang.String phone, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public static final void saveToFirestore(@org.jetbrains.annotations.NotNull
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull
    java.lang.String Name, @org.jetbrains.annotations.NotNull
    java.lang.String Package, @org.jetbrains.annotations.NotNull
    java.lang.String Email, @org.jetbrains.annotations.NotNull
    java.lang.String Destination, @org.jetbrains.annotations.NotNull
    java.lang.String phone, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    public static final void PreviewLight() {
    }
}