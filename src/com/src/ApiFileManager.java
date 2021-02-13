package com.src;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.APPEND;

public class ApiFileManager {

    public static void writeToFile(String fileToGet, int output) {
        Path path = Paths.get(fileToGet);
        ArrayList<String> lines = new ArrayList<>();
        lines.add(Integer.toString(output));
        try {
            Files.write(path, lines, StandardOpenOption.CREATE, APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String fileToGet, String output) {
        Path path = Paths.get(fileToGet);
        ArrayList<String> lines = new ArrayList<>();
        lines.add(output);
        try {
            Files.write(path, lines, StandardOpenOption.CREATE, APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int readIntFile(String fileName) {
        java.io.FileInputStream inFile = null;
        int readInt = 0;
        try {
            inFile = new java.io.FileInputStream(fileName);
            Scanner reader = new Scanner(inFile);
            readInt = reader.nextInt();
            //System.out.println(readInt);
            inFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                inFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return readInt;
    }

    public String readStringFile(String fileName, int n) {
        java.io.FileInputStream inFile = null;
        String readString = null;
        try {
            inFile = new java.io.FileInputStream(fileName);
            Scanner reader = new Scanner(inFile);
            readString = reader.nextLine();
            //System.out.println(readString);
            inFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                inFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return readString;
    }
}
