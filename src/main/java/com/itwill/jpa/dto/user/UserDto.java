package com.itwill.jpa.dto.user;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
	
	private String userId;			// 회원 아이디
	private String userPw;			// 회원 비밀번호
	private String userName;		// 회원 이름
	private String userAddress;		// 회원 주소
	private String userEmail;		// 회원 이메일
	private String userJumin;		// 회원 주민번호
	private String userPhone;		// 회원 전화번호
	private String userGender;		// 회원 성별
	
}






