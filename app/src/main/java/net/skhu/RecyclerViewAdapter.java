package net.skhu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView textView1;

        public ViewHolder(View view) {
            super(view);
            textView1 = view.findViewById(R.id.textView);
            view.setOnClickListener(this);
        }

        public void setData(int index) {
            Memo1 memo = arrayList.get(index);
            textView1.setText(memo.getDateFormatted());
        }

        @Override
        public void onClick(View view) {
            int index = super.getAdapterPosition();
            Memo1 memo = arrayList.get(index);

        }
    }

    LayoutInflater layoutInflater;
    ArrayList<Memo1> arrayList;

    public RecyclerViewAdapter(Context context, ArrayList<Memo1> arrayList) {
        this.layoutInflater = LayoutInflater.from(context);
        this.arrayList = arrayList;
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = layoutInflater.inflate(R.layout.memo1, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int index) {
        viewHolder.setData(index);
    }
}

