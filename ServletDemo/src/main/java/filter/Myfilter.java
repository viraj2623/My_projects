package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")  // 
public class Myfilter implements Filter {

    public void init(FilterConfig fConfig) throws ServletException {
        System.out.println("Filter initialized");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("Request intercepted by Filter");

        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/hello");
        dispatcher.include(request, response);

        System.out.println("This line won't execute after forward()!"); 

        
    }

    public void destroy() {
        System.out.println("Filter destroyed");
    }
}
