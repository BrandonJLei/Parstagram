package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("s1hN25bMjzI4vt9aIws2hVtnKUEUlYVUQMzzbgxx")
                .clientKey("8u3jse5VDzHCMieGPpDANdP0HEVxvB4qWIpJPDTi")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
