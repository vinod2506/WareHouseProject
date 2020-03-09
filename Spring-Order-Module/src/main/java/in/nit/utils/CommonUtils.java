package in.nit.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CommonUtils {

	public static Map<Integer,String> convert(List<Object[]> list){
		Map<Integer,String> uomMap=new HashMap<Integer,String>();
		for(Object[]arr:list) {
			uomMap.put(Integer.valueOf(arr[0].toString()), arr[1].toString());
		}
		return uomMap;
	}
	
	public static Map<Integer,String> convertOdr(List<Object[]> list){
		Map<Integer,String>listMap=new HashMap<>();
		for(Object[]arr:list) {
			listMap.put(Integer.valueOf(arr[0].toString()), arr[1].toString());
		}
		return listMap;
	}
	

}
