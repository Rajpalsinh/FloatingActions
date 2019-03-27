package com.raj.floatingactions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

public class MainActivity extends AppCompatActivity {


    FloatingActionsMenu fam;

    ImageView dimmedBackground;

    FloatingActionButton floatingActionButton1, floatingActionButton2, floatingActionButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dimmedBackground = findViewById(R.id.bg);

        fam = findViewById(R.id.fab);

        fam.setOnFloatingActionsMenuUpdateListener(new FloatingActionsMenu.OnFloatingActionsMenuUpdateListener() {
            @Override
            public void onMenuExpanded() {
                dimmedBackground.setVisibility(View.VISIBLE);
            }

            @Override
            public void onMenuCollapsed() {
                dimmedBackground.setVisibility(View.GONE);
            }
        });

        floatingActionButton1 =  findViewById(R.id.material_design_floating_action_menu_item1);
        floatingActionButton2 =  findViewById(R.id.material_design_floating_action_menu_item2);
        floatingActionButton3 =  findViewById(R.id.material_design_floating_action_menu_item3);

        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked

            }
        });
        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu second item clicked

            }
        });
        floatingActionButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu third item clicked

            }
        });
    }
}
