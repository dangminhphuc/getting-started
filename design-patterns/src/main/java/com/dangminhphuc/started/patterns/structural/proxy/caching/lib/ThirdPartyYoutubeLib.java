package com.dangminhphuc.started.patterns.structural.proxy.caching.lib;

import java.util.HashMap;

public interface ThirdPartyYoutubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}