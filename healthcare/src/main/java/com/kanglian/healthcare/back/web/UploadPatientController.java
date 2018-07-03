package com.kanglian.healthcare.back.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;
import com.easyway.business.framework.json.JsonClothProcessor;
import com.easyway.business.framework.mybatis.annotion.SingleValue;
import com.easyway.business.framework.pojo.Grid;
import com.easyway.business.framework.springmvc.controller.CrudController;
import com.easyway.business.framework.springmvc.result.ResultBody;
import com.kanglian.healthcare.authorization.annotation.Authorization;
import com.kanglian.healthcare.back.dal.pojo.UploadPatient;
import com.kanglian.healthcare.back.dal.pojo.User;
import com.kanglian.healthcare.back.dal.pojo.UserInfo;
import com.kanglian.healthcare.back.service.UploadPatientBo;
import com.kanglian.healthcare.back.service.UserInfoBo;

/**
 * 上传病历
 * 
 * @author xl.liu
 */
@Authorization
@RestController
public class UploadPatientController extends CrudController<UploadPatient, UploadPatientBo> {

    @Autowired
    private UserInfoBo userInfoBo;
    
    /**
     * 用户上传病历列表
     * 
     * @param query
     * @return
     * @throws Exception
     */
    @GetMapping("/patient/upload/list")
    public ResultBody list(final ContentQuery query) throws Exception {
        return super.list(query, new JsonClothProcessor() {

            @Override
            public JSONObject wearCloth(Object pojo, JSONObject jsonObject) {
                UploadPatient uploadContent = (UploadPatient)pojo;
                try {
                    User user = new User();
                    user.setUserId(Long.valueOf(uploadContent.getUserId()));
                    UserInfo userInfo = userInfoBo.getUserInfo(user);
                    jsonObject.put("userInfo", userInfoBo.reformUserInfo(userInfo));
                } catch (Exception e) {
                    // TODO: handle exception
                }
                return jsonObject;
            }
            
        });
    }
    
    public static class ContentQuery extends Grid {
        private String userId;
        private String doctorUserId;

        @SingleValue(column = "user_id", equal = "=")
        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }
        
        @SingleValue(column = "receive_user_id", equal = "=")
        public String getDoctorUserId() {
            return doctorUserId;
        }
        
        public void setDoctorUserId(String doctorUserId) {
            this.doctorUserId = doctorUserId;
        }
    }
}