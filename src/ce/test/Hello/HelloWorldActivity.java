package ce.test.Hello;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HelloWorldActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btn = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(this);
    }
    public void onClick(View v) {
    	// TODO Auto-generated method stub
    	Intent it = new Intent (Intent.ACTION_SENDTO,Uri.parse("smsto:"));
    	Intent it = new Intent (Intent.ACTION_DIAL,Uri.parse("tel:"));
    	startActivity(it);
    }
}