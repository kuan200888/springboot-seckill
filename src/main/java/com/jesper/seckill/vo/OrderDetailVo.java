package com.jesper.seckill.vo;

import com.jesper.seckill.bean.OrderInfo;
import lombok.Data;

/**
 * Created by jiangyunxiong on 2018/5/28.
 */
@Data
public class OrderDetailVo {

    private GoodsVo goods;
    private OrderInfo order;
}
