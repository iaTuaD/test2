package Hoa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleviewtt.R;

import java.util.List;

import static android.os.Build.VERSION_CODES.R;

public class HoaAdapter extends RecyclerView.Adapter<HoaAdapter.HoaViewHolder> {

    private List<Hoa> mHoa;
    public void setData(List<Hoa> list){
        this.mHoa = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public HoaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(com.example.recycleviewtt.R.layout.item_flower, parent, false);
        return new HoaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HoaViewHolder holder, int position) {
        Hoa hoa = mHoa.get(position);
        if(hoa == null){
            return;
        }
        holder.imgHoa.setImageResource(hoa.getResoucedId());
        holder.txtTitle.setText(hoa.getTitle());
    }

    @Override
    public int getItemCount() {
        if(mHoa != null){
            return mHoa.size();
        }
        return 0;
    }

    public class HoaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgHoa;
        private TextView txtTitle;
        public HoaViewHolder(@NonNull View itemView) {
            super(itemView);
            imgHoa = itemView.findViewById(com.example.recycleviewtt.R.id.imgFlower);
            txtTitle =itemView.findViewById(com.example.recycleviewtt.R.id.txtTen);
        }
    }
}
