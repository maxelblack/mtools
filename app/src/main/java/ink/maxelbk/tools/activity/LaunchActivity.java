package ink.maxelbk.tools.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import ink.maxelbk.tools.Interfaces;
import ink.maxelbk.tools.R;
import ink.maxelbk.tools.api.MainApi;

public class LaunchActivity extends AppCompatActivity {

    public LaunchActivity() {
        Interfaces.main = new MainApi();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        startActivity(new Intent(this, MainActivity.class));
        this.finish();
    }

}
