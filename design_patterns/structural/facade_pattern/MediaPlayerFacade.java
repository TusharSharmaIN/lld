package design_patterns.structural.facade_pattern;

public class MediaPlayerFacade {
    private MusicPlayer musicPlayer;
    private VideoPlayer videoPlayer;
    private ImageViewer imageViewer;

    public MediaPlayerFacade() {
        this.musicPlayer = new MusicPlayer();
        this.videoPlayer = new VideoPlayer();
        this.imageViewer = new ImageViewer();
    }

    public void performAction(String action) {
    switch (action.toLowerCase()) {
      case "playmusic":
        musicPlayer.initializeAudioDrivers();
        musicPlayer.decodeAudio();
        musicPlayer.startPlayback();
        break;
      case "playvideo":
        videoPlayer.setupRenderingEngine();
        videoPlayer.loadVideoFile();
        videoPlayer.playVideo();
        break;
      case "viewimage":
        imageViewer.loadImageFile();
        imageViewer.applyScaling();
        imageViewer.displayImage();
        break;
      default:
        System.out.println("Invalid action!");
    }
  }
}
