//change depends on package
package com.amazon.puma.utils;

import java.io.FileWriter;
import java.io.IOException;

public class YueDebugWriter {

	private FileWriter debugFileWriter;

	public YueDebugWriter(String fileName) {
		try {
			this.debugFileWriter = new FileWriter(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeToFile(String content) {
		writeToFile(null, content);
	}

	public void writeToFile(String prefix, String content) {
		try {
			this.debugFileWriter.write(prefix + ": " + content + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void closeFileWriter() {
		try{
			this.debugFileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
