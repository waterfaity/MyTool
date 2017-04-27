package com.waterfairy.tool.rxjava.retrofit.down;

/**
 * Created by shui on 2017/4/26.
 */

public interface OnDownloadingListener {
    void onStartDownload();

    void onDownloading(boolean done, long total, long current);

    void onError(String msg);
}
