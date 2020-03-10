/*
package com.test.test.selvice;


import com.test.test.Pdfboard.FileVO;
import com.test.test.domain.test;
import com.test.test.mapper.boardMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;


@Service("com.test.test.selvice.CommentService")
public class CommentService {

    @Resource(name = "com.test.test.mapper.boardMapper")
    boardMapper mCommentMapper;


    public test idcheck(String order_id) throws Exception {
        return mCommentMapper.idcheck(order_id);
    }

    public void insertBoard(HttpServletRequest request) throws Exception {

        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
        Iterator<String> iterator = multipartHttpServletRequest.getFileNames();
        MultipartFile multipartFile = null;
        while (iterator.hasNext()) {
            multipartFile = multipartHttpServletRequest.getFile(iterator.next());

        }

    }
}*/
