package com.fatal.service;

import com.fatal.dto.ShopCartDTO;

import java.util.List;

/**
 * 购物车服务
 * @author Fatal
 * @date 2019/8/14 0014 23:20
 */
public interface IShopCartService {

    /**
     * 改变指定 sku 的 count
     * @param userId 用户ID
     * @param skuId skuID
     * @param finalValue count 的最终值
     */
    void put(Long userId, Long skuId, Long finalValue);

    /**
     * 购物车列表分页
     * @param userId 用户ID
     * @param currentPage
     * @return
     */
    List<ShopCartDTO> shopCarts(Long userId, Integer currentPage);

    /**
     * 购物车列表
     * @param userId 用户ID
     * @param skuIds
     * @return
     */
    List<ShopCartDTO> shopCarts(Long userId, List<Long> skuIds);

    /**
     * 移除购物车指定sku
     * @param userId 用户ID
     * @param skuIds skuID数组（该参数必须是可变参数或者数组，后面需要转为 byte[][] 类型，如果
     *                 这里用集合的话，后面序列化的 byte[][] 结果是错的）
     */
    void remove(Long userId, Long... skuIds);

    /**
     * 清空购物车
     * @param userId 用户ID
     */
    void clear(Long userId);

    /**
     * 进入购物车
     * @param userId 用户ID
     * @return 购物车 TotalPage
     */
    Integer into(Long userId);

    /**
     * 获得当前页的skuIds
     * @param userId 用户ID
     * @param currentPage 当前页码
     * @return
     */
    List<Long> currentPageSkuIds(Long userId, Integer currentPage);

    /**
     * 获得分组摊平后的购物车
     * @param userId 用户ID
     * @return
     */
    List<Long> shopCartGrouping(Long userId);

}
