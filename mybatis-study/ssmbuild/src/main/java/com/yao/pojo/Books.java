package com.yao.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books  {

    private Integer bookID;

    private String bookName;

    private Integer bookCounts;

    private String detail;

}