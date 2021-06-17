package com.anytime.root.bookshop.service;



import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class BookShopServiceImpl implements BookShopService{
	private String requestUrl = "https://dapi.kakao.com/v3/search/book"
			+ "?sort=accuracy&page=1&size=10&query="; // 쿼리문 다음에 검색 문 String 넣으면 됨

	private String RestAPIKey = "a924c282a86092b8472e6c2885aafe4a";
	
	@Override
	public ResponseEntity<String> responseBookSearch(String searchCode) {
		RestTemplate rt = new RestTemplate();
		
		// 헤더값
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "KakaoAK "+RestAPIKey);
		
		HttpEntity<MultiValueMap<String, String>> BookResquestEntity = new HttpEntity<>(headers);
		
		
		// 헤더의 Authorization 값 을 넣어서 하나에 담은후에 아래 줄과 같이  요청한다
		ResponseEntity<String> response = rt.exchange(requestUrl+searchCode, HttpMethod.GET, BookResquestEntity, String.class);
		
		
		
		return response;
	}
	
	
	
}
