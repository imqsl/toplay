package com.imqsl.service.impl;

import com.imqsl.dao.PlayDao;
import com.imqsl.domain.Play;
import com.imqsl.service.PlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by imqsl on 2017/9/14.
 */
@Service
public class PlayServiceImpl implements PlayService {
    @Autowired
    PlayDao playDao;

    public void addPlay(Play play) {
        playDao.insert(play);
    }

    public void removePlay(Play play) {
        playDao.delete(play);
    }

    public void removePlayById(Integer id) {
        playDao.deleteById(id);
    }

    public List<Play> findPlay(Play play) {
        return playDao.selectWithParams(play);
    }

    public Play findPlayById(Integer id) {
        return playDao.selectById(id);
    }

    public void modifyPlay(Play play) {
        playDao.update(play);
    }
}
