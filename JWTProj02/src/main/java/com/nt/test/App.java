package com.nt.test;

import com.nt.utility.JWTUtils;

import io.jsonwebtoken.Claims;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		//String token = JWTUtils.generateToken("654242AA", "RAJA", "RANI");
		String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2NTQyNDJBQSIsInN1YiI6IlJBSkEiLCJpc3MiOiJOSVQiLCJpYXQiOjE2NzI4NDQyMDYsImV4cCI6MTY3Mjg0NDI2Nn0.egw2S-_ivoY9Tf1IfGwlW9hCtL-8UtuX_qoacvxGDl8";
		System.out.println(token);

		System.out.println("============================");
		Claims claim =  JWTUtils.getClaim("RANI", token);


		System.out.println("subject/username::" +claim.getSubject());
        	System.out.println("Client ID :: " +claim.getId());
		System.out.println("Issure Name::" +claim.getIssuer());
		System.out.println("Issure Date /time::" +claim.getIssuedAt());
		System.out.println("Issure Date /time expire::" +claim.getExpiration());
		
		System.out.println("============================");

	}
}
