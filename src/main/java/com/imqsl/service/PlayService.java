package com.imqsl.service;

import com.imqsl.domain.Play;

import java.util.List;

/**
 * Created by imqsl on 2017/9/13.
 */
public interface PlayService {
    //用户参与活动
    void addPlay(Play play);

    //用户退出活动
    void deletePlay(Play play);

    //查询活动
    List<Play> findPlay(Play play);

    //修改活动
    void modifyPlay(Play play);
}
