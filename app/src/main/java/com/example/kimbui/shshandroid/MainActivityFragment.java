package com.example.kimbui.shshandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    TextView firstCoin;
    TextView secondCoin;
    TextView rate;
    ListView list;
    ArrayList<String> coinList = new ArrayList<>();


    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        //TODO remove below
        coinList.add("ABD");
        configureView(view);
        populateView(view);
        getList();
        return view;
    }

    private void configureView(View view){
        firstCoin = (TextView) view.findViewById(R.id.firstCoin);
        secondCoin = (TextView) view.findViewById(R.id.secondCoin);
        rate  = (TextView) view.findViewById(R.id.currentRate);
        list = (ListView) view.findViewById(R.id.coinList);
    }

    /**
     * Default to BTC_LTC
     * */
    private void populateView(View view){
        firstCoin.setText("BTC");
        secondCoin.setText("LTC");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,coinList);
        list.setAdapter(adapter);


    }

    public void getList(){

    }



}
