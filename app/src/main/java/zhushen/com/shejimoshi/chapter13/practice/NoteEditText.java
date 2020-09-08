package zhushen.com.shejimoshi.chapter13.practice;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by Zhushen on 2018/5/15.
 */
public class NoteEditText extends EditText {
    public NoteEditText(Context context) {
        this(context,null);
    }

    public NoteEditText(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public NoteEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Memoto createMemotoFromEdit(){
        Memoto memoto = new Memoto();
        memoto.text = getText().toString();
        memoto.cursor = getSelectionStart();
        return memoto;
    }

    public void restoreEditText(Memoto memoto){
        setText(memoto.text);
        setSelection(memoto.cursor);
    }
}
