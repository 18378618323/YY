package com.yao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class FileUploadContorller {
    @RequestMapping("/fileUpload")
    public String fileUpload(MultipartFile pictrueFile) throws IOException {
        String originalFilename = pictrueFile.getOriginalFilename();
        System.out.println(originalFilename);

        //上传的文件名+后缀
        String newFileName = UUID.randomUUID().toString()+ originalFilename.substring(originalFilename.lastIndexOf("."));


        pictrueFile.transferTo(new File("D:\\Program Files (x86)\\Tencent\\springBoot\\spring\\SpringMVC\\web\\iamges\\" + newFileName));




        return "redirect:/allBook";
    }
}
