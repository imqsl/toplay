package com.imqsl.interceptor;

import com.imqsl.domain.Manager;
import com.imqsl.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.imqsl.util.common.ToPlayConstants.MANAGER_SESSION;

/**
 * Created by imqsl on 2017-10-19.
 */
public class AuthorizedInterceptor implements HandlerInterceptor{

    private static final String[] IGNORE_URI={"/loginForm","/login","/404.html"};
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag=false;
        String servletPath=request.getServletPath();
        for (String s:IGNORE_URI) {
            if (servletPath.contains(s)){
                flag=true;
                break;
            }
        }

        if (!flag){
            Manager manager= (Manager) request.getSession().getAttribute(MANAGER_SESSION);
            if (manager==null){
                request.setAttribute("message","请先登录再访问网站！");
                request.getRequestDispatcher("/loginForm").forward(request,response);

                return flag;
            }else {
                flag=true;
            }
        }

        return flag;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
