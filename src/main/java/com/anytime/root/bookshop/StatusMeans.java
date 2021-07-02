package com.anytime.root.bookshop;
// Enum에 관련된 클래스, 책상태, 거래수단
// (밑줄 흔적(없음,연필/샤프,볼펜/형광펜),
// 필기 흔적 (없음, 연필/샤프 , 볼펜/형광펜),
// 겉표지 (겉표지 , 깨끗하지 않음),
// 이름 기입 (없음, 있음),
// 페이지 반색 (없음, 있음),
// 페이지 훼손 (없음, 있음),)
//거래수단( 택배, 직거래, 원하는 장소 )

import org.springframework.stereotype.Component;

@Component
public class StatusMeans {
	public enum underline{
		non, sharpPencil, highliterBolpen ,all
		// 없음, 샤프볼펜, 형광펜, 전부다
	}
	
	public enum handwrite{
		non, sharpPencil, highliterBolpen, all
		// 없음, 샤프볼펜, 형광펜, 전부다
	}
	
	public enum cover{
		clean , dirty
		// 깨끗함, 더러움
	}
	
	public enum nameWrite{
		non , wrote
		// 없음, 이름썼다
	}
	
	public enum Page{
		non , blank , damage , all
		// blank 반색, damage 회손
	}
	
	
	public enum meansOftransaction{
		parcelService , directTransaction , all
		// 택배 , 직거래
	}
	
	
	
}
