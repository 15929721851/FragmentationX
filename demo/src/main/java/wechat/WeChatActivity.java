package wechat;

import android.os.Bundle;

import androidx.annotation.Nullable;
import me.liam.fragmentation.R;
import com.fragmentation.lib.support.SupportActivity;

/**
 * Created by Augustine on 2019/12/31.
 * <p>
 * email:nice_ohoh@163.com
 */
public class WeChatActivity extends SupportActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wechat_root);
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        if (getActionBar() != null){
            getActionBar().hide();
        }
        if (findFragmentByClass(RootFragment.class) == null){
            loadRootFragment(R.id.container,RootFragment.newInstance());
        }
    }
}
