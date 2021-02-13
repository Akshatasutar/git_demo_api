package com.src;

public class Main {

    public static void main(String[] args) {
        ApiFileManager newManager = new ApiFileManager();
        int outputs[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,45,23,44,55,66,77,2,879,100};
        /*for (int output: outputs) {
            newManager.writeToFile("Outputs",output);
        }
        */
        newManager.writeToFile("Outputs", "TEST");
        newManager.writeToFile("Outputs", "Working!");
        newManager.readIntFile("Outputs");
    }
}
