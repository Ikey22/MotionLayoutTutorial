package app.isolvetech.motionlayouttutorial

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData
import app.isolvetech.motionlayouttutorial.R

import kotlinx.android.synthetic.main.activity_step1.*

class Step7CompletedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step7_with_hint)
    }
}
