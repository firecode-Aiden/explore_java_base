package cn.firecode.explore.designpattern.adapter;

/**
 * @Project explore_java_base
 * @Author flynn
 * @Date 2021/11/2
 */
public class MediaPlayerAdapter extends Mp3Player implements MediaPlayer{
    @Override
    public void playMedia() {
        super.play();
    }
}
