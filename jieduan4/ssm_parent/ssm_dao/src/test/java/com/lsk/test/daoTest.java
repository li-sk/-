package com.lsk.test;

import com.lsk.dao.ItemsDao;
import com.lsk.pojo.Items;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @ClassName daoTest
 * @Author CODER
 * @time: 2020/09/01 14:12
 * @describe:
 * @process:
 */
public class daoTest {

    @Test
    public void list(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        ItemsDao itemsDao = app.getBean("itemsDao", ItemsDao.class);
        List<Items> list = itemsDao.list();
        for (Items items : list) {
            System.out.println(items);
        }
    }
}
