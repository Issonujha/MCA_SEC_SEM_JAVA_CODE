package file;
import java.io.*;
public class FileIO {
	public static void print(String s) {
		System.out.println(s);
	}
	
	public static void analyze(String s) {
		File f = new File("c:\\");
		if(f.exists()) {
			print(f.getName()+ " is a file");
			print(f.canRead()?" is readable":" is not readable");
			print(f.canWrite()?" is writable":" is not writable");
			print("File Size: " + f.length() + " bytes");
			print("File last Modified: "+f.lastModified());
		}
		else {
			System.out.println("Error");
		}
		if(f.isDirectory()) {
			print(f.getName()+ " is Directory");
			print("List of files");
			String dir[] = f.list();
			for(int i = 0; i<dir.length; i++) {
				print(dir[i]);
			}
		}
	}
	public static void main(String[] args) throws IOException {
		FileIO fd = new FileIO();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the file name: ");
		String s = br.readLine();
		fd.analyze(s);
		
	}

}
