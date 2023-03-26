package com.example.bookvelvetfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Aboutus extends AppCompatActivity {
    ListView mListView;
    int[] images={
            R.drawable.lbrce,
            R.drawable.it,
            R.drawable.library,
            R.drawable.hod,
            R.drawable.hemalatha,
            R.drawable.praveen};

    String[] Names={"Lakireddy Bali Reddy College of Engineering (LBRCE), Mylavaram, Krishna District, Andhra Pradesh approved by AICTE and affiliated to JNTUK, Kakinada is an Autonomous Institution.",
            "Department of Information Technology at the LBRCE was established in 1999. Offers Undergraduate program (B.Tech) in IT and Post-graduate program (M.Tech) in Software Engineering. The B.Tech (Information Technology) program was started in the year 1999 with an intake of 40 students.",
            "Libraries store the energy that fuels the imagination. They open up windows to the world and inspire us to explore and achieve, and contribute to improving our quality of life",
            "Dr. B.Srinivasa Rao obtained his Ph.D. in Computer Science and Engineering from JNTUK Kakinada, M.Tech. in Computer Science and Technology from Andhra University :: Visakhapatnam " +
                    "and B.Tech. in Information Science and Technology from KLCE.",
            "MRS. M.Hemalatha" + "\n"+
                    "Sr.Assistant Professor"+"\n"+
                    "Phone:+91 9440356377",
            "MR. S.Praveen Kumar" +"\n"+
                    "Assistant Professor"+"\n"+
                    "Phone:+91 8501830210"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        getSupportActionBar().hide();
        mListView=(ListView) findViewById(R.id.listView);
        CustomAdaptor customAdaptor=new CustomAdaptor();
        mListView.setAdapter(customAdaptor);
    }

    class CustomAdaptor extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup) {

            View view=getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView mImageView=(ImageView) view.findViewById(R.id.imageView);
            TextView mTextView=(TextView) view.findViewById(R.id.textView);
            mImageView.setImageResource(images[position]);
            mTextView.setText(Names[position]);
            return view;
        }
    }
}