package ink.maxelbk.tools.api;

import android.app.Activity;
import android.content.Intent;

import ink.maxelbk.tools.Interfaces;
import ink.maxelbk.tools.activity.MainActivity;

public class MainApi {

    public MainApi() {
        Interfaces.main = this;
    }

    //API
    public void exit(Activity parent) {
        //TODO 结束程序
        Intent intent = new Intent(parent, MainActivity.class);
        intent.putExtra(MainActivity.FINISH_APPLICATION_TAG, true);
        parent.startActivity(intent);
    }
}
