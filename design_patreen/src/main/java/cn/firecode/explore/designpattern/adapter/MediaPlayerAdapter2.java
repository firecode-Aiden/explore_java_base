package cn.firecode.explore.designpattern.adapter;

/**
 * @Project explore_java_base
 * @Author flynn
 * @Date 2021/11/2
 */
public class MediaPlayerAdapter2 implements MediaPlayer {

    private Mp3Player player;

    public MediaPlayerAdapter2(Mp3Player player){
        this.player = player;
    }
    @Override
    public void playMedia() {
        this.player.play();
    }
}
