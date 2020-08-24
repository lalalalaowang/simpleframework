package com.laowang.service.combine.impl;

import com.laowang.entity.bo.HeadLine;
import com.laowang.entity.bo.ShopCategory;
import com.laowang.entity.dto.MainPageInfoDTO;
import com.laowang.entity.dto.Result;
import com.laowang.service.combine.HeadLineShopCategoryService;
import com.laowang.service.solo.HeadLineService;
import com.laowang.service.solo.ShopCategoryService;

import java.util.List;

public class HeadLineShopCategoryServiceImpl implements HeadLineShopCategoryService {
    private HeadLineService headLineService;
    private ShopCategoryService shopCategoryService;

    @Override
    public Result<MainPageInfoDTO> getMainPageInfo() {
        HeadLine headLineCondition = new HeadLine();
        headLineCondition.setEnableStatus(1);
        Result<List<HeadLine>> headLineResult = headLineService.queryHeadLine(headLineCondition, 1, 4);

        ShopCategory shopCategoryCondition = new ShopCategory();
        Result<List<ShopCategory>> shopCategoryResult = shopCategoryService.queryShopCategory(shopCategoryCondition, 1,
                4);

        Result<MainPageInfoDTO> result = mergeMainPageInfoResult(headLineResult, shopCategoryResult);
        return result;
    }

    private Result<MainPageInfoDTO> mergeMainPageInfoResult(
            Result<List<HeadLine>> headLineResult,
            Result<List<ShopCategory>> shopCategoryResult) {
        return null;
    }
}
