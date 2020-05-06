package org.example.spring.controller;

import org.example.spring.model.Homework;
import org.example.spring.service.Impl.HomeworkServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author rice
 * @version 1.0
 * @date 2020/5/3 16:28
 */
@Controller
@RequestMapping("/homework/")
public class HomeworkController {

    @Autowired
    HomeworkServiceImpl homeworkService;

    /**
     *
     * check out the all homework
     * @return modelAndView
     */
    @RequestMapping("display")
    public ModelAndView displayAllStudentHomework(){
        ModelAndView modelAndView = new ModelAndView("/lookHomeworkPage.jsp");
        modelAndView.addObject("homeworkList",homeworkService.selectAll());
        return modelAndView;
    }


    @RequestMapping(value = "add")
    public ModelAndView addHomework(@RequestParam("id") Long hmId,
                                    @RequestParam("title") String hmTitle,
                                    @RequestParam("content") String hmContent){
        Homework hm = new Homework();
        hm.setId(hmId);
        hm.setContent(hmContent);
        hm.setTitle(hmTitle);
        ModelAndView mav = new ModelAndView("/success.jsp");
        if (homeworkService.addHomework(hm)) {
            return mav;
        } else {
            mav.setViewName("/fail.jsp");
            return mav;
        }

    }
}
