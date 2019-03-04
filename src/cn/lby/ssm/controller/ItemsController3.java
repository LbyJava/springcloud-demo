package cn.lby.ssm.controller;

import cn.lby.ssm.po.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TSF
 * @Description:
 * @Date: Create in 2018/9/25 15:31
 */
@Controller
public class ItemsController3 {

    @RequestMapping("/queryItems")
    public ModelAndView queryItems() throws Exception {

        //调用service查找 数据库，查询商品列表，这里使用静态数据模拟
        List<Items> itemsList = new ArrayList<Items>();
        //向list中填充静态数据

        Items items_1 = new Items();
        items_1.setName("联想笔记本");
        items_1.setPrice(6000f);
        items_1.setDetail("ThinkPad T430 联想笔记本电脑！");

        Items items_2 = new Items();
        items_2.setName("苹果手机");
        items_2.setPrice(5000f);
        items_2.setDetail("iphone6苹果手机！");

        itemsList.add(items_1);
        itemsList.add(items_2);

        //返回modelAndView
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("itemsList", itemsList);

        modelAndView.setViewName("/itemsList.jsp");
        return modelAndView;
    }

}
