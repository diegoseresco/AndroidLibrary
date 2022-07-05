package diego.salcedo.androidlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import diego.salcedo.hello_world.HelloWorld;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HelloWorld hello = new HelloWorld();
        hello.showHelloWorld();
    }
}