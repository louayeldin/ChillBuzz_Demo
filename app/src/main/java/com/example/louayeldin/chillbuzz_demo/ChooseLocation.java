package com.example.louayeldin.chillbuzz_demo;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class ChooseLocation extends AppCompatActivity implements View.OnClickListener {

    Button nxt_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_location);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        nxt_btn = (Button)findViewById(R.id.nxt_btn) ;
        nxt_btn.setOnClickListener(this);

        //get the spinner from the xml.
        Spinner countryDropdown = findViewById(R.id.countries_dropdown_menu);
        //create a list of items for the spinner.
        String[] country_items = new String[]{"Saudi Arabia", "United Arab Emirate", "Egypt", "Kuwait"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
        //There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> countryAdapterList = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, country_items);
        //set the spinners adapter to the previously created one.
        countryDropdown.setAdapter(countryAdapterList);

        //get the spinner from the xml.
        Spinner cityDropdown = findViewById(R.id.cities_dropdown_menu);
        //create a list of items for the spinner.
        String[] city_items = new String[]{"Riyadh", "Jeddah", "Dammam"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
        //There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> cityAdapterList = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, city_items);
        //set the spinners adapter to the previously created one.
        cityDropdown.setAdapter(cityAdapterList);

        //get the spinner from the xml.
        Spinner showRoomDropdown = findViewById(R.id.showroom_dropdown_menu);
        //create a list of items for the spinner.
        String[] showroom_items = new String[]{"RedSea - Show Room 1", "RedSea - Show Room 2", "RedSea - Show Room 3", "RedSea - Show Room 4"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
        //There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> showRoomAdapterList = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, showroom_items);
        //set the spinners adapter to the previously created one.
        showRoomDropdown.setAdapter(showRoomAdapterList);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(ChooseLocation.this, MainActivity.class);
        startActivity(intent);
    }
}
