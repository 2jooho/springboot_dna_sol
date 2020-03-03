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

    <form method="POST" role="form" autocomplete="off" id="check" >
        <div class="form-group">
            <label>주문 번호</label>
            <input type="text" name="order_id" class="form-control" id="order_id">
        </div>
        <div class="form-group">
            <label>키트 바코드 번호</label>
            <input type="text" name="barcode" class="form-control"id="barcode">
</div>
        <p class="result">
            <span class="msg">주문 번호와 바코드를 입력해주세요.</span>
        </p>
        <p>
        <button type="submit" class="idCheck">생   성</button>
        </p>
    </form>
</div>


    <script>
    $(".idCheck").click(function(){

        var query = {order_id : $("#order_id").val()};

        $.ajax({
            url : "./checkid",
            type : "post",
            data : query,

            success : function(args) {

                if(args == 1) {
                    location.href = "./pdf/url";
                    alert("sscode:");
                } else {
                    alert("code:");

                    $(".result .msg").text("다시 확인해주세요");
                    $(".result .msg").attr("style", "color:#f00");
                }
            }
        });  // ajax 끝
    });
</script>


</body>
</html>
