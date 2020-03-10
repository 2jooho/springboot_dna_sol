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
    <title>게시글 작성</title>
</head>
<body>
<h3>게시글 작성</h3>
<div style="padding : 30px;">
    <form method="POST" action="./add">
        <div class="form-group">
            <label>주문 번호</label>
            <input type="text" name="order_id" class="form-control">
        </div>

        <div class="form-group">
            <label>수량</label>
            <input type="text" name="amount" class="form-control">
        </div>
        <div class="form-group">
            <label>단가 가격</label>
            <input type="text" name="unit_price" class="form-control">
        </div>
        <div class="form-group">
            <label>KRW</label>
            <input type="text" name="currency" class="form-control">
        </div>
        <div class="form-group">
            <label>고객 이름</label>
            <input type="text" name="name" class="form-control">
        </div>
        <div class="form-group">
            <label>고객 전화번호</label>
            <input type="text" name="phone" class="form-control">
        </div>
        <div class="form-group">
            <label>고객 이메일</label>
            <input type="text" name="email" class="form-control">
        </div>
        <div class="form-group">
            <label>배송 기본 주소</label>
            <input type="text" name="address_1" class="form-control">
        </div>
        <div class="form-group">
            <label>배송 상세 주소</label>
            <input type="text" name="address_2" class="form-control">
        </div>
        <div class="form-group">
            <label>배송 우편번호</label>
            <input type="text" name="post" class="form-control">
        </div>
        <button type="submit" class="request">전송</button>
    </form>
</div>
</body>
</html>
