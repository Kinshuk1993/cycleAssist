package uofg.mobhci.cyclingassist;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class FirstTabFragment extends Fragment {

    String[] times;
    String[] distance;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View cview = inflater.inflate(R.layout.fragment_first_tab, container, false);

        Resources res = getResources();
        ListView distView = (ListView) cview.findViewById(R.id.distances);
        times = res.getStringArray(R.array.Times);
        distance = res.getStringArray(R.array.Distance);

        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), times, distance);
        distView.setAdapter(itemAdapter);

        return cview;
    }

}
