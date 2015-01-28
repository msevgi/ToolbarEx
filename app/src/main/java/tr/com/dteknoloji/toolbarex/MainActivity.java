
package tr.com.dteknoloji.toolbarex;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends ActionBarActivity {
   private Toolbar toolbar;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      toolbar = (Toolbar) findViewById(R.id.toolbar);
      setSupportActionBar(toolbar);
      Button btn = (Button) findViewById(R.id.button);
      btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.ic_launcher));
      TextView txt = (TextView) findViewById(R.id.titlee);
      txt.setText("my title");
      // getSupportActionBar().setHomeButtonEnabled(false);
      // getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(false);
      // toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_launcher));
      toolbar.setTitle("MY toolbar");
      // toolbar.setSubtitle("Subtitle");
//      toolbar.inflateMenu(R.menu.menu_main);
//      // TextView t=findViewById(R.id.te)
//      toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
//         @Override
//         public boolean onMenuItemClick(MenuItem menuItem) {
//            Toast.makeText(MainActivity.this, "toast", Toast.LENGTH_SHORT).show();
//            return false;
//         }
//      });
      // toolbar.setTitle("");
      // toolbar.hideOverflowMenu();
      // toolbar.addView((LinearLayout) LayoutInflater.from(this).inflate(R.layout.custom_toolbar, null));
   }

   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
   // Inflate the menu; this adds items to the action bar if it is present.
   getMenuInflater().inflate(R.menu.menu_main, menu);
   return true;
   }

   @Override
   public boolean onOptionsItemSelected(MenuItem item) {
      // Handle action bar item clicks here. The action bar will
      // automatically handle clicks on the Home/Up button, so long
      // as you specify a parent activity in AndroidManifest.xml.
      int id = item.getItemId();

      // noinspection SimplifiableIfStatement
      if (id == R.id.action_settings) {
         return true;
      }

      return super.onOptionsItemSelected(item);
   }
}
