package com.example.yougourta.projmob.Detail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.yougourta.projmob.Classes.Commentaire;
import com.example.yougourta.projmob.MainActivity;
import com.example.yougourta.projmob.R;

import java.util.ArrayList;

public class CommentairesActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Commentaire> commentaires;
    commentaireAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commentaires);

        Intent intent = getIntent();
        commentaires = (ArrayList<Commentaire>) intent.getSerializableExtra("commentaires");

        listView = (ListView)findViewById(R.id.listView);
        adapter = new commentaireAdapter(commentaires);
        listView.setAdapter(adapter);

        TextView envoyer = (TextView)findViewById(R.id.envoyer);
        final EditText comment = (EditText)findViewById(R.id.commentaireEditText);

        envoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commentaires.add(new Commentaire(MainActivity.user4, comment.getText().toString()));
                comment.setText("");
                adapter.notifyDataSetChanged();
                listView.smoothScrollToPosition(adapter.getCount());
                InputMethodManager imm = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(
                        comment.getWindowToken(), 0);
            }
        });

    }
}
