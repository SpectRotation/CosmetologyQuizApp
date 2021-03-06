package space.fedosenko.CosmetologyQuizApp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MenuTestRecViewAdapter extends RecyclerView.Adapter<MenuTestRecViewAdapter.ViewHolder> {
    private static final String TAG = "MenuTestRecViewAdapter";
    public static final String TEST_KEY = "Test Key";

    private ArrayList<Topic> topics;
    private Context mContext;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.test_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: Called");
        holder.txtTestName.setText(topics.get(position).getName());
        holder.progressBar.setMax(topics.get(position).getMax());
        holder.progressBar.setProgress(topics.get(position).getProgress());
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, MainActivity.class);
                Model.getInstance().setTest(topics.get(position).getName());
                mContext.startActivity(intent);
            }
        });
        holder.txtGrade.setText(topics.get(position).getGrades()+"%");


    }

    @Override
    public int getItemCount() {
        return topics.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private CardView parent;
        private TextView txtTestName,txtGrade;
        private ProgressBar progressBar;
        public ViewHolder(@NonNull View itemView){
            super(itemView);

            parent = itemView.findViewById(R.id.item_parent);
            txtTestName = itemView.findViewById(R.id.tv_test_name);
            progressBar = itemView.findViewById(R.id.progressBar);
            txtGrade = itemView.findViewById(R.id.txtGrade);

        }
    }

    public MenuTestRecViewAdapter(ArrayList<Topic> topics, Context mContext) {
        this.topics = topics;
        this.mContext = mContext;
    }
}
