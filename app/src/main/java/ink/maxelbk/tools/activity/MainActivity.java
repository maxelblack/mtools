package ink.maxelbk.tools.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import ink.maxelbk.tools.Interfaces;
import ink.maxelbk.tools.R;

public class MainActivity extends AppCompatActivity {
    public static final String FINISH_APPLICATION_TAG = "exit";

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.getBooleanExtra(FINISH_APPLICATION_TAG, false)) {
            this.finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //设置工具栏
        Toolbar toolbar = findViewById(R.id.main_toolbar);

        setSupportActionBar(toolbar);

    }

    //菜单事件
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        return super.onOptionsItemSelected(item);
    }

    public void onExitMenuItemClick(MenuItem item) {
        Interfaces.main.exit(this);
    }
}
