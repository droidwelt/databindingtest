package droidwelt.ru.databindingtest;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

public class Employee {

    public Employee(long id, String name, String address) {
        this.id = id;
        this.name.set(name);
        this.address.set(address);
    }

    public long id;

    public ObservableField<String> name = new ObservableField<>();

    public ObservableField<String> address = new ObservableField<>();

}
