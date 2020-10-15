package com.ekalife.utils;

import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.activation.MimetypesFileTypeMap;
import org.w3c.dom.Node;


/**
 * Class berisi fungsi-fungsi umum, seperti generate menu, generate xml
 * 
 * @author Yusuf
 * @since 01/11/2005
 */
public class Common implements Serializable {
	public static ArrayList serializableList(List dataList){
		if(dataList!=null){
			return new ArrayList(dataList);
		}else{
			return null;
		}
	}
	
	public static HashMap serializableMap(Map dataMap){
		if(dataMap!=null){
			return new HashMap(dataMap);
		}else{
			return null;
		}
	}
	
}
