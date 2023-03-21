package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int selectIndex = 0;
        for (int i = 0; i < playList.length; i++) {
            if (playList[i].equals(selection)) {
                selectIndex = i;
            }
        }
        if (selectIndex - startIndex > playList.length / 2){
            return playList.length - (selectIndex - startIndex);
        }
        return selectIndex - startIndex;
    }
}
