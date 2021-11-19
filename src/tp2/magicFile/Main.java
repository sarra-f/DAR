package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Main {


        public static void main(String[] args) {
            System.out.println("Give me your file name :)"); //try isi as an input ;)
            Scanner scanner = new Scanner(System.in);
            String fileName = scanner.nextLine();
            printFileContent(fileName);
        }

        //Here you have 2 methods
        // getFileContent aims to get the content of a file
        // printFileContent that prints it s content otherwise print 'file not found :/'
        // todo : implement the methods and force exception handling in the printFile method

        private static String getFileContent(String fileName) {
            try {
                File file = new File("src/tp2/magicFile/" + fileName);
                //the lines below help you to get the content
              Scanner reader = new Scanner(file);
              String content = reader.nextLine();
              return content;
            }
            catch(FileNotFoundException e){
                System.out.println("file is not found");
            }
            catch(NoSuchElementException e){
                System.out.println("File is empty");
            }
        return null;
        }

        private static void printFileContent(String fileName) {
            try {
                String data = getFileContent(fileName);
                System.out.println(data);
            } catch(Exception e){
                System.out.println(e);
            }
        }
    }

