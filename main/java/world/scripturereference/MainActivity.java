package world.scripturereference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mButton;
    EditText mEdit;
    EditText mEdit2;
    EditText mEdit3;
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button)findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mEdit   = (EditText)findViewById(R.id.editText);
                mEdit2   = (EditText)findViewById(R.id.editText2);
                mEdit3   = (EditText)findViewById(R.id.editText3);
                mText = (TextView)findViewById(R.id.textView);
                mText.setText("Your Favorite Scripture is: "+mEdit.getText().toString()
                        + " " + mEdit2.getText().toString()
                        + ":" + mEdit3.getText().toString());
            }
        });
    }

}
