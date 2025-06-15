package structuralPatterns.proxyPattern;

import java.util.HashMap;
import java.util.Map;

public class CacheVideoDownloader implements VideoDownloader {


    private RealVideoDownloader realDownloader;
    private Map<String, String> cache;

     public CacheVideoDownloader() {
        this.realDownloader = new RealVideoDownloader();
        this.cache = new HashMap<>();
    }

    @Override
    public String downloadVideo(String videoUrl) {
        if (cache.containsKey(videoUrl)) {
            System.out.println("Returning cached video for: " + videoUrl);
            return cache.get(videoUrl);
        }

        System.out.println("Cache miss. Downloading...");
        String video = realDownloader.downloadVideo(videoUrl);
        cache.put(videoUrl, video);
        return video;
    }
}
