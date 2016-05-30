package myapp.com.hday01_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.gson.Gson;

import bean.GiftBean;
import bean.HttpUitls;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.textView3)
    TextView textView3;
    @BindView(R.id.textView4)
    TextView textView4;
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.button2)
    Button button2;
    @BindView(R.id.imageView)
    ImageView imageView;
    @BindView(R.id.radioButton)
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.button, R.id.button2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                //下载并解析json字符串
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String json = HttpUitls.doGetToString("http://zhushou.72g.com/app/gift/gift_list/");
                        GiftBean gf = new Gson().fromJson(json, GiftBean.class);
                        String s  = gf.getInfo().toString();
                        Log.i("","====ss "+s);
                    }
                }).start();

                break;
            case R.id.button2:
                break;
        }
    }
//
//
//    class MyAdapter extends BaseAdapter {
//
//        @Override
//        public int getCount() {
//            return 0;
//        }
//
//        @Override
//        public Object getItem(int position) {
//            return null;
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return 0;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            LayoutInflater.from(MainActivity.this).inflate(R.layout.item, null);
//            return null;
//        }
//
//
//    }
//    static class ViewHolder {
//        @Bind(R.id.textView5)
//        TextView tv;
//        @Bind(R.id.imageView2)
//        ImageView holder_iv;
//
//        ViewHolder(View view) {
//            ButterKnife.bind(this, view);
//        }
//    }
}
