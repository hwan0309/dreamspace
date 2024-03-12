<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

        <!-- ASIDE -->
         <aside class="mt-3 p-4 bg-white">
            <form name="loginForm" class="loginform" id="loginform" method="post">
               <input type="text" class="form-control userid mb-4" id="userid"
                      placeholder="아이디" name="userid" />
               <input type="password" class="form-control userpass mb-3" id="userpass"
                      placeholder="비밀번호" name="userpass" />      
               <div class="text-right mb-3">
                 <label> 아이디 기억 <input type="checkbox" name="rid" value="rid" id="rid"></label>
               </div>         
               <button type="submit" class="btn btn-primary btn-block">로그인</button>                     
               <a href="join.html">회원가입</a>
            </form>    
         </aside>
         <!--/ ASIDE-->
