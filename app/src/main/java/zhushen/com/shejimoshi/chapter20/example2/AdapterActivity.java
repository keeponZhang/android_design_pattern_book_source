package zhushen.com.shejimoshi.chapter20.example2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import zhushen.com.shejimoshi.R;

public class AdapterActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        recyclerView = (RecyclerView)findViewById(R.id.recycle_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        List<Article> articles = new ArrayList<>();

        ArticleAdapter adapter = new ArticleAdapter(articles);
        recyclerView.setAdapter(adapter);
    }
}
