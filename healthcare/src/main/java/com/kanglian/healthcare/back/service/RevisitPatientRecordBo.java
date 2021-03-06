package com.kanglian.healthcare.back.service;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import com.easyway.business.framework.mybatis.query.ConditionQuery;
import com.kanglian.healthcare.back.dao.RevisitPatientRecordDao;
import com.kanglian.healthcare.back.pojo.PatientRecord;
import com.kanglian.healthcare.common.NewCrudBo;
import com.kanglian.healthcare.exception.DBException;

/**
 * 复诊
 * 
 * @author xl.liu
 */
@Service
public class RevisitPatientRecordBo extends NewCrudBo<PatientRecord, RevisitPatientRecordDao> {
    /**
     * 复诊患者诊断列表
     * 
     * @return
     */
    public List<Map<String, String>> findDiagList(ConditionQuery query) {
        try {
            return this.dao.findDiagList(query);
        } catch (Exception ex) {
            throw new DBException(ex);
        }
    }
}
