package com.yao.HandlerExecptionResolver;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义全局异常类
 */
public class MyHandlerExecptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        // 错误消息
        String msg = "出bug了，请联系管理员处理";

        if(e instanceof MyExecption){
            msg = ((MyExecption) e).getMsg();
        }

        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", msg);
        mv.setViewName("error");
        return mv;
    }
}
