package example.drag;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.style.base.BaseTitleBarActivity;
import com.style.framework.R;
import com.style.framework.databinding.DragActivityBinding;
import com.style.view.diviver.DividerItemDecoration;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;


public class DragActivity extends BaseTitleBarActivity {
    DragActivityBinding bd;
    private ArrayList<Integer> dataList;
    private LinearLayoutManager layoutManager;
    private DragAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle arg0) {
        super.onCreate(arg0);
        setContentView(R.layout.drag_activity);
        setTitleBarTitle("拖拽测试");
        bd = getBinding();
        dataList = new ArrayList<>();
        adapter = new DragAdapter(getContext(), dataList);
        layoutManager = new LinearLayoutManager(getContext());
        bd.recyclerView.setLayoutManager(layoutManager);
        bd.recyclerView.addItemDecoration(new DividerItemDecoration(getContext()));
        bd.recyclerView.setAdapter(adapter);

        ItemTouchHelper helper = new ItemTouchHelper(new DragAdapterCallback(adapter));
        helper.attachToRecyclerView(bd.recyclerView);

        adapter.setOnItemClickListener((position, data) -> showToast(position + "-->  data-->" + data + "-->getdata-->" + dataList.get(position)));

        refresh();
    }

    private void refresh() {

        dataList.clear();
        for (int i = 0; i < 5; i++) {
            dataList.add(i);
        }
        adapter.notifyDataSetChanged();
    }

}
