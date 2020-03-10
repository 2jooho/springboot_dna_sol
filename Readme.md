<img src="./readme_img/스프링부트.png" width="300px" height="300px" alt="사용툴"></img><br/>
# REST API 서버구축

스프링부트를 이용하여 유전자검사 업체와 데이터를 주고 받습니다. 정해진 json포맷으로 요청 및 반환 받습니다. 
유전자 업체로부터 반환 받은 데이터는 DB에 저장이되고 유전자 KIT배송 요청은 별도의 페이지를 만들어 입력 후 요청합니다.
***
# REST API JSON포맷
Method : post   
content type : application/json
* [ JSON 포맷 형식 파일](https://github.com/2jooho/springboot_dna_sol/blob/master/API%20Doc_20180927.docx "DOC")
***
# 의뢰 등록 페이지(URL)
1. [ kit 배송 요청] 
<img src="./readme_img/add.png" width="400px" height="300px" alt="add">
2. [ kit 배송 요청 리스트] 
<img src="./readme_img/list.png" width="500px" height="300px" alt="list">
3. [ 단일 pdf 업로드해서 url 생성] 
<img src="./readme_img/upload.png" width="300px" height="300px" alt="upload">
4. [ 업로드된 PDF 다운로드 URL ]  
    
~/downloadFile/(업로드한 파일 이름   

***   
# DB에 저장된 데이터
1. [ kit 관련 정보] 
<img src="./readme_img/db_user.png" width="300px" height="150px" alt="db_user">
2. [ gene 관련 정보] 
<img src="./readme_img/db_gene.png" width="450px" height="350px" alt="db_gene">
3. [ disease 관련 정보] 
<img src="./readme_img/db_disease.png" width="450px" height="300px" alt="db_disease">

