import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class FileOpDemo {
       
	 public void StoreFile() throws IOException
	 {
		File file=new File("C:\\temp\\textualDemoFile.txt");
		
		FileInputStream fs=null;
		FileOutputStream fout=null;
		
		try {
			//Reading
			
			fs=new FileInputStream(file);
			
			byte[] barr=new  byte[(int)file.length()];
					
			fs.read(barr);
			
			System.out.println("red...");
			
			//writing
			
			fout =new FileOutputStream("D:\\temp\\destFile.txt");
			   fout.write(barr);
			   
				System.out.println("written...");

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
	 }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOpDemo obj=new FileOpDemo();
		obj.StoreFile();
	}

}
