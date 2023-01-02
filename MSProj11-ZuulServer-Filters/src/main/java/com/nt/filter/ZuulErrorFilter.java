package com.nt.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
@Component
public class ZuulErrorFilter extends ZuulFilter {

	Logger logger = LoggerFactory.getLogger(ZuulErrorFilter.class);

	@Override
	public boolean shouldFilter() {
		return true;              //enables this filter
	}

	@Override
	public Object run() throws ZuulException {
		//get RequestContext obj
		RequestContext context = RequestContext.getCurrentContext();
		//get throwable  object 
		Throwable throwa = context.getThrowable();
		System.out.println("ZuulPreFilter.run():: Error-filter");
		//write log msg about current request
		logger.info("========From ERROR Filter=============");
		logger.info("Exception Message ::" +throwa.getMessage()+ " class name"+throwa);

		return null;
	}

	@Override
	public String filterType() {
		return FilterConstants.ERROR_TYPE; //make the filter as Error filter
	}

	@Override
	public int filterOrder() {

		return 0;  //high priority
	}

}
