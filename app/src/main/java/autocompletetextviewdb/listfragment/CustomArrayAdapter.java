package autocompletetextviewdb.listfragment;

/**
 * Created by Dell on 14-10-2016.
 */
import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomArrayAdapter extends ArrayAdapter<Model> {
    private final LayoutInflater mInflater;

    public CustomArrayAdapter(Context context) {
        super(context, android.R.layout.simple_list_item_2);
        mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setData(List<Model> data) {
        clear();
        if (data != null) {
            for (Model appEntry : data) {
                add(appEntry);
            }
        }
    }

    /**
     * Populate new items in the list.
     */
    @Override public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        if (convertView == null) {
            view = mInflater.inflate(R.layout.single_item, parent, false);
        } else {
            view = convertView;
        }

        Model item = getItem(position);
        ((TextView)view.findViewById(R.id.tv_label)).setText(item.getName());
        ((TextView)view.findViewById(R.id.tv_id)).setText(item.getId());

        return view;
    }
}