package com.lsk.service.impl;

import com.lsk.dao.ItemsDao;
import com.lsk.pojo.Items;
import com.lsk.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ItemsServiceImpl
 * @Author CODER
 * @time: 2020/09/01 14:44
 * @describe:
 * @process:
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    @Override
    public List<Items> list() {
        return itemsDao.list();
    }

    @Override
    public int save(Items items) {
        return itemsDao.save(items);
    }
}
