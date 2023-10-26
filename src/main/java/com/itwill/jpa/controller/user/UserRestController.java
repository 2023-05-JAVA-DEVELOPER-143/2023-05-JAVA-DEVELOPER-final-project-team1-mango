//package com.itwill.jpa.controller.user;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.itwill.jpa.entity.user.User;
//import com.itwill.jpa.service.user.UserService;
//
//import io.swagger.v3.oas.annotations.parameters.RequestBody;
//import jakarta.servlet.http.HttpSession;
//
//@RestController
//@RequestMapping("/users")
//public class UserRestController {
//
//	/*
//	 * @Autowired private UserService userService;
//	 * 
//	 * // 사용자 생성
//	 * 
//	 * @PostMapping public ResponseEntity<?> createUser(@RequestBody User user) {
//	 * try { User createdUser = userService.createUser(user); return
//	 * ResponseEntity.status(HttpStatus.CREATED).body(createdUser); } catch
//	 * (Exception e) { return
//	 * ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage()); } }
//	 * 
//	 * // 사용자 로그인
//	 * 
//	 * @PostMapping("/login") public ResponseEntity<?> loginUser(@RequestBody User
//	 * user, HttpSession session) { try { userService.loginUser(user.getUserId(),
//	 * user.getUserPw()); session.setAttribute("sUserId", user.getUserId()); return
//	 * ResponseEntity.status(HttpStatus.OK).build(); } catch (Exception e) { return
//	 * ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage()); } }
//	 * 
//	 * // 사용자 정보 조회
//	 * 
//	 * @GetMapping("/{userId}") public ResponseEntity<?> getUser(@PathVariable
//	 * String userId, HttpSession session) throws Exception { // 로그인 체크를 여기서 수행하거나,
//	 * Spring Security를 사용할 수 있습니다. String sUserId = (String)
//	 * session.getAttribute("sUserId"); if (sUserId == null ||
//	 * !sUserId.equals(userId)) { return
//	 * ResponseEntity.status(HttpStatus.UNAUTHORIZED).build(); }
//	 * 
//	 * User user = userService.findUser(userId); if (user == null) { return
//	 * ResponseEntity.status(HttpStatus.NOT_FOUND).build(); } return
//	 * ResponseEntity.status(HttpStatus.OK).body(user); }
//	 * 
//	 * // 사용자 정보 수정
//	 * 
//	 * @PutMapping("/{userId}") public ResponseEntity<?> updateUser(@PathVariable
//	 * String userId, @RequestBody User user, HttpSession session) { // 로그인 체크를 여기서
//	 * 수행하거나, Spring Security를 사용할 수 있습니다. String sUserId = (String)
//	 * session.getAttribute("sUserId"); if (sUserId == null ||
//	 * !sUserId.equals(userId)) { return
//	 * ResponseEntity.status(HttpStatus.UNAUTHORIZED).build(); }
//	 * 
//	 * try { userService.updateUser(user); return
//	 * ResponseEntity.status(HttpStatus.NO_CONTENT).build(); } catch (Exception e) {
//	 * return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage()); }
//	 * }
//	 * 
//	 * // 사용자 삭제
//	 * 
//	 * @DeleteMapping("/{userId}") public ResponseEntity<?> deleteUser(@PathVariable
//	 * String userId, HttpSession session) { // 로그인 체크를 여기서 수행하거나, Spring Security를
//	 * 사용할 수 있습니다. String sUserId = (String) session.getAttribute("sUserId"); if
//	 * (sUserId == null || !sUserId.equals(userId)) { return
//	 * ResponseEntity.status(HttpStatus.UNAUTHORIZED).build(); }
//	 * 
//	 * try { userService.deleteUser(userId); session.invalidate(); return
//	 * ResponseEntity.status(HttpStatus.NO_CONTENT).build(); } catch (Exception e) {
//	 * return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage()); }
//	 * }
//	 * 
//	 * // 로그아웃
//	 * 
//	 * @GetMapping("/logout") public ResponseEntity<?> logout(HttpSession session) {
//	 * session.invalidate(); return ResponseEntity.status(HttpStatus.OK).build(); }
//	 */
// 
//
//}
//	
//	
//	
//	
//	
//	
//
