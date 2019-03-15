package uofg.mobhci.cyclingassist;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class SecondTabFragment extends Fragment {

    String[] emergencies;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View cview = inflater.inflate(R.layout.fragment_second_tab, container, false);

        Resources res = getResources();
        ListView emerView = (ListView) cview.findViewById(R.id.emergencies);
        emergencies = res.getStringArray(R.array.Emergencies);
//        emerView.setAdapter(new ArrayAdapter<String>(getActivity(), R.layout.simple_text_list, emergencies));

        EmergencyAdapter emgAdapter = new EmergencyAdapter(getActivity(), emergencies);
        emerView.setAdapter(emgAdapter);

        return cview;
    }
}
