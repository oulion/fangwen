package client;


import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class CxfClientTest {
	
	public static void main(String[] args) {
		JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
        Client client = factory.createClient("http://localhost:8080/cxf/bCertService?WSDL");
        Object[] objs;
		try {
			//身份证
			/*objs = client.invoke("GetDetailBcertSfzInfo", "{\"paras\":{\"IDNUMBER\":\"131127199103050030\"}}");
			System.out.println("2.1电子证照-身份证:\n" + objs[0]);
			//户口本
			objs = client.invoke("GetDetailBcertHkbInfo", "{\"paras\":{\"IDNUMBER\":\"131127199108090046\"}}");
			System.out.println("2.2电子证照-户口本:\n" + objs[0]);
			//60老年证
*/			objs = client.invoke("GetDetailBcert60LNZInfo", "{\"paras\":{\"IDNUMBER\":\"130103195601020314\"}}");
			System.out.println("2.3电子证照-60岁老年证:\n" + objs[0]);
			/*//70老年证
			objs = client.invoke("GetDetailBcert70LNZInfo", "{\"paras\":{\"IDNUMBER\":\"130103194505050323\"}}");
			System.out.println("2.4电子证照-70岁老年证:\n" + objs[0]);
			//二孩生育服务证
			objs = client.invoke("GetDetailBcertEHSYFWZInfo", "{\"paras\":{\"WOMAN_IDNUMBER\":\"130627199307053333\",\"MAN_IDNUMBER\":\"130627199307053332\"}}");
			System.out.println("2.5电子证照-二孩生育服务:\n" + objs[0]);
			//流动人口婚育证明
			objs = client.invoke("GetDetailBcertLDRKHYZMInfo", "{\"paras\":{\"IDNUMBER\":\"130633199009099911\"}}");
			System.out.println("2.6电子证照-流动人口婚育证明:\n" + objs[0]);
			//一孩生育服务证
			objs = client.invoke("GetDetailBcertYHSYFWZInfo", "{\"paras\":{\"WOMAN_IDNUMBER\":\"138489199302153450\",\"MAN_IDNUMBER\":\"138489199302153455\"}}");
			System.out.println("2.7电子证照-一孩生育服务证:\n" + objs[0]);
			//工商营业执照
			objs = client.invoke("GetDetailBcertGSYYZZInfo", "{\"paras\":{\"EnterpriseName\":\"福建\"}}");
			System.out.println("2.8电子证照-工商营业执照:\n" + objs[0]);
			//结婚证
			objs = client.invoke("GetDetailBcertJHZ", "{\"paras\":{\"IDNUMBER\":\"130132199201054419\"}}");
			System.out.println("2.9电子证照-结婚证:\n" + objs[0]);*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
