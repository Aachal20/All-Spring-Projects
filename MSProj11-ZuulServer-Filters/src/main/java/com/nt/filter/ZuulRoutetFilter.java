package com.nt.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
@Component
public class ZuulRoutetFilter extends ZuulFilter {

	Logger logger = LoggerFactory.getLogger(ZuulRoutetFilter.class);
	
	@Override
	public boolean shouldFilter() {
		return true;              //enables this filter
 	}

	@Override
	public Object run() throws ZuulException {
		//get RequestContext obj
		RequestContext context = RequestContext.getCurrentContext();
		//get HttpServletResponse  object from this
		
		System.out.println("ZuulPreFilter.run():: ROUTE-filter");
		//write log msg about current request
		logger.info("========From ROUTE Filter=============");
		logger.info("request content type ::" +context.getRouteHost());
		
		return null;
	}

	@Override
	public String filterType() {
	 	return FilterConstants.ROUTE_TYPE; //make the filter as Route filter
	}

	@Override
	public int filterOrder() {
		
		return 0;  //high priority
	}

}
