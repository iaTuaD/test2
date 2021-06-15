package Khuvuc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleviewtt.R;

import java.util.List;

import Hoa.HoaAdapter;

public class KhuvucAdapter extends RecyclerView.Adapter<KhuvucAdapter.KhuVucViewHolder> {

    private Context mcContext;
    private List<Khuvuc> mKhuvucList;

    public KhuvucAdapter(Context mcContext) {
        this.mcContext = mcContext;
    }

    public void setData(List<Khuvuc> list){
        this.mKhuvucList = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public KhuVucViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tong, parent, false);
        return new KhuVucViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KhuVucViewHolder holder, int position) {
        Khuvuc khuvuc = mKhuvucList.get(position);
        if(khuvuc == null){
            return;
        }
        holder.txtKhuVuc.setText(khuvuc.getTenKhuvuc());

        LinearLayoutManager layoutManager = new LinearLayoutManager(mcContext, RecyclerView.HORIZONTAL, false);
        holder.rcvKhuVuc.setLayoutManager(layoutManager);
        HoaAdapter hoaAdapter = new HoaAdapter();
        hoaAdapter.setData(khuvuc.getHoas());
        holder.rcvKhuVuc.setAdapter(hoaAdapter);
    }

    @Override
    public int getItemCount() {
        if (mKhuvucList != null){
            return mKhuvucList.size();
        }
        return 0;
    }

    public class KhuVucViewHolder extends RecyclerView.ViewHolder{
        private TextView txtKhuVuc;
        private RecyclerView rcvKhuVuc;

        public KhuVucViewHolder(@NonNull View itemView) {
            super(itemView);
            txtKhuVuc =itemView.findViewById(R.id.txtKhu);
            rcvKhuVuc =itemView.findViewById(R.id.rcvHoa);
        }
    }
}
