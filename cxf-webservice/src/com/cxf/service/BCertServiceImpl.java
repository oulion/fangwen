package com.cxf.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 
 * 访问服务器webservice接口实现类
 *
 */
@Component
@WebService(endpointInterface = "com.cxf.service.BCertService", serviceName = "bCertService") 
public class BCertServiceImpl implements BCertService {
	
	
	private final Logger log=LoggerFactory.getLogger(BCertServiceImpl.class);
	

	/**
	 * 2.1电子证照-身份证
	 */
	public String GetDetailBcertSfzInfo(String paras) {
		String result = "";
		BCertService_Service service = new BCertService_Service();
		BCertService1 bs = service.getBCertServiceImplPort();
		log.info("身份证-交换服务器提供给前置机的参数==="+paras);
		result = bs.getDetailBcertSfzInfo(paras);
		log.info("身份证-前置机返回参数====="+result);
		return result;
	}
	
	/**
	 * 2.2电子证照-户口本
	 * 根据身份证号获取户口本所有人信息
	 * @param paras 参数为json格式的字符串{"paras":{"IDNUMBER":"具体身份证号"}}
	 * （说明：返回身份证所在户口本上所有人的信息）
	 * @return
	 */
	@WebMethod
	public String GetDetailBcertHkbInfo(String paras){
		BCertService_Service service = new BCertService_Service();
		BCertService1 bs = service.getBCertServiceImplPort();
		log.info("户口本-交换服务器提供给前置机的参数==="+paras);
		String result = "";
		result = bs.getDetailBcertHkbInfo(paras);
		log.info("户口本-前置机返回参数====="+result);
		return result;
	}
	
	/**
	 * 2.3电子证照-60岁老年证
	 */
	public String GetDetailBcert60LNZInfo(String paras){
		String result="";
		return result;
	}
	
	/**
	 * 2.4电子证照-70岁老年证
	 */
	public String GetDetailBcert70LNZInfo(String paras){
		String result="";
		return result;
	}
	
	/**
	 * 2.5电子证照-二孩生育服务证
	 * 根据证照检索字段获取证照详细信息（只能查看发布字段）
	 * @param paras 参数为json格式的字符串{"paras":{"WOMAN_IDNUMBER":"女方身份证号","MAN_IDNUMBER":"男方身份证号"}}
	 * @return
	 */
	public String GetDetailBcertEHSYFWZInfo(String paras){
		String result = "";
		return result;
	}
	
	/**
	 * 2.6电子证照-流动人口婚育证明
	 * 根据证照检索字段获取证照详细信息（只能查看发布字段）
	 * @param paras 参数为json格式的字符串{"paras":{"IDNUMBER":"具体身份证号"}}
	 * @return
	 */
	public String GetDetailBcertLDRKHYZMInfo(String paras){
		String result = "";
		return result;
	}
	
	/**
	 * 2.7电子证照-一孩生育服务证
	 * 根据证照检索字段获取证照详细信息（只能查看发布字段）
	 * @param paras 参数为json格式的字符串{"paras":{"WOMAN_IDNUMBER":"女方身份证号","MAN_IDNUMBER":"男方身份证号"}}
	 * @return
	 */
	public String GetDetailBcertYHSYFWZInfo(String paras){
		String result = "";
		return result;
	}
	
	/**
	 * 2.8电子证照-工商营业执照
	 * 根据证照检索字段获取证照详细信息（只能查看发布字段）
	 * @param paras 参数为json格式的字符串{"paras":{"EnterpriseName":"企业名称"}}
	 * @return
	 */
	public String GetDetailBcertGSYYZZInfo(String paras){
		String result = "";
		return result;
	}
	
	/**
	 * 2.9电子证照-结婚证
	 * 根据证照检索字段获取证照详细信息（只能查看发布字段）
	 * @param paras 参数为json格式的字符串{"paras":{"IDNUMBER":"具体身份证号"}}
	 * @return
	 */
	public String GetDetailBcertJHZ(String paras){
		String result = "";
		return result;
	}
}
