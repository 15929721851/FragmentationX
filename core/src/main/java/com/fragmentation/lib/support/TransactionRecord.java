package com.fragmentation.lib.support;

import android.os.Bundle;

import java.util.UUID;

import com.fragmentation.lib.R;
import com.fragmentation.lib.anim.FragmentAnimation;

class TransactionRecord {

    FragmentAnimation fragmentAnimation = new FragmentAnimation(R.anim.anim_empty, R.anim.anim_empty, R.anim.anim_empty, R.anim.anim_empty);

    int requestCode = -1;

    int resultCode = -1;

    Bundle resultData;

    boolean displayEnterAnim = true;

    String tag = UUID.randomUUID().toString();

    boolean addBackStack = true;

    Runnable runOnExecute;

    Class popToCls;

    boolean includeTarget = true;

    SupportFragment remove;

    boolean removeAnim = true;

    boolean dontDisplaySelfPopAnim = false;
}
