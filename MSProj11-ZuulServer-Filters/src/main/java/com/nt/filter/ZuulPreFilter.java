package com.nt.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
@Component
public class ZuulPreFilter extends ZuulFilter {

	Logger logger = LoggerFactory.getLogger(ZuulPreFilter.class);
	
	@Override
	public boolean shouldFilter() {
		return true;              //enables this filter
 	}

	@Override
	public Object run() throws ZuulException {
		//get RequestContext obj
		RequestContext context = RequestContext.getCurrentContext();
		//get HttpServletRequest object from this
		HttpServletRequest request = context.getRequest();
		System.out.println("ZuulPreFilter.run():: pre-filter");
		//write log msg about current request
		logger.info("========From PRE Filter=============");
		logger.info("request content type ::" +request.getContentType());
		logger.info("request mode::" +request.getMethod());
		logger.info("request path ::" +request.getServletPath());
		logger.info("request Uri ::" +request.getRequestURI());
		return null;
	}

	@Override
	public String filterType() {
	 	return FilterConstants.PRE_TYPE; //make the filter as pre filter
	}

	@Override
	public int filterOrder() {
		
		return 0;  //high priority
	}

}
