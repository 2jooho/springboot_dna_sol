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
    <title>PDF 다운로드 목록</title>
</head>
<body>
<h3>다운로드 목록</h3>

<table class="table">
    <tr>
        <th>주문 번호</th>
        <th>키트 바코드 번호</th>
        <th>edgc버전 pdf url</th>
        <th>medipresso버전 pdf url</th>
        <th>고객용 pdf url</th>

    </tr>
    <c:forEach var="data" items="${list}">

        <tr>
            <td>${data.order_id}  </td>
            <td>${data.barcode}</td>
            <td>${data.download_url}<button class="btn btn-primary0" style="float : right;" onclick="location.href='./download'">다운로드</button></td>
            <td>${data.medipresso_url}<button class="btn btn-primary1" style="float : right;" onclick="location.href='./download'">다운로드</button></td>
            <td>${data.total_url}<button class="btn btn-primary2" style="float : right;" onclick="location.href='./download'">다운로드</button></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>


