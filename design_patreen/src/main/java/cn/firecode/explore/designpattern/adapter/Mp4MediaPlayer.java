package cn.firecode.explore.designpattern.adapter;

import javax.print.attribute.standard.Media;

/**
 * @Project explore_java_base
 * @Author flynn
 * @Date 2021/11/2
 */
public class Mp4MediaPlayer implements MediaPlayer {
    @Override
    public void playMedia() {
        System.out.println("播放mp4文件");
    }
}
