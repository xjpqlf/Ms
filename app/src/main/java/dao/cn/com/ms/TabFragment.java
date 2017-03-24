package dao.cn.com.ms;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * @name dao.cn.com.ms
 * @class name：Ms
 * @class describe
 * @anthor uway QQ:343251588
 * @time 2017/3/22 16:00
 * @change uway
 * @chang 2017/3/22 16:00
 * @class describe
 */

public class TabFragment extends Fragment {

    private String content;
    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.item, container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        content = getArguments().getString("content");
        TextView tvContent = (TextView) view.findViewById(R.id.tv_tab_content);
        tvContent.setText(content + "");
    }
}
