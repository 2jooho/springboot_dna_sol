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
    <title>메디프레소 PDF생성</title>
    <script src="'http://code.jquery.com/jquery-3.3.1.min.js"></script>




</head>
<body>
<h3>정보 입력</h3>
<div style="padding : 30px;">

    <form id="frm" name="frm" enctype="multipart/form-data" method="POST" >

      <input  multiple="multiple" type="file" name="file">

        <br/><br/>
        <button type="submit" class="send" id="send">버튼</button>
        <a href="/pdf/create" class="btn" id="write">생성 페이지로</a>
        <a href="/pdf/url" class="btn" id="list">url 목록으로</a>
    </form>


</div>




</body>
</html>
