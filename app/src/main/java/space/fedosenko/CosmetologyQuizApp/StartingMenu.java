package space.fedosenko.CosmetologyQuizApp;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StartingMenu extends AppCompatActivity {
    private RecyclerView testsRecView;
    private MenuTestRecViewAdapter adapter;
    private ArrayList<Topic> topics;
    private TextView headingName;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        headingName = findViewById(R.id.txtHeading);
        topics = Model.getInstance().getTopics(this);
        adapter = new MenuTestRecViewAdapter(topics, this);
        testsRecView = findViewById(R.id.RecView_menu_tests);
        testsRecView.setAdapter(adapter);
        testsRecView.setLayoutManager(new LinearLayoutManager(this));
        System.out.println("Hi");
    }
}
