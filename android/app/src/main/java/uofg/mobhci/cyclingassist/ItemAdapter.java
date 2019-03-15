package uofg.mobhci.cyclingassist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {

    String[] times;
    String[] distances;
    LayoutInflater mInflater;

    public ItemAdapter(Context c, String[] t, String[] d) {

        times = t;
        distances = d;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return times.length;
    }

    @Override
    public Object getItem(int position) {
        return times[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = mInflater.inflate(R.layout.distance_list, null);
        TextView timeTv = (TextView) v.findViewById(R.id.times);
        TextView distTv = (TextView) v.findViewById(R.id.distance);
        timeTv.setText(times[position]);
        distTv.setText(distances[position]);

        return v;
    }
}
