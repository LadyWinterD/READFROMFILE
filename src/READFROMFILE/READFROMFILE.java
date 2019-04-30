package READFROMFILE;

import java.io.File;

public class READFROMFILE {

	public static void FingTheFile(String path) {

		int fileNum = 0, folderNum = 0;

		File file = new File(path);

		if (file.exists()) {
			File[] files = file.listFiles();
			if (files.length == 0) {
				System.out.println("the file is empty!"); // this is no file
															// return and print
				return;
			} else {
				for (File file2 : files) {

					if (file2.isDirectory()) {
						System.out.println("file is:" + file2.getPath()); // find
																			// the
																			// file
																			// and
																			// print
																			// the
																			// path
						FingTheFile(file2.getPath());
					} else {
						System.out.println("file is:" + file.getPath());
					}
				}
			}
		//} else {
			//System.out.println("no file!");
		}
	}

	public static void main(String[] args) {
		READFROMFILE.FingTheFile("E:\\WIN7");
	}
}
