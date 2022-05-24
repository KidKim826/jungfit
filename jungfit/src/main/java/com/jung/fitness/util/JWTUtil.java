package com.jung.fitness.util;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTUtil {
private static final String SALT = "JUNGFIT";
	
	public String createToken(String claimId, String data) throws UnsupportedEncodingException {
		
		//토큰생성시
		//header정보를 입력
		//payload 입력한다.
		//서명하고 compact를 사용해서 문자열로 만들어 준다.
		return Jwts.builder()
				//header에는 기본적으로 두가지 정보 들어가. alg(알고리즘정보) + typ(어떤 타입)
				.setHeaderParam("alg", "HS256")
				.setHeaderParam("typ", "JWT")
				.claim(claimId, data)
				//내가 유효성 시간을 좀 두고싶다 그럼 하단 작성
				//.setExpiration(new Date(System.currentTimeMillis()+3000)) (유효시간 등록 가능)
				.signWith(SignatureAlgorithm.HS256, SALT.getBytes("UTF-8"))
				.compact();
			
	}
	
	public void checkToken(String token) throws Exception {
		Jwts.parser().setSigningKey(SALT.getBytes("UTF-8")).parseClaimsJws(token);
	}
}
