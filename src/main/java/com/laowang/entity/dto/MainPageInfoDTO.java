package com.laowang.entity.dto;

import com.laowang.entity.bo.HeadLine;
import com.laowang.entity.bo.ShopCategory;
import lombok.Data;

import java.util.List;

@Data
public class MainPageInfoDTO {
    private List<HeadLine> headLineList;
    private List<ShopCategory> shopCategoryList;
}
