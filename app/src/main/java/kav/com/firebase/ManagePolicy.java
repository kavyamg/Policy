package kav.com.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.FirebaseDatabase;

public class ManagePolicy extends AppCompatActivity {
    TextView t1,t2,t3;
    FirebaseDatabase firebase=FirebaseDatabase.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_policy);
        t1= (TextView) findViewById(R.id.pname);
        t2= (TextView) findViewById(R.id.pnum);
        t3= (TextView) findViewById(R.id.renDate);


    }

    public void addToDB(View view) {

    }
}
