package cn.bh.LeetCode;

public class CompareVersionNumbers {
	//只能处理一个点
	public int compareVersion_0(String version1, String version2) {
        if(Float.parseFloat(version1) > Float.parseFloat(version2))
        	return 1;
        else if(Float.parseFloat(version1) < Float.parseFloat(version2))
        	return -1;
        return 0;
    }
	public static int compareVersion_1(String version1, String version2) {
       String[] v1 = version1.split("\\.");
       String[] v2 = version2.split("\\.");
       int i = 0;
       while(i < v1.length && i < v2.length){
    	   if(Integer.parseInt(v1[i]) > Integer.parseInt(v2[i]))
    		   	return 1;
    	   else if(Integer.parseInt(v1[i]) < Integer.parseInt(v2[i]))
    	   		return -1;
    	   i++;
       }
       if(i == v1.length && i < v2.length){
    	   while(i < v2.length){
    		   if(Integer.parseInt(v2[i]) > 0)
    				   return -1;
    		   i++;
    	   }
       }
       if(i == v2.length && i < v1.length){
    	   while(i < v1.length){
    		   if(Integer.parseInt(v1[i]) > 0)
    				   return -1;
    		   i++;
    	   }
       }
       return 0;
       
    }
	public static int compareVersion(String version1, String version2) {
        int i, j;
        i = j = 0;
		while(i < version1.length() && j < version2.length()){
			int k = 0;
			char[] temp = new char[10];
			while(i < version1.length() && version1.indexOf(i) != '.'){
				temp[k] = (char) version1.indexOf(i);
				i++;
				k++;
			}
			int v1 = Integer.parseInt(new String(temp));
			
			k = 0;
			while(j < version2.length() && version2.indexOf(j) != '.'){
				temp[k] = (char) version1.indexOf(j);
				j++;
				k++;
			}
			int v2 = Integer.parseInt(new String(temp));
			if(v1 > v2) 
				return 1;
			else if(v1 < v2) 		
				return -1;
			i++;
			j++;
		}
		
        return 0;
    }
	public static void main(String args[]){
		compareVersion_1("1.1.1", "2.1.3");
	}
}
