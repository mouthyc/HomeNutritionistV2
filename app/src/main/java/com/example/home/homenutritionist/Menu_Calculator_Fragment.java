package com.example.home.homenutritionist;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

/**
 * Created by Jimmy on 14/4/2015.
 */
public class Menu_Calculator_Fragment extends AppCompatActivity {
//public class Menu_Calculator_Fragment extends Fragment {
    // open the fragment
    // View rootview;

    double value = 0;
    TextView textOut;
    String storeInput = "";
    //@Nullable


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caloriescaltor);
        //public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //rootview = inflater.inflate(R.layout.caloriescaltor, container, false);

        Button button = (Button) findViewById(R.id.sugar);
        Button button1 = (Button) findViewById(R.id.oil);
        Button button2 = (Button) findViewById(R.id.pepper);
        Button button3 = (Button) findViewById(R.id.oregano);
        Button button4 = (Button) findViewById(R.id.mushroom);
        Button button5 = (Button) findViewById(R.id.apple);
        Button button6 = (Button) findViewById(R.id.banana);
        Button button7 = (Button) findViewById(R.id.orange);
        Button button8 = (Button) findViewById(R.id.pineapple);
        Button button9 = (Button) findViewById(R.id.onion);
        Button button10 = (Button) findViewById(R.id.beef);
        Button button11 = (Button) findViewById(R.id.chicken);
        Button button12 = (Button) findViewById(R.id.lamb);
        Button button13 = (Button) findViewById(R.id.pork);
        Button button14 = (Button) findViewById(R.id.duck);
        Button button15 = (Button) findViewById(R.id.rice);
        Button button16 = (Button) findViewById(R.id.noodle);
        Button button17 = (Button) findViewById(R.id.corn);
        Button button18 = (Button) findViewById(R.id.bread);
        Button button19 = (Button) findViewById(R.id.fish);
        Button button20 = (Button) findViewById(R.id.salmon);
        Button button21 = (Button) findViewById(R.id.catfish);
        Button button22 = (Button) findViewById(R.id.cuttlefish);
        Button button23 = (Button) findViewById(R.id.squid);
        Button button24 = (Button) findViewById(R.id.shrimp);
        Button button25 = (Button) findViewById(R.id.crab);
        Button button26 = (Button) findViewById(R.id.shellfish);
        Button button27 = (Button) findViewById(R.id.other);
        Button button28 = (Button) findViewById(R.id.reset);
        Button button29 = (Button) findViewById(R.id.checkInput);
        ImageView image1 = (ImageView) findViewById(R.id.red);
        ImageView image2 = (ImageView) findViewById(R.id.yellow);
        ImageView image3 = (ImageView) findViewById(R.id.green);
        ImageView image4 = (ImageView) findViewById(R.id.seasoning);
        ImageView image5 = (ImageView) findViewById(R.id.vegetable);
        ImageView image6 = (ImageView) findViewById(R.id.meat);
        ImageView image7 = (ImageView) findViewById(R.id.cereal);
        ImageView image8 = (ImageView) findViewById(R.id.seafood);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSugar(v);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickOil(v);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickPepper(v);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickOregano(v);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickMushroom(v);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickApple(v);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickBanana(v);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickOrange(v);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickPineapple(v);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickOnion(v);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickBeef(v);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickChicken(v);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickLamb(v);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickPork(v);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickDuck(v);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickRice(v);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickNoodle(v);
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCorn(v);
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickBread(v);
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickFish(v);
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSalmon(v);
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCatfish(v);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCuttlefish(v);
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSquid(v);
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickShrimp(v);
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCrab(v);
            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickShellfish(v);
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickOther(v);
            }
        });

        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickReset(v);
            }
        });

        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert(v);
            }
        });

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickRed(v);
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickYellow(v);
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickGreen(v);
            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSeasoning(v);
            }
        });

        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickVegetable(v);
            }
        });

        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickMeat(v);
            }
        });

        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCereal(v);
            }
        });

        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSeafood(v);
            }
        });

        //    return rootview;
    }


    public void clickSugar(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);

        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }
// disallow user to click the button if the "totalGram" editText is empty to prevent the app from crashing

        value = value + Double.parseDouble(gram.getText().toString()) * 3.87;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));
// calculate the amount of calories and show it on the app

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of sugar" + System.getProperty("line.separator");
// store the input (types of food and the appropriate amount) chosen by users

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }
// Indicate whether the user is absorbing to much calories or not through green, yellow and red light

        gram.setText("");
//reset the editText gram to null
    }

    public void clickOil(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            // Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 88.4;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of oil" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickPepper(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 2.55;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of pepper" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickOregano(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 3.06;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of oregano" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickMushroom(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 0.22;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of mushroom" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickApple(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 0.52;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of apple" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickBanana(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 1.05;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of banana" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickOrange(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 0.621;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of orange" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickPineapple(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 0.48;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of pineapple" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickOnion(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 0.42;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of onion" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickBeef(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 1.87;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of beef" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickChicken(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 1.95;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of chicken" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickLamb(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 2.48;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of lamb" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickPork(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 3.63;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of pork" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickDuck(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 3.36;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of duck" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickRice(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 1.29;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of rice" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickNoodle(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 1.09;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of noodle" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickCorn(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 0.86;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of corn" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickBread(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 0.66;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of bread" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickOat(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 3.89;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of oats" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickFish(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 1.09;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of sea fish" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickSalmon(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 1.46;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of salmon" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickCatfish(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 2.4;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of catfish" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickCuttlefish(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 0.79;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of cuttlefish" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickSquid(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 0.92;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of squid" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickShrimp(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 1.44;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of shrimp" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickCrab(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 1.01;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of crab" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickShellfish(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        if (gram.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount ", Toast.LENGTH_SHORT).show();
            return;
        }

        value = value + Double.parseDouble(gram.getText().toString()) * 0.86;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));

        storeInput = storeInput + Double.parseDouble(gram.getText().toString()) + "gram of shellfish" + System.getProperty("line.separator");

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }

        gram.setText("");
    }

    public void clickOther(View v) {
        EditText calories = (EditText) findViewById(R.id.caloriesOfOtherFood);
        if (calories.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the amount of calories ", Toast.LENGTH_SHORT).show();
            return;
        }
// disallow user to click the "other" button if the "caloriesOfOtherFood" editText is empty to prevent the app from crashing

        EditText nameOfOtherFood = (EditText) findViewById(R.id.nameOfOtherFood);
        storeInput = storeInput + (nameOfOtherFood.getText().toString()) + System.getProperty("line.separator");
// display the name of food on the input record

        if (nameOfOtherFood.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Please enter the name of dish/ingredient ", Toast.LENGTH_SHORT).show();
            return;
        }
// disallow user to click the "other" button if the "nameOfOtherFood" editText is empty to prevent the app from crashing
        else {
            value = value + Double.parseDouble(calories.getText().toString());
            TextView result = (TextView) findViewById(R.id.totalCalories);
            DecimalFormat df2 = new DecimalFormat("###.##");
            result.setText(String.valueOf(Double.valueOf(df2.format(value))));
        }
//user input the amount of calories for other food, add it to the total value

        if (value < 2400) {
            ImageView imgView = (ImageView) findViewById(R.id.green);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.red);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        } else if (value >= 2400 && value < 2500) {
            ImageView imgView = (ImageView) findViewById(R.id.yellow);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.red);
            imgView3.setVisibility(View.INVISIBLE);
        } else {
            ImageView imgView = (ImageView) findViewById(R.id.red);
            imgView.setVisibility(View.VISIBLE);
            ImageView imgView2 = (ImageView) findViewById(R.id.green);
            imgView2.setVisibility(View.INVISIBLE);
            ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
            imgView3.setVisibility(View.INVISIBLE);
        }
        calories.setText("");
        nameOfOtherFood.setText("");
    }

    public void clickReset(View v) {
        EditText gram = (EditText) findViewById(R.id.totalGram);
        gram.setText("0");

        value = 0;
        TextView result = (TextView) findViewById(R.id.totalCalories);
        DecimalFormat df2 = new DecimalFormat("###.##");
        result.setText(String.valueOf(Double.valueOf(df2.format(value))));
// reset the total calories to 0

        storeInput = "";
//reset the input record

        ImageView imgView = (ImageView) findViewById(R.id.red);
        imgView.setVisibility(View.INVISIBLE);
        ImageView imgView2 = (ImageView) findViewById(R.id.green);
        imgView2.setVisibility(View.INVISIBLE);
        ImageView imgView3 = (ImageView) findViewById(R.id.yellow);
        imgView3.setVisibility(View.INVISIBLE);
//reset the red, green, yellow button

        ((EditText) findViewById(R.id.totalGram)).setText("");
        ((EditText) findViewById(R.id.nameOfOtherFood)).setText("");
        ((EditText) findViewById(R.id.caloriesOfOtherFood)).setText("");
//reset the field of editText

    }


    public void clickGreen(View v) {
        DecimalFormat format = new DecimalFormat("#.#");
        Toast.makeText(getApplicationContext(), "Good! A normal adult needs around 2500 calories per day, you still can absorb " + format.format(2500 - value) + " more calories today.", Toast.LENGTH_LONG).show();
    }

    public void clickYellow(View v) {
        Toast.makeText(getApplicationContext(), "Perfect! A normal adult needs around 2500 calories per day", Toast.LENGTH_LONG).show();
    }

    public void clickRed(View v) {
        DecimalFormat format = new DecimalFormat("#.#");
        Toast.makeText(getApplicationContext(), "Warning! A normal adult needs around 2500 calories per day, you are absorbing  " + format.format(value - 2500) + " more calories than you are needed!", Toast.LENGTH_LONG).show();
    }
    // toast box to explain the meaning of green, yellow and red light.


    public void showAlert(View v) {
       // AlertDialog.Builder myAlert = new AlertDialog.Builder(getApplicationContext());
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage(storeInput)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setTitle("Welcome!Here is your input record")
                .create();
        myAlert.show();
    }
// allow user to check the input record

    public void clickSeasoning(View v) {


        Button myBtn = (Button) findViewById(R.id.sugar);
        myBtn.requestFocus();

        Button button = (Button) findViewById(R.id.sugar);
        button.setFocusable(true);
        button.setFocusableInTouchMode(true);///add getApplicationContext() line
        button.requestFocus();
    }
// redirect user to the desired type of food

    public void clickVegetable(View v) {


        Button myBtn = (Button) findViewById(R.id.mushroom);
        myBtn.requestFocus();

        Button button = (Button) findViewById(R.id.mushroom);
        button.setFocusable(true);
        button.setFocusableInTouchMode(true);///add getApplicationContext() line
        button.requestFocus();
    }

    public void clickMeat(View v) {


        Button myBtn = (Button) findViewById(R.id.beef);
        myBtn.requestFocus();

        Button button = (Button) findViewById(R.id.beef);
        button.setFocusable(true);
        button.setFocusableInTouchMode(true);///add getApplicationContext() line
        button.requestFocus();
    }

    public void clickCereal(View v) {


        Button myBtn = (Button) findViewById(R.id.rice);
        myBtn.requestFocus();

        Button button = (Button) findViewById(R.id.rice);
        button.setFocusable(true);
        button.setFocusableInTouchMode(true);///add getApplicationContext() line
        button.requestFocus();
    }

    public void clickSeafood(View v) {


        Button myBtn = (Button) findViewById(R.id.fish);
        myBtn.requestFocus();

        Button button = (Button) findViewById(R.id.fish);
        button.setFocusable(true);
        button.setFocusableInTouchMode(true);///add getApplicationContext() line
        button.requestFocus();
    }
}


// start the calculation of the app (I copy from other android studio file)



