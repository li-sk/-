package com.lsk.service;

import com.lsk.dao.ItemsDao;
import com.lsk.pojo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ItemsService
 * @Author CODER
 * @time: 2020/09/01 14:42
 * @describe:
 * @process:
 */
public interface ItemsService {

    List<Items> list();

    int save(Items items);
}
