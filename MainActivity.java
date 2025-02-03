package com.example.fragments;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
public class MainActivity extends AppCompatActivity {
Button red,green,blue;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
EdgeToEdge.enable(this);
setContentView(R.layout.activity_main);
red=(Button)findViewById(R.id.btnred);
green=(Button)findViewById(R.id.btngreen);
blue=(Button)findViewById(R.id.btnblue);
ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main),
(v, insets) -&gt; {
Insets systemBars =
insets.getInsets(WindowInsetsCompat.Type.systemBars());
v.setPadding(systemBars.left, systemBars.top, systemBars.right,
systemBars.bottom);
return insets;
});
red.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
FragmentManager fragmentManager=getSupportFragmentManager();
fragmentManager.beginTransaction().replace(R.id.fragmentred,new
red(),null).commit();
}
});
blue.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
FragmentManager fragmentManager=getSupportFragmentManager();
fragmentManager.beginTransaction().replace(R.id.fragmentred,new
blue(),null).commit();
}
});
green.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
FragmentManager fragmentManager=getSupportFragmentManager();

fragmentManager.beginTransaction().replace(R.id.fragmentred,new
green(),null).commit();
}
});
}
}
