package com.thundercats.queuer.managers;

/**
 * Created by kmchen1 on 1/7/14.
 */
public interface LoginManagerCallback {

    public void startedRequest();
    public void finishedRequest(boolean successful);

}