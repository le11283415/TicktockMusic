package com.freedom.lauzy.repository;

import com.freedom.lauzy.model.NetSongBean;

import java.util.List;

import io.reactivex.Observable;

/**
 * Desc : SongRepository
 * Author : Lauzy
 * Date : 2017/7/6
 * Blog : http://www.jianshu.com/u/e76853f863a9
 * Email : freedompaladin@gmail.com
 */
public interface SongRepository {
    Observable<List<NetSongBean>> getSongList(String method, int type, int offset, int size);

    Observable<List<NetSongBean>> getCacheSongList(int type);
}
