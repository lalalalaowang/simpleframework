package com.laowang.service.combine;

import com.laowang.entity.dto.MainPageInfoDTO;
import com.laowang.entity.dto.Result;

public interface HeadLineShopCategoryService {
    Result<MainPageInfoDTO> getMainPageInfo();
}
