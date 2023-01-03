package com.nt.test;

import com.nt.utility.JWTUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String token = JWTUtils.generateToken("654242AA", "RAJA", "RANI");
        System.out.println(token);
    }
}
