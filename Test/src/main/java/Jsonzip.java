


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.google.gson.Gson;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet("/form")
public class Jsonzip extends HttpServlet{
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException 
{
try {
          res.setContentType("text/html");
          PrintWriter out=res.getWriter();
          
         out.print("Hii");
         String answer= req.getParameter("t1");
 
             // Zip z=new Zip();
              ArrayList filetozip=new ArrayList();

           String oldfilepath="C:\\Users\\Sathish Kumar\\eclipse-workspace_Server\\ApplicationForm\\json\\HiringDetail.json";
          
              Map<String,String> oldjsonfile=readJson(oldfilepath);
              Map<String,String> oldchecksum=findchecksum(oldjsonfile);
       
           String newfilepath="C:\\\\Users\\\\Sathish Kumar\\\\eclipse-workspace_Server\\\\ApplicationForm\\\\json\\\\HiringDetail.json";
                Map<String,String> newjsonfile=readJson(newfilepath);
                Map<String,String> newchecksum=findchecksum(newjsonfile);
                
                for(Map.Entry mapElement :oldjsonfile.entrySet())
                {
                	 if(!newjsonfile.containsKey(mapElement.getKey()))
                	 {
                	        out.println(mapElement.getValue()+"not present in new file");
                	  }
                }
                
                for(Map.Entry mapElement :newjsonfile.entrySet())
                {
                	 if(!oldjsonfile.containsKey(mapElement.getKey())){
                	        filetozip.add(mapElement.getValue());
                	       out.println("zip:"+mapElement.getValue()+" "+mapElement.getKey());
                	       }       
                }
                for(Map.Entry mapElement :newchecksum.entrySet())
                {
                	 if(oldchecksum.containsKey(mapElement.getKey()))
                	 {
                	 if(!(newchecksum.get(mapElement.getKey())).equals(oldchecksum.get(mapElement.getKey()))) 
                	 {
                       filetozip.add((String)newjsonfile.get(mapElement.getKey()));
                       out.println("zip:"+mapElement.getValue()+" "+mapElement.getKey());
                      }
                	 }
                  }
                zip(filetozip);
                out.print("Hii");
}
catch(Exception e){}
                      
     }      
public static Map<String,String> readJson(String filepath) throws ParseException, IOException
{
	FileReader file=new FileReader(filepath);
	JSONParser jsonP = new JSONParser();
	   Object obj = jsonP.parse(file);
	   JSONObject jobj=(JSONObject)obj;
	        Map<String, String> readfile = new Gson().fromJson(jobj.toString(),Map.class);
	       
	return readfile;
	
}
public static Map<String,String> findchecksum(Map<String,String> jsonfile) throws NoSuchAlgorithmException, IOException
{
	  LinkedHashMap checkSum=new LinkedHashMap();
	  MessageDigest mdigest = MessageDigest.getInstance("MD5");
	  //Checksum cs=new Checksum();
      Iterator itr=jsonfile.entrySet().iterator(); 
      while(itr.hasNext()){ 
          Map.Entry entry=(Map.Entry)itr.next();
         checkSum.put(entry.getKey(),(checksum(mdigest,(String) entry.getValue())));
        
      }
	return checkSum;
}
static String checksum(MessageDigest digest,String file)throws IOException
{
	
	FileInputStream fis = new FileInputStream(file);
    byte[] byteArray = new byte[1024];
	int bytesCount = 0;
   while ((bytesCount = fis.read(byteArray)) != -1)
	{
		digest.update(byteArray, 0, bytesCount);
	};
    fis.close();
    byte[] bytes = digest.digest();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < bytes.length; i++) {
	sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
	}
    return sb.toString();
}
public static void zip(ArrayList<String> s) throws IOException
{
 FileOutputStream fos = new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\patch4_2.zip");
 ZipOutputStream zos = new ZipOutputStream(fos);
  
for(int i=0;i<s.size();i++) {
	 File f=new File(s.get(i));
     FileInputStream fis = new FileInputStream(s.get(i));
    ZipEntry zipEntry = new ZipEntry(f.getName());
    zos.putNextEntry(zipEntry);
        int length;
        while((length = fis.read()) != -1) {
            zos.write((byte)length);
        }
 zos.closeEntry();
 fis.close();
   }
zos.close();
fos.close();
        }
}