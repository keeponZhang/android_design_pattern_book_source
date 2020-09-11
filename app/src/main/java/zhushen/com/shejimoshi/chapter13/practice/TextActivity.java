package zhushen.com.shejimoshi.chapter13.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.simple.net.demo.R;

import java.util.ArrayList;
import java.util.List;


public class TextActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText mNodeEditText;
    private TextView mSaveTV;
    private ImageView mUndoBtn,mRedoBtn;

    private static final int MAX = 30;
    private List<Memoto> mMemotos = new ArrayList<>(MAX);
    
    private int mIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        initViews();
    }

    private void initViews() {
        mNodeEditText = (EditText)findViewById(R.id.note_edit);
        mSaveTV = (TextView)findViewById(R.id.note_save);
        mUndoBtn = (ImageView)findViewById(R.id.note_undo);
        mRedoBtn = (ImageView)findViewById(R.id.note_redo);

        mUndoBtn.setOnClickListener(this);
        mRedoBtn.setOnClickListener(this);
        mSaveTV.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.note_undo:
                restoreEditText(getPrevMemoto());
                makeToast("undo :");
                break;
            case R.id.note_redo:
                restoreEditText(getNextMemoto());
                makeToast("redo :");
                break;
            case R.id.note_save:
                saveMemoto(createMemotoFromEdit());
                makeToast("save :");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }

    private void makeToast(String string){
        Toast.makeText(this,string + mNodeEditText.getText() + ",cursor = " +
                mNodeEditText.getSelectionStart(),Toast.LENGTH_LONG).show();
    }


    public void saveMemoto(Memoto memoto){
        if(mMemotos.size() >MAX){
            mMemotos.remove(0);
        }
        mMemotos.add(memoto);
        mIndex = mMemotos.size() - 1;
    }

    public Memoto getPrevMemoto(){
        mIndex = mIndex >0 ? --mIndex:mIndex;
        return mMemotos.get(mIndex);
    }

    public Memoto getNextMemoto(){
        mIndex = mIndex < mMemotos.size() -1 ? ++mIndex:mIndex;
        return mMemotos.get(mIndex);
    }

    private Memoto createMemotoFromEdit(){
        Memoto memoto = new Memoto();
        memoto.text = mNodeEditText.getText().toString();
        memoto.cursor = mNodeEditText.getSelectionStart();
        return memoto;
    }

    private void restoreEditText(Memoto memoto){
        mNodeEditText.setText(memoto.text);
        mNodeEditText.setSelection(memoto.cursor);
    }
}
