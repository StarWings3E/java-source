package pack5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Ex42Filelibrary {

	public static void main(String[] args) {
		try {
			File f = new File("c:/wrk/전국도서관.csv");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String ss = br.readLine();
			//System.out.println(ss);
			int count = 0;
			
			while (true) {
				count++;
				if(ss == null || count >= 20) break;
				StringTokenizer tok = new StringTokenizer(ss, ",");
				String s1 = tok.nextToken();
				String s2 = tok.nextToken();
				String s3 = tok.nextToken();
				String s4 = tok.nextToken();
				String s5 = tok.nextToken();
				
				System.out.println(s1 + " " + s2 + " " + s3 + " " + s4 + " " + s5);
				ss = br.readLine();
				
			}
			System.out.println("건수: " + count);
			br.close();
			fr.close();
			
			
		} catch (Exception e) {
			System.out.println("err: " + e);
		}

	}

}
