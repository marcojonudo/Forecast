package forecast.udacity.marco.forecast;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> mForecastAdapter;
    ListView listView;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] forecastArray = {
                "Lunes - Soleado - 36/24",
                "Martes - Soleado - 33/22",
                "Miércoles - Soleado - 33/22",
                "Jueves - Soleado - 33/22",
                "Viernes - Soleado - 33/22",
                "Sábado - Soleado - 33/22",
                "Domingo - Soleado - 33/22"};

        List<String> weekForecast = new ArrayList<>(Arrays.asList(forecastArray));

        mForecastAdapter = new ArrayAdapter<>(getContext(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, weekForecast);
        listView = (ListView)rootView.findViewById(R.id.listview_forecast);

        listView.setAdapter(mForecastAdapter);


        return rootView;
    }
}
