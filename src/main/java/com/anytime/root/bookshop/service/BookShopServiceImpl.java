package com.anytime.root.bookshop.service;



import java.io.ObjectInputFilter.Status;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.anytime.root.bookshop.StatusMeans;
import com.anytime.root.bookshop.StatusMeans.handwrite;
import com.anytime.root.bookshop.StatusMeans.underline;
import com.anytime.root.bookshop.dao.BookShopDAO;
import com.anytime.root.bookshop.dto.BookShopDTO;


@Service
public class BookShopServiceImpl implements BookShopService{
	private String requestUrl = "https://dapi.kakao.com/v3/search/book"
			+ "?sort=accuracy&page=1&size=10&query="; // 쿼리문 다음에 검색 문 String 넣으면 됨

	private String RestAPIKey = "a924c282a86092b8472e6c2885aafe4a";
	
	@Autowired
	StatusMeans statusM;
	
	@Autowired
	BookShopDAO mapper;
	
	
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
	
	@Override
	public int SaveBookShop(Map<String, Object>map,HttpSession session) {
		BookShopDTO dto = new BookShopDTO();
		
		String getIdSession = (String)session.getAttribute("userId");
		String getSchoolSession =(String)session.getAttribute("userSchool");
		
		dto.setBooktitle((String)map.get("booktitle"));
		dto.setBookisbn((String)map.get("bookisbn"));
		dto.setWriter(getIdSession);
		dto.setSchool(getSchoolSession);
		dto.setUnderline((String)map.get("underline"));
		dto.setHandwrite((String)map.get("handwrite"));
		dto.setCover((String)map.get("cover"));
		dto.setNameWrite((String)map.get("nameWrite"));
		dto.setPage((String)map.get("page"));
		dto.setMeansOftransaction((String)map.get("meansOftransaction"));
		dto.setPrice(Integer.parseInt((String)map.get("price")) );
		dto.setPhoto((String)map.get("photo"));
		
		
		mapper.SaveBookShop(dto);
		return 1;
	}

	@Override
	public BookShopDTO SelectBook(String isbn) {
		BookShopDTO dto = new BookShopDTO();
		
		// 여기서 사진만 가져오자(올바르게 담긴 값)
		dto = mapper.selectBook("8967440146 9788967440145");
		
		// split으로 data순? 으로 잘라넣어서 미리보기 해야함 (최대 다섯개)
		
		
		return dto;
	}
	
	
	
}
