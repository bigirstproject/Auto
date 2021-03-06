package com.sunsun.auto.xlistview;
//package com.sunsun.nbapic.xlistview;
//
//import java.util.ArrayList;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.os.Handler;
//import android.util.Log;
//import android.widget.ArrayAdapter;
//
//import com.sunsun.nbapic.R;
//import com.sunsun.nbapic.xlistview.XListView.IXListViewListener;
//
//public class XListViewActivity extends Activity implements IXListViewListener {
//	private final String TAG="XListViewActivity";
//	private XListView mListView;
//	private ArrayAdapter<String> mAdapter;
//	private ArrayList<String> items = new ArrayList<String>();
//	private Handler mHandler;
//	private int start = 0;
//	private static int refreshCnt = 0;
//	/** Called when the activity is first created. */
//	@Override
//	public void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.xlistview);
//		geneItems();
//		mListView = (XListView) findViewById(R.id.xListView);
//		mListView.setPullLoadEnable(true);
//		mAdapter = new ArrayAdapter<String>(this, R.layout.list_item, items);
//		mListView.setAdapter(mAdapter);
////		mListView.setPullLoadEnable(false);
////		mListView.setPullRefreshEnable(false);
//		mListView.setXListViewListener(this);
//		mHandler = new Handler();
//	}
//
//	private void geneItems() {
//		for (int i = 0; i != 20; ++i) {
//			items.add("refresh cnt " + (++start));
//		}
//	}
//
//	private void onLoad() {
//		mListView.stopRefresh();
//		mListView.stopLoadMore();
//		mListView.setRefreshTime("刚刚");
//	}
//	
//	@Override
//	public void onRefresh() {
//		Log.i(TAG, "刷新最新");
//		mHandler.postDelayed(new Runnable() {
//			@Override
//			public void run() {
//				start = ++refreshCnt;
//				items.clear();
//				geneItems();
//				// mAdapter.notifyDataSetChanged();
//				mAdapter = new ArrayAdapter<String>(XListViewActivity.this, R.layout.list_item, items);
//				mListView.setAdapter(mAdapter);
//				onLoad();
//			}
//		}, 2000);
//	}
//
//	@Override
//	public void onLoadMore() {
//		Log.i(TAG, "加载更多");
//		mHandler.postDelayed(new Runnable() {
//			@Override
//			public void run() {
//				geneItems();
//				mAdapter.notifyDataSetChanged();
//				onLoad();
//			}
//		}, 2000);
//	}
//
//}