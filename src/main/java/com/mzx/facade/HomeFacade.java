package com.mzx.facade;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 17:26
 *
 *      外观模式
 *
 */
public class HomeFacade {

    private DvdPlay dvdPlay;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private TheaterLight theaterLight;

    public HomeFacade() {
        dvdPlay = DvdPlay.getInstance();
        popcorn = Popcorn.getInstance();
        projector = Projector.getInstance();
        screen = Screen.getInstance();
        stereo = Stereo.getInstance();
        theaterLight = TheaterLight.getInstance();
    }


    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlay.on();
        theaterLight.dim();
    }

    public void play(){
        dvdPlay.play();
    }

    public void pause(){
        dvdPlay.pause();
    }

    public void end(){
        popcorn.off();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlay.off();
        theaterLight.bright();
    }

}