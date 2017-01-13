package test.home;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import android.widget.TextView;

import com.style.address.UploadPhone;
import com.style.base.BaseRecyclerViewAdapter;
import com.style.bean.Friend;
import com.style.framework.R;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class FriendAdapter extends BaseRecyclerViewAdapter {
	public FriendAdapter(Context context, List list) {
		super(context, list);
	}


    @Override
    public RecyclerView.ViewHolder onCreateItem(ViewGroup parent, int viewType) {
        return new ViewHolder(mInflater.inflate(R.layout.adapter_friend, parent, false));
    }

    @Override
    public void onBindItem(RecyclerView.ViewHolder viewHolder, int position, Object data) {
        ViewHolder holder = (ViewHolder) viewHolder;
		Friend f = (Friend) data;
		setText(holder.tv_mark, f.getMark());
		setText(holder.tv_name, f.getUser().getUserName());
	}

    public class ViewHolder extends RecyclerView.ViewHolder {
		@Bind(R.id.view_mark)
		TextView tv_mark;
		@Bind(R.id.view_nick)
		TextView tv_name;
		ViewHolder(View view) {
            super(view);
			ButterKnife.bind(this, view);
		}
	}
}