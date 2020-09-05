package com.wbb.dp.chapter13;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Note编辑类
 *
 * @author vico
 * @date 2018-11-29
 */
public class NoteEditText extends EditText {
    public NoteEditText(Context context) {
        this(context, null);
    }

    public NoteEditText(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NoteEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    //创建备忘录对象，即存储编辑器的指定数据
    public Memotos createMemoto() {
        Memotos noteMemoto = new Memotos();
        //存储文本与光兵位置
        noteMemoto.text = getText().toString();
        noteMemoto.cursor = getSelectionStart();
        return noteMemoto;
    }

    //从备忘录中恢复数据
    public void restore(Memotos memotos) {
        setText(memotos.text);
        //设置光标位置
        setSelection(memotos.cursor);
    }
}
