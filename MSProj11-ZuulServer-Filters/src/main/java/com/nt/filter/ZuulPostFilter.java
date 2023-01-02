package com.nt.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
@Component
public class ZuulPostFilter extends ZuulFilter {

	Logger logger = LoggerFactory.getLogger(ZuulPostFilter.class);
	
	@Override
	public boolean shouldFilter() {
		return true;              //enables this filter
 	}

	@Override
	public Object run() throws ZuulException {
		//get RequestContext obj
		RequestContext context = RequestContext.getCurrentContext();
		//get HttpServletResponse  object from this
		HttpServletResponse response = context.getResponse();
		System.out.println("ZuulPreFilter.run():: POST-filter");
		//write log msg about current request
		logger.info("========From POST Filter=============");
		logger.info("request content type ::" +response.getContentType());
		logger.info("request path ::" +response.getStatus());
		logger.info("request Uri ::" +response.getHeader("host"));
		return null;
	}

	@Override
	public String filterType() {
	 	return FilterConstants.PRE_TYPE; //make the filterr as post filter
	}

	@Override
	public int filterOrder() {
		
		return 0;  //high priority
	}

}
