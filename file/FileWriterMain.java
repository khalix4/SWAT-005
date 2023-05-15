package UI.file;

import java.io.*;
import java.util.Scanner;

public class FileWriterMain {
    public static void Main(String[] args){
        FileWriterMain filesystem = new FileWriterMain();
        filesystem.writeData("hello world");

    }




        public void writeData(String data){
            try {
                File myFile = new File("test.txt");
                FileWriter writeTofile = new FileWriter( myFile);
                writeTofile.write(data);

                writeTofile.flush();
            }
            catch(IOException ioException){
            }


        }
        public void readFromFile(String data){
            try{
                File myFile = new File("test.txt");
                Scanner myReader = new Scanner(myFile);
                while (myReader. hasNext()){
                    String dataInFile = myReader.nextLine();
                    System.out.print(dataInFile);

                }

            }
            catch(FileNotFoundException filenotfoundexception){
                System.out.println("file does not exist");
            }
        }
        public void appendFile(){
            try{
                File myFile = new File("test.txt");
                FileWriter fileWriter = new FileWriter(myFile);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter printWriter = new PrintWriter(bufferedWriter);

             //   printWriter.print(data);
                printWriter.println("No money more problems ");
                printWriter.println("more money");

                printWriter.close();
                bufferedWriter.close();
                fileWriter.close();
            }
            catch (IOException ioException){
                System.out.println("cannot write to this file ");
            }
        }

    }





