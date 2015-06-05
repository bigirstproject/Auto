package com.sunsun.auto.fragment;

import android.support.v4.app.Fragment;

import com.sunsun.auto.adapter.BaseImageAdapter;
import com.sunsun.auto.base.BaseListFragment;
import com.sunsun.auto.entity.ChannelEntity;

public class GalleryFragment extends BaseListFragment<ChannelEntity> {

	public static Fragment newInstance() {
		GalleryFragment fragment = new GalleryFragment();
		return fragment;
	}

	@Override
	protected void requestDataImpl(int refreshStatus, int method, String url,
			Class<?> clazz) {
		// TODO Auto-generated method stub

	}

	@Override
	protected BaseImageAdapter<ChannelEntity> initListAdapter() {
		// TODO Auto-generated method stub
		return null;
	}

}
