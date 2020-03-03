<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content= "text/html; charset=UTF-8">
    <!-- BootStrap CDN -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
    <title>게시글 목록</title>
</head>
<body>
<h3>게시글 목록</h3>
<button class="btn btn-primary" style="float : right;" onclick="location.href='./add'">작성</button>
<table class="table">
    <tr>
        <th>주문 번호</th>
        <th>주문 날짜</th>
        <th>수량</th>
        <th>단가 가격</th>
        <th>KRW</th>
        <th>고객 이름</th>
        <th>고객 전화번호</th>
        <th>고객 이메일</th>
        <th>배송 기본 주소</th>
        <th>배송 상세 주소</th>
        <th>배송 우편번호</th>
    </tr>
    <c:forEach var="data" items="${list}">
        <tr>
            <td>${data.order_id}</td>
            <td>${data.order_date}</td>
            <td>${data.amount}</td>
            <td>${data.unit_price}</td>
            <td>${data.currency}</td>
            <td>${data.name}</td>
            <td>${data.phone}</td>
            <td>${data.email}</td>
            <td>${data.address_1}</td>
            <td>${data.address_2}</td>
            <td>${data.post}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>


