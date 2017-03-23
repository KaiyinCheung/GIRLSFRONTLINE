package hk.com.kycheungal.girlsfrontline.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import hk.com.kycheungal.girlsfrontline.module.*;
import hk.com.kycheungal.girlsfrontline.R;


import java.util.List;

/**
 * Created by User on 21/3/2017.
 */

public class GirlAdapter extends RecyclerView.Adapter<GirlAdapter.DerpHolder>{

    private List<GirlListItem> listData;
    private LayoutInflater inflater;

    private ItemClickCallBack itemClickCallBack;

    public interface ItemClickCallBack {
        void onItemClick(int position);

    }

    public void setItemClickCallBack(ItemClickCallBack itemClickCallBack) {
        this.itemClickCallBack = itemClickCallBack;
    }

    public GirlAdapter(List<GirlListItem> listData, Context c){
        inflater = LayoutInflater.from(c);
        this.listData = listData;
    }

    @Override
    public GirlAdapter.DerpHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new DerpHolder(view);
    }

    @Override
    public void onBindViewHolder(DerpHolder holder, int position) {
        GirlListItem item = listData.get(position);
        holder.skillLv.setText(String.valueOf(item.getSkillLv()));
        holder.name.setText(item.getName());
        holder.icon.setImageResource(item.getIconID());
        holder.lv.setText(String.valueOf(item.getLv()));
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class DerpHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView name, lv, skillLv;
        private ImageView icon;
        private View container;

        public DerpHolder(View itemView) {
            super(itemView);
            lv = (TextView) itemView.findViewById(R.id.txv_Lv);
            skillLv = (TextView) itemView.findViewById(R.id.txv_skillLv);
            name = (TextView) itemView.findViewById(R.id.txv_name);
            icon = (ImageView) itemView.findViewById(R.id.imv_icon);
            container = itemView.findViewById(R.id.cont_item_root);
            container.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            itemClickCallBack.onItemClick(getAdapterPosition());
        }
    }
}
