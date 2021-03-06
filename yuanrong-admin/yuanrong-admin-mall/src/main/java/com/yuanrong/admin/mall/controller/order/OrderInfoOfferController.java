package com.yuanrong.admin.mall.controller.order;
import com.github.pagehelper.PageInfo;
import com.yuanrong.admin.bean.order.OrderInfoOffer;
import com.yuanrong.admin.mall.controller.BaseController;
import com.yuanrong.admin.util.BaseModel;
import com.yuanrong.common.util.StringUtil;
import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
/**
 * 卖家订单报价的controller
 * Created MDA
 */
@Controller
@RequestMapping("order")
public class OrderInfoOfferController extends BaseController {
    private static final Logger logger = Logger.getLogger(OrderInfoOfferController.class);
}
