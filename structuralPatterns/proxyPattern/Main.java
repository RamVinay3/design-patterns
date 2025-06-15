package structuralPatterns.proxyPattern;

public class Main {
     public static void main(String[] args) {
        VideoDownloader cacheVideoDownloader = new CacheVideoDownloader();
        System.out.println("User 1 tries to download the video.");
        cacheVideoDownloader.downloadVideo("https://video.com/proxy-pattern");

        System.out.println();

        System.out.println("User 2 tries to download the same video again.");
        cacheVideoDownloader.downloadVideo("https://video.com/proxy-pattern");
    }
}
//depends on use case we can extend this to logging etc,., also
