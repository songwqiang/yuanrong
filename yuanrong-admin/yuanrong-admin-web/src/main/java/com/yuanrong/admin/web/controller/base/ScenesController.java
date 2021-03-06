package com.yuanrong.admin.web.controller.base;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yuanrong.admin.bean.base.Scenes;
import com.yuanrong.admin.util.CollectionUtil;
import com.yuanrong.admin.web.controller.BaseController;
import com.yuanrong.common.util.ResultTemplate;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 使用场景的controller
 * Created MDA
 */
@Controller
@RequestMapping("scenes")
public class ScenesController extends BaseController {
    private static final Logger logger = Logger.getLogger(ScenesController.class);

    /**
     * 使用场景
     * @return
     */
    @RequestMapping( value = "exs_scenesList")
    @ResponseBody
    public ResultTemplate list(){
        List<Scenes> scenesList = scenesServicesI.list();
        JSONArray result = new JSONArray();
        if(CollectionUtil.size(scenesList) >0){
            result.addAll(Scenes.packageScenes(scenesList));
        }else{
            return new ResultTemplate("数据不存在!" , null);

        }
        return new ResultTemplate("", result);
    }

}
