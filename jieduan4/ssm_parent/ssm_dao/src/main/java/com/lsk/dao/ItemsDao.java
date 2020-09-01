package com.lsk.dao;


import com.lsk.pojo.Items;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName ItemsDao
 * @Author CODER
 * @time: 2020/09/01 13:59
 * @describe:
 * @process:
 */
public interface ItemsDao {

    /**
     * 查询所有
     * @return
     */
    List<Items> list();

    /**
     * 保存操作
     * @param items
     * @return
     */
    int save(Items items);
}
