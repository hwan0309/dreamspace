<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="inc/header.jsp" %>
<%@ include file="inc/aside.jsp" %>
    <section>
            <!-- listbox -->
            <div class="listbox">
                <h1 class="text-center mb-5">게시판</h1>
                <div class="d-flex justify-content-between py-4">
                    <div>
                        <a href="#" class="btn btn-primary">최신글순</a>
                        <a href="#" class="btn btn-primary">인기글순</a>
                    </div>
                    <div>
                        <a href="#" class="btn btn-primary">목록</a>
                        <a href="write.html" class="btn btn-primary">글쓰기</a>                      
                    </div>
                </div>
                <table class="table table-hover">
                    <colgroup>
                       <col width="8%">
                       <col>
                       <col width="15%">
                       <col width="10%">
                       <col width="15%">
                    </colgroup>
                    <thead>
                        <tr>
                            <th>번호</th>
                            <th>제목</th>
                            <th>글쓴이</th>
                            <th>조회수</th>
                            <th>날짜</th>
                        </tr>
                    </thead>
                    <tbody>
                       <!-- loop --> 
                       <tr>
                           <td class="text-center">1</td>
                           <td><a href="contents.html">제목입니다. 이곳에 제목 제목입니다. 이곳에 제목
                            제목입니다. 이곳에 제목
                            제목입니다. 이곳에 제목
                            제목입니다. 이곳에 제목
                            제목입니다. 이곳에 제목 
                            제목입니다. 이곳에 제목
                            </a><span>(2)</span>
                               <i class="ri-file-image-fill"></i>
                               <i class="ri-file-hwp-fill"></i>
                               <i class="ri-file-music-fill"></i>
                            </td>
                            
                           <td class="text-center">홍길동</td>
                           <td class="text-center">12</td>
                           <td class="text-center">2024.02.26</td>
                       </tr>
                       <tr>
                        <td class="text-center">1</td>
                        <td><a href="#">제목입니다. 이곳에 제목</a></td>
                        <td class="text-center">홍길동</td>
                        <td class="text-center">12</td>
                        <td class="text-center">2024.02.26</td>
                       </tr>
                       <tr>
                        <td class="text-center">1</td>
                        <td><a href="#">제목입니다. 이곳에 제목</a></td>
                        <td class="text-center">홍길동</td>
                        <td class="text-center">12</td>
                        <td class="text-center">2024.02.26</td>
                       </tr>
                       <tr>
                        <td class="text-center">1</td>
                        <td><span class="re"></span><i class="ri-corner-down-right-line"></i><a href="#">제목입니다. 이곳에 제목</a></td>
                        <td class="text-center">홍길동</td>
                        <td class="text-center">12</td>
                        <td class="text-center">2024.02.26</td>
                       </tr>
                       <tr>
                        <td class="text-center">1</td>
                        <td><span class="re"></span><span class="re"></span><i class="ri-corner-down-right-line"></i><a href="#">제목입니다. 이곳에 제목</a></td>
                        <td class="text-center">홍길동</td>
                        <td class="text-center">12</td>
                        <td class="text-center">2024.02.26</td>
                       </tr>
                       <!-- /loop -->
                    </tbody>
                </table>
                <div class="d-flex justify-content-between py-4">
                    <div>
                        <a href="#" class="btn btn-primary">최신글순</a>
                        <a href="#" class="btn btn-primary">인기글순</a>
                    </div>
                    <ul class="paging">
                        <li>
                            <a href="#"><i class="ri-arrow-left-double-line"></i></a>
                        </li>
                        <li>
                            <a href="#"><i class="ri-arrow-left-s-line"></i></a>
                        </li>
                        <li><a href="#" class="active">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li>
                            <a href="#"><i class="ri-arrow-right-s-line"></i></a>
                        </li>
                        <li>
                            <a href="#"><i class="ri-arrow-right-double-line"></i></a>
                        </li>
                    </ul>
                    <div>
                        <a href="#" class="btn btn-primary">목록</a>
                        <a href="write.html" class="btn btn-primary">글쓰기</a>                      
                    </div>
               </div>
               <form name="searchform" id="searchform" class="searchform">
                   <div class="input-group my-3">
                        <div class="input-group-prepend">
                            <button type="button" 
                                    class="btn btn-outline-secondary dropdown-toggle" 
                                    data-toggle="dropdown"
                                    value="title">
                                제목검색
                              </button>
                              <div class="dropdown-menu">
                                <a class="dropdown-item" href="username">이름검색</a>
                                <a class="dropdown-item" href="title">제목검색</a>
                                <a class="dropdown-item" href="contents">내용검색</a>
                            </div>
                        </div>
                       <input type="search" class="form-control" placeholder="검색">
                       <div class="input-group-append">
                          <button class="btn btn-primary"><i class="ri-search-line"></i></button>
                       </div>
                   </div>
               </form>
            </div>
            <!-- /listbox-->
         </section>
    <%@ include file="inc/footer.jsp" %>     