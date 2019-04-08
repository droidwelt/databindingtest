package droidwelt.ru.databindingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import droidwelt.ru.databindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    static Employee employee = new Employee(1, "John Smith", "London");
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setEmployee(employee);

        Button id_button = findViewById(R.id.id_button);
        id_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                employee.name.set("Vasya Pipkin");
                employee.address.set("Madrid");
                //binding.setEmployee(employee);
            }
        });
    }


}
