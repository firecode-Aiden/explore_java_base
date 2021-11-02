package cn.firecode.explore.designpattern.adapter;

import java.lang.reflect.Method;

/**
 * @Project explore_java_base
 * @Author flynn
 * @Date 2021/11/2
 * 适配器模式最好在详细设计阶段不要考虑它，它不是为了解决还处在开发阶段的问题，
 * 而是解决正在服役的项目问题，没有一个系统分析师会在做详细设计的时候考虑使用适配器
 * 模式，这个模式使用的主要场景是扩展应用中，就像我们上面的那个例子一样，系统扩展 了，
 * 不符合原有设计的时候才考虑通过适配器模式减少代码修改带来的风险。
 */
public class AdapterPatternMain {

    public static void main(String[] args) {
//         MediaPlayer media = new Mp4MediaPlayer();
//         MediaPlayer media = new MediaPlayerAdapter();
        MediaPlayer media = new MediaPlayerAdapter2(new Mp3Player());

        media.playMedia();

    }
}
