package com.example.bookvelvetfinal;



import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class Alert extends AppCompatActivity {
    private TextView tvOnceTime,tvOnceDate,tvRepeatingTime;
    private ImageButton ibOnceTime,ibOnceDate,ibRepeatingTime;
    private EditText etOnceMessage, etRepeatingMessage;
    private Button btnSetOnceAlarm,btnSetRepeatingAlarm,btnCancelRepeatingAlarm;

    private AlarmReceiver alarmReceiver;
    private int mYear,mMonth,mDay,mHour,mMinute;
    private int mHourRepeat,mMinuteRepeat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        getSupportActionBar().hide();


        tvOnceTime=findViewById(R.id.tv_once_time);
        tvOnceDate=findViewById(R.id.tv_once_date);
        tvRepeatingTime=findViewById(R.id.tv_repeating_time);
        ibOnceTime=findViewById(R.id.ib_once_time);
        ibOnceDate=findViewById(R.id.ib_once_date);
        ibRepeatingTime=findViewById(R.id.ib_repeating_time);
        etOnceMessage=findViewById(R.id.et_once_message);
        etRepeatingMessage=findViewById(R.id.et_repeating_message);
        btnSetOnceAlarm=findViewById(R.id.btn_set_once_alarm);
        btnSetRepeatingAlarm=findViewById(R.id.btn_set_repeating_alarm);
        btnCancelRepeatingAlarm=findViewById(R.id.btn_cancel_repeating_alarm);


        alarmReceiver=new AlarmReceiver();

        Calendar calendar=Calendar.getInstance();
        mYear=calendar.get(Calendar.YEAR);
        mMonth=calendar.get(Calendar.MONTH);
        mDay=calendar.get(Calendar.DAY_OF_MONTH);
        mHour=calendar.get(Calendar.HOUR_OF_DAY);
        mMinute=calendar.get(Calendar.MINUTE);


        mHourRepeat=mHour;
        mMinuteRepeat=mMinute;

        ibOnceDate.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog=new DatePickerDialog(Alert.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                        tvOnceDate.setText(String.format("%04d-%02d-%02d",year,month+1,dayOfMonth));
                        mYear=year;
                        mMonth=month;
                        mDay=dayOfMonth;


                    }
                },mYear,mMonth,mDay);
                datePickerDialog.show();

            }
        });
        ibOnceTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerDialog timePickerDialog=new TimePickerDialog(Alert.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
                        tvOnceTime.setText(String.format("%02d:%02d",hourOfDay,minute));
                        mHour=hourOfDay;
                        mMinute=minute;
                    }
                },mHour,mMinute,true);
                timePickerDialog.show();
            }
        });
        ibRepeatingTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerDialog timePickerDialog=new TimePickerDialog(Alert.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
                        tvRepeatingTime.setText(String.format("%02d:%02d",hourOfDay,minute));
                        mHourRepeat=hourOfDay;
                        mMinuteRepeat=minute;
                    }
                },mHourRepeat,mMinuteRepeat,true);
                timePickerDialog.show();

            }
        });

        btnSetOnceAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvOnceDate.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(Alert.this, "DATE IS EMPTY", Toast.LENGTH_SHORT).show();
                }else if(tvOnceTime.getText().toString().equalsIgnoreCase("")) {
                    Toast.makeText(Alert.this, "TIME  IS EMPTY", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(etOnceMessage.getText().toString())){
                    etOnceMessage.setError("message can't be empty!");

                }else {
                    alarmReceiver.setOneTimeAlarm(Alert.this,AlarmReceiver.TYPE_ONE_TIME,
                            tvOnceDate.getText().toString(),tvOnceTime.getText().toString(),
                            etOnceMessage.getText().toString());
                }
            }
        });

        btnSetRepeatingAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvRepeatingTime.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(Alert.this,"Time is Empty",Toast.LENGTH_SHORT).show();
                }else if(TextUtils.isEmpty(etRepeatingMessage.getText().toString())){
                    etRepeatingMessage.setError("Message can't be Empty ! ");
                }else {
                    alarmReceiver.setRepeatingAlarm(Alert.this,AlarmReceiver.TYPE_REPEATING,
                            tvRepeatingTime.getText().toString(),
                            etRepeatingMessage.getText().toString());
                }
            }
        });

        btnCancelRepeatingAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(alarmReceiver.isAlarmSet(Alert.this,AlarmReceiver.TYPE_REPEATING)){
                    tvRepeatingTime.setText("");
                    etRepeatingMessage.setText("");
                    alarmReceiver.cancelAlarm(Alert.this,AlarmReceiver.TYPE_REPEATING);
                }
            }
        });
    }
}