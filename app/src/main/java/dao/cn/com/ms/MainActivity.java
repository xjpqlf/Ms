package dao.cn.com.ms;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        Log.d("who", "init: 我的方法112");

       /* final TextInputLayout inputLayout = (TextInputLayout) findViewById(R.id.textInput);
        inputLayout.setHint("请输入姓名:");

        EditText editText = inputLayout.getEditText();
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length()>4){
                    inputLayout.setErrorEnabled(true);
                    inputLayout.setError("姓名长度不能超过4个");
                }else{
                    inputLayout.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

          FloatingActionButton fa= (FloatingActionButton) findViewById(R.id.fa);
        if (fa != null) {
            fa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Snackbar snackbar = Snackbar.make(inputLayout,"测试弹出提示",Snackbar.LENGTH_LONG);
                    snackbar.show();
                  //  snackbar.setActionTextColor(ColorStateList.valueOf(getResources().getColor(R.color.colorAccent));
                    snackbar.setAction("取消",new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            snackbar.dismiss();
                        }
                    });
                }
            });
        }
*/

/*
    ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

     TabLayout   tabLayout = (TabLayout) findViewById(R.id.tabs);
        List<String> tabList = new ArrayList<>();
        tabList.add("视频");
        tabList.add("新闻");
        tabList.add("段子");
        tabList.add("段子");
        tabList.add("段子");
        tabList.add("段子");
        tabList.add("段子");
        tabList.add("段子");
        tabList.add("段子");
        tabList.add("段子");
        tabList.add("段子");
        tabList.add("段子");
        tabList.add("段子");
        tabLayout.setTabMode(TabLayout.MODE_FIXED);//设置tab模式，当前为系统默认模式
        tabLayout.addTab(tabLayout.newTab().setText(tabList.get(0)));//添加tab选项卡
        tabLayout.addTab(tabLayout.newTab().setText(tabList.get(1)));
        tabLayout.addTab(tabLayout.newTab().setText(tabList.get(2)));
        tabLayout.addTab(tabLayout.newTab().setText(tabList.get(3)));
        tabLayout.addTab(tabLayout.newTab().setText(tabList.get(2)));
        tabLayout.addTab(tabLayout.newTab().setText(tabList.get(2)));
        tabLayout.addTab(tabLayout.newTab().setText(tabList.get(2)));
        tabLayout.addTab(tabLayout.newTab().setText(tabList.get(2)));
        tabLayout.addTab(tabLayout.newTab().setText(tabList.get(2)));
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);//设置tab模式
        List<Fragment> fragmentList = new ArrayList<>();
        for (int i = 0; i < tabList.size(); i++) {
            Fragment f1 = new TabFragment();
            Bundle bundle = new Bundle();
            bundle.putString("content", "我是第"+i+"界面");
            f1.setArguments(bundle);
            fragmentList.add(f1);
        }

        TabFragmentAdapter fragmentAdapter = new TabFragmentAdapter(getSupportFragmentManager(), fragmentList, tabList);
        viewPager.setAdapter(fragmentAdapter);//给ViewPager设置适配器
        tabLayout.setupWithViewPager(viewPager);//将TabLayout和ViewPager关联起来。
        tabLayout.setTabsFromPagerAdapter(fragmentAdapter);//给Tabs设置适配器
*/












    }


}
