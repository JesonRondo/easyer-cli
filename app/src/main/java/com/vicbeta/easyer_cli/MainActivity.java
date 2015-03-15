package com.vicbeta.easyer_cli;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView highlightView = (TextView) findViewById(R.id.text_ad2);
        String highlight_full_word = getResources().getString(R.string.text_ad_str2);
        String highlight_word = getResources().getString(R.string.text_ad_highlight);

        int start = highlight_full_word.indexOf(highlight_word);
        SpannableStringBuilder style = new SpannableStringBuilder(highlight_full_word);
        style.setSpan(
            new ForegroundColorSpan(getResources().getColor(R.color.font_color_orange)),
            start,
            start + highlight_word.length(),
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        highlightView.setText(style);
    }

}
