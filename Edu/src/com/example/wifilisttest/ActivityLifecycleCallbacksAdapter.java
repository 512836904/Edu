package com.example.wifilisttest;  
  
import android.annotation.SuppressLint;  
import android.app.Activity;  
import android.app.Application;  
import android.os.Build;  
import android.os.Bundle;  
  
/** 
 * Created by wanjian on 2016/11/19. 
 */  
  
@SuppressLint("NewApi")  
public class ActivityLifecycleCallbacksAdapter implements Application.ActivityLifecycleCallbacks {  
    @Override  
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {  
  
    }  
  
    @Override  
    public void onActivityStarted(Activity activity) {  
  
    }  
  
    @Override  
    public void onActivityResumed(Activity activity) {  
  
    }  
  
    @Override  
    public void onActivityPaused(Activity activity) {  
  
    }  
  
    @Override  
    public void onActivityStopped(Activity activity) {  
  
    }  
  
    @Override  
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {  
  
    }  
  
    @Override  
    public void onActivityDestroyed(Activity activity) {  
  
    }  
}  