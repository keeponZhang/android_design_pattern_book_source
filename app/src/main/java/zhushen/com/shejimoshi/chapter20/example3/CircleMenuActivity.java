package zhushen.com.shejimoshi.chapter20.example3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.simple.net.demo.R;


public class CircleMenuActivity extends AppCompatActivity {
    private CircleMenuLayout circleMenuLayout;

    private String[] texts = new String[]{"test1","test2","test3","test4","test5"};
    private int[] images = new int[]{
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
    R.mipmap.ic_launcher
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_menu);

        circleMenuLayout = (CircleMenuLayout)findViewById(R.id.menu_layout);
        circleMenuLayout.setMenuItemIconsAndTexts(images,texts);
        circleMenuLayout.setOnMenuItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CircleMenuActivity.this,texts[position],Toast.LENGTH_LONG).show();
            }
        });
    }
}
