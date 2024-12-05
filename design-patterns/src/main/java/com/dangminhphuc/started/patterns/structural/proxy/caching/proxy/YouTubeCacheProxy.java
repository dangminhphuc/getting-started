package com.dangminhphuc.started.patterns.structural.proxy.caching.proxy;

import com.dangminhphuc.started.patterns.structural.proxy.caching.lib.ThirdPartyYouTubeClass;
import com.dangminhphuc.started.patterns.structural.proxy.caching.lib.ThirdPartyYoutubeLib;
import com.dangminhphuc.started.patterns.structural.proxy.caching.lib.Video;

import java.util.HashMap;

public class YouTubeCacheProxy implements ThirdPartyYoutubeLib {
    private final ThirdPartyYoutubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private final HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    public YouTubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}