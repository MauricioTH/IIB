package co.com.global.cache;

import com.ibm.broker.plugin.MbException;
import com.ibm.broker.plugin.MbGlobalMap;

public class GlobalCache extends MbGlobalMap
{
	protected GlobalCache() throws MbException 
	{
		super();
	}

	@SuppressWarnings("static-access")
	public static String put(String key, String value, String nameCache)
	{
		try 
		{
			MbGlobalMap globalMap = new GlobalCache();
			return (String)globalMap.getGlobalMap(nameCache).put(key, value);
		} catch (Exception e) 
		{
			return e.getMessage().toString();
		}
		
	}
	
	@SuppressWarnings("static-access")
	public static String get(String key, String nameCache)
	{
		try 
		{
			MbGlobalMap globalMap = new GlobalCache();
			return (String)globalMap.getGlobalMap(nameCache).get(key);
		} catch (Exception e) {
			return e.getMessage().toString();
		}
	}

	@SuppressWarnings("static-access")
	public static String remove(String key, String nameCache) 
	{
		try 
		{
			MbGlobalMap globalMap = new GlobalCache();
			String tmp = (String)globalMap.getGlobalMap(nameCache).remove(key); 
			return tmp;
		} catch (Exception e) 
		{
			return e.getMessage().toString();
		}
	}
}
