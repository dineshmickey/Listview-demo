package mickey.com.mickeylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] team = {"Mickey","Maggie","vishnu","sanjeev","pranitha","ishwariya","arun","vijay","jayasuriya","praveen","raja","dhaya","gva"};
        ListAdapter bucksapopter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,team);
        ListView list = (ListView) findViewById(R.id.list1);
        list.setAdapter(bucksapopter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String food;
                food = String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(MainActivity.this,food, Toast.LENGTH_LONG).show();
            }
        });
    }
}
