package space.fedosenko.CosmetologyQuizApp;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

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
    private LinearLayout frame;
    private Button restore;
    private Context mContext = this;
    private int protectionCount;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        protectionCount=10;
        headingName = findViewById(R.id.txtHeading);
        frame = findViewById(R.id.hidden_settings);
        restore = findViewById(R.id.button_restore);
        restore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (protectionCount>1) {
                    protectionCount--;

                    Toast.makeText(mContext, "Careful! You are going to delete all your data in "+protectionCount+" more clicks!", Toast.LENGTH_SHORT).show();
                } else {
                    Model.getInstance().restore();
                    topics = Model.getInstance().getTopics(mContext);
                    adapter = new MenuTestRecViewAdapter(topics, mContext);
                    testsRecView = findViewById(R.id.RecView_menu_tests);
                    testsRecView.setAdapter(adapter);
                    testsRecView.setLayoutManager(new LinearLayoutManager(mContext));
            }
            }
        });
        headingName.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (frame.getVisibility()== View.GONE){
                    frame.setVisibility(View.VISIBLE);
                } else {
                    frame.setVisibility(View.GONE);
                }
                return false;
            }
        });

        topics = Model.getInstance().getTopics(this);
        adapter = new MenuTestRecViewAdapter(topics, this);
        testsRecView = findViewById(R.id.RecView_menu_tests);
        testsRecView.setAdapter(adapter);
        testsRecView.setLayoutManager(new LinearLayoutManager(this));
        System.out.println("Hi");


    }
}
