package com.yxun8.controller;

import org.aspectj.util.FileUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;

@Controller
public class UploadController {
    @RequestMapping("/uploadFile")
    public void uploadFile(@RequestParam("file") MultipartFile file, HttpServletRequest request){
        try {
            //获取工程路径
            String path = request.getSession().getServletContext().getRealPath("/upload");
            System.out.println(path);
            File fileName = new File(path);
            if (!fileName.exists()){
                fileName.mkdir();
            }
            String newName = path + "\\" + file.getOriginalFilename();
            fileName = new File(newName);
            //springmvc直接提供了上传的支持  transferTo
            file.transferTo(fileName);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
