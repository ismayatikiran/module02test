package javainputoutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public void dReader() throws IOException {

		String filepath = "C:\\BATCH-OF-2020\\Javatest2020\\module02test\\src\\main\\resources\\Key-To-Success";
		FileReader fileReader = new FileReader(filepath);

		int reading;
		while ((reading = fileReader.read())!=-1){
			System.out.print((char)reading);}
	}



	public static void main(String[] args) throws IOException {

		/**
		 * Use API to read the below textFile and print to console.
		 * /src/main/resources/Key-To-Success
		 * Use FileReader class, no need to store in buffer
		 * Use try....catch block to handle Exception.
		 * Use ForEach loop/while loop/Iterator to retrieve data.
		 */
		DataReader dataReader = new DataReader();
		dataReader.dReader();

		}

	}


