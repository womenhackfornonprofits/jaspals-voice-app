package uk.co.jaspalsvoice.jv.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import uk.co.jaspalsvoice.jv.R;
import uk.co.jaspalsvoice.jv.views.EditableCardView;

/**
 * Created by Ana on 2/8/2016.
 */
public class MedicinesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_medicines);

        EditableCardView medicines = (EditableCardView) findViewById(R.id.medication);
        medicines.setTitle(getString(R.string.medicines_title));
        medicines.setText(getString(R.string.medicines_title));
    }
}
