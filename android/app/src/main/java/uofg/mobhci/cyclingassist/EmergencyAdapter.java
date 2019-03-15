package uofg.mobhci.cyclingassist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class EmergencyAdapter extends BaseAdapter {

    String[] items;
    LayoutInflater mInflater;

    public EmergencyAdapter(Context c, String[] items) {

        this.items = items;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

//        View v = mInflater.inflate(R.layout.emergency_contacts_list, null);
        View v = mInflater.inflate(R.layout.emergency_contacts, null);
        TextView tvEmgName = (TextView) v.findViewById(R.id.tvEmgName);
        TextView tvEmgLocation = (TextView) v.findViewById(R.id.tvEmgLocation);
        TextView tvEmgAttribute = (TextView) v.findViewById(R.id.tvEmgAttribute);

        String[] fields = items[position].split(";");

        tvEmgAttribute.setText(fields[0]);
        tvEmgName.setText(fields[1]);
        tvEmgLocation.setText(fields[2]);

        return v;
    }
}
