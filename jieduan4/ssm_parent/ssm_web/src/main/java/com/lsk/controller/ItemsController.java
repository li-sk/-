package com.lsk.controller;

import com.lsk.pojo.Items;
import com.lsk.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName ItemsController
 * @Author CODER
 * @time: 2020/09/01 14:52
 * @describe:
 * @process:
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Items> list = itemsService.list();
        model.addAttribute("items",list);
        return "items";
    }

    @RequestMapping("/save")
    public String save(Items items){
        itemsService.save(items);
        return "redirect:/items/list";
    }
}
