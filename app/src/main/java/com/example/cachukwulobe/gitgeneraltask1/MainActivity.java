package com.example.cachukwulobe.gitgeneraltask1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int toDoCount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = (EditText)findViewById(R.id.userInput);
        LinearLayout task1 = findViewById(R.id.task1);
        CheckBox checkBox1 = (CheckBox)findViewById(R.id.task1TextCheck);
        LinearLayout task2 = findViewById(R.id.task2);
        CheckBox checkBox2 = (CheckBox)findViewById(R.id.task2TextCheck);
        LinearLayout task3 = findViewById(R.id.task3);
        CheckBox checkBox3 = (CheckBox)findViewById(R.id.task3TextCheck);
        LinearLayout task4 = findViewById(R.id.task4);
        CheckBox checkBox4 = (CheckBox)findViewById(R.id.task4TextCheck);
        LinearLayout task5 = findViewById(R.id.task5);
        CheckBox checkBox5 = (CheckBox)findViewById(R.id.task5TextCheck);

        task1.setVisibility(View.GONE);
        task2.setVisibility(View.GONE);
        task3.setVisibility(View.GONE);
        task4.setVisibility(View.GONE);
        task5.setVisibility(View.GONE);

        checkBox1.setText("");
        checkBox2.setText("");
        checkBox3.setText("");
        checkBox4.setText("");
        checkBox5.setText("");
    }

    /*
    public void addtask(){
        toDoCount++;
    }
    */

    public void removetask1(View view)
    {
        LinearLayout task1 = findViewById(R.id.task1);
        CheckBox checkBox1 = (CheckBox)findViewById(R.id.task1TextCheck);
        LinearLayout task2 = findViewById(R.id.task2);
        CheckBox checkBox2 = (CheckBox)findViewById(R.id.task2TextCheck);
        LinearLayout task3 = findViewById(R.id.task3);
        CheckBox checkBox3 = (CheckBox)findViewById(R.id.task3TextCheck);
        LinearLayout task4 = findViewById(R.id.task4);
        CheckBox checkBox4 = (CheckBox)findViewById(R.id.task4TextCheck);
        LinearLayout task5 = findViewById(R.id.task5);
        CheckBox checkBox5 = (CheckBox)findViewById(R.id.task5TextCheck);

        checkBox1.setText("");

        if(task5.getVisibility() != View.GONE) {
            task5.setVisibility(View.GONE);
            checkBox5.setChecked(false);
            toDoCount--;
        }
        else if(task4.getVisibility() != View.GONE) {
            task4.setVisibility(View.GONE);
            checkBox4.setChecked(false);
            toDoCount--;
        }
        else if(task3.getVisibility() != View.GONE) {
            task3.setVisibility(View.GONE);
            checkBox3.setChecked(false);
            toDoCount--;
        }
        else if(task2.getVisibility() != View.GONE) {
            task2.setVisibility(View.GONE);
            checkBox2.setChecked(false);
            toDoCount--;
        }
        else if(task1.getVisibility() != View.GONE) {
            task1.setVisibility(View.GONE);
            checkBox1.setChecked(false);
            toDoCount--;
        }



        arrange(checkBox1, checkBox2, checkBox3, checkBox4, checkBox5);
    }

    public void removetask2(View view)
    {
        LinearLayout task1 = findViewById(R.id.task1);
        CheckBox checkBox1 = (CheckBox)findViewById(R.id.task1TextCheck);
        LinearLayout task2 = findViewById(R.id.task2);
        CheckBox checkBox2 = (CheckBox)findViewById(R.id.task2TextCheck);
        LinearLayout task3 = findViewById(R.id.task3);
        CheckBox checkBox3 = (CheckBox)findViewById(R.id.task3TextCheck);
        LinearLayout task4 = findViewById(R.id.task4);
        CheckBox checkBox4 = (CheckBox)findViewById(R.id.task4TextCheck);
        LinearLayout task5 = findViewById(R.id.task5);
        CheckBox checkBox5 = (CheckBox)findViewById(R.id.task5TextCheck);

        checkBox2.setText("");

        if(task5.getVisibility() != View.GONE) {
            task5.setVisibility(View.GONE);
            checkBox5.setChecked(false);
            toDoCount--;
        }
        else if(task4.getVisibility() != View.GONE) {
            task4.setVisibility(View.GONE);
            checkBox4.setChecked(false);
            toDoCount--;
        }
        else if(task3.getVisibility() != View.GONE) {
            task3.setVisibility(View.GONE);
            checkBox3.setChecked(false);
            toDoCount--;
        }
        else if(task2.getVisibility() != View.GONE) {
            task2.setVisibility(View.GONE);
            checkBox2.setChecked(false);
            toDoCount--;
        }


        arrange(checkBox1, checkBox2, checkBox3, checkBox4, checkBox5);
    }

    public void removetask3(View view)
    {
        LinearLayout task1 = findViewById(R.id.task1);
        CheckBox checkBox1 = (CheckBox)findViewById(R.id.task1TextCheck);
        LinearLayout task2 = findViewById(R.id.task2);
        CheckBox checkBox2 = (CheckBox)findViewById(R.id.task2TextCheck);
        LinearLayout task3 = findViewById(R.id.task3);
        CheckBox checkBox3 = (CheckBox)findViewById(R.id.task3TextCheck);
        LinearLayout task4 = findViewById(R.id.task4);
        CheckBox checkBox4 = (CheckBox)findViewById(R.id.task4TextCheck);
        LinearLayout task5 = findViewById(R.id.task5);
        CheckBox checkBox5 = (CheckBox)findViewById(R.id.task5TextCheck);

        checkBox3.setText("");


        if(task5.getVisibility() != View.GONE) {
            task5.setVisibility(View.GONE);
            checkBox5.setChecked(false);
            toDoCount--;
        }
        else if(task4.getVisibility() != View.GONE) {
            task4.setVisibility(View.GONE);
            checkBox4.setChecked(false);
            toDoCount--;
        }
        else if(task3.getVisibility() != View.GONE) {
            task3.setVisibility(View.GONE);
            checkBox3.setChecked(false);
            toDoCount--;
        }


        arrange(checkBox1, checkBox2, checkBox3, checkBox4, checkBox5);
    }

    public void removetask4(View view)
    {
        LinearLayout task1 = findViewById(R.id.task1);
        CheckBox checkBox1 = (CheckBox)findViewById(R.id.task1TextCheck);
        LinearLayout task2 = findViewById(R.id.task2);
        CheckBox checkBox2 = (CheckBox)findViewById(R.id.task2TextCheck);
        LinearLayout task3 = findViewById(R.id.task3);
        CheckBox checkBox3 = (CheckBox)findViewById(R.id.task3TextCheck);
        LinearLayout task4 = findViewById(R.id.task4);
        CheckBox checkBox4 = (CheckBox)findViewById(R.id.task4TextCheck);
        LinearLayout task5 = findViewById(R.id.task5);
        CheckBox checkBox5 = (CheckBox)findViewById(R.id.task5TextCheck);

        checkBox4.setText("");

        if(task5.getVisibility() != View.GONE) {
            task5.setVisibility(View.GONE);
            checkBox5.setChecked(false);
            toDoCount--;
        }
        else if(task4.getVisibility() != View.GONE) {
            task4.setVisibility(View.GONE);
            checkBox4.setChecked(false);
            toDoCount--;
        }




        arrange(checkBox1, checkBox2, checkBox3, checkBox4, checkBox5);
    }

    public void removetask5(View view)
    {
        LinearLayout task1 = findViewById(R.id.task1);
        CheckBox checkBox1 = (CheckBox)findViewById(R.id.task1TextCheck);
        LinearLayout task2 = findViewById(R.id.task2);
        CheckBox checkBox2 = (CheckBox)findViewById(R.id.task2TextCheck);
        LinearLayout task3 = findViewById(R.id.task3);
        CheckBox checkBox3 = (CheckBox)findViewById(R.id.task3TextCheck);
        LinearLayout task4 = findViewById(R.id.task4);
        CheckBox checkBox4 = (CheckBox)findViewById(R.id.task4TextCheck);
        LinearLayout task5 = findViewById(R.id.task5);
        CheckBox checkBox5 = (CheckBox)findViewById(R.id.task5TextCheck);

        checkBox5.setText("");

        if(task5.getVisibility() != View.GONE) {
            task5.setVisibility(View.GONE);
            checkBox5.setChecked(false);
            toDoCount--;
        }


        arrange(checkBox1, checkBox2, checkBox3, checkBox4, checkBox5);
    }

    public void removealltasks(View view)
    {
        for(int i = 0; i<5; i++) {
            removetask1(view);
            removetask2(view);
            removetask3(view);
            removetask4(view);
            removetask5(view);

//            if(i<4)
//                toDoCount++;
        }
    }

    public void addTask1(View view)
    {
        EditText editText = (EditText)findViewById(R.id.userInput);

        String userTask;
        userTask = editText.getText().toString();

        if (userTask.isEmpty())
        {
            //Toast input field
            Toast.makeText(this, "Enter a task", Toast.LENGTH_SHORT).show();
            return;
        }

        //Task 1 views
        LinearLayout task1 = findViewById(R.id.task1);
        CheckBox checkBox1 = (CheckBox)findViewById(R.id.task1TextCheck);

        //Task 2 views
        LinearLayout task2 = findViewById(R.id.task2);
        CheckBox checkBox2 = (CheckBox)findViewById(R.id.task2TextCheck);

        //Task 3 views
        LinearLayout task3 = findViewById(R.id.task3);
        CheckBox checkBox3 = (CheckBox)findViewById(R.id.task3TextCheck);

        //Task 4 views
        LinearLayout task4 = findViewById(R.id.task4);
        CheckBox checkBox4 = (CheckBox)findViewById(R.id.task4TextCheck);

        //Task 5 views
        LinearLayout task5 = findViewById(R.id.task5);
        CheckBox checkBox5 = (CheckBox)findViewById(R.id.task5TextCheck);




        if(checkBox1.getText().toString().isEmpty())
        {
            task1.setVisibility(View.VISIBLE);
            checkBox1.setText(userTask);
            editText.setText("");

        }
        else if (checkBox2.getText().toString().isEmpty())
        {
            task2.setVisibility(View.VISIBLE);
            checkBox2.setText(userTask);
            editText.setText("");
        }
        else if (checkBox3.getText().toString().isEmpty())
        {
            task3.setVisibility(View.VISIBLE);
            checkBox3.setText(userTask);
            editText.setText("");
        }
        else if (checkBox4.getText().toString().isEmpty())
        {
            task4.setVisibility(View.VISIBLE);
            checkBox4.setText(userTask);
            editText.setText("");
        }
        else if (checkBox5.getText().toString().isEmpty())
        {
            task5.setVisibility(View.VISIBLE);
            checkBox5.setText(userTask);
            editText.setText("");
        }
        else
        {
            //toast msg: O oh. No more tasks for you
            Toast.makeText(this, "No more tasks for you.\nBuy full version to add more tasks", Toast.LENGTH_SHORT).show();

            toDoCount--;
        }


        toDoCount++;

        return;
    }

    private void arrange(CheckBox a, CheckBox b, CheckBox c, CheckBox d, CheckBox e)
    {
        if(a.getText().toString() == "")
        {
            swap(a, b); swap(b, c); swap(c, d); swap(d, e);
        }
        else if(b.getText().toString() == "")
        {
            swap(b, c); swap(c, d); swap(d, e);
        }
        else if(c.getText().toString() == "")
        {
            swap(c, d); swap(d, e);
        }
        else if(d.getText().toString() == "")
        {
            swap(d, e);
        }
        return;
    }

    private void swap(CheckBox a, CheckBox b)
    {
        String temp;
        temp = a.getText().toString();
        a.setText(b.getText().toString());
        b.setText(temp);

        return;
    }

    public void stats(View view)
    {
        CheckBox[] checkBoxes = new CheckBox[5];
        checkBoxes[0] = (CheckBox)findViewById(R.id.task1TextCheck);
        checkBoxes[1] = (CheckBox)findViewById(R.id.task2TextCheck);
        checkBoxes[2] = (CheckBox)findViewById(R.id.task3TextCheck);
        checkBoxes[3] = (CheckBox)findViewById(R.id.task4TextCheck);
        checkBoxes[4] = (CheckBox)findViewById(R.id.task5TextCheck);

        int done = 0;
        int remaining = 0;

        int total = toDoCount;

        for (int i = 0; i<5; i++)
        {
            if (checkBoxes[i].isChecked())
                done++;
        }

        remaining = total - done;


        //another toast for stats
        String status = "You added " + total +" tasks\n\n";
        status += "You've done " + done + " tasks\n";
        status += "and have " + remaining + " remaining";

        Toast.makeText(this, status, Toast.LENGTH_SHORT).show();



    }
}
