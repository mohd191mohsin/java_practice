import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Desktop Assistant Started");
        while(true){
            System.out.println("Enter a command:");
            String command = scanner.nextLine()
                                    .trim()
                                    .toLowerCase();
            if(command.equalsIgnoreCase("exit")){
                System.out.println("Application Closed");
                break;
            }
            if(command.equals("open notepad")){
                openNotepad();
            }else if(command.equals("open calc")){
                openCalc();
            }else if (command.equals("open chrome")) {
                openChrome();
            }else if (command.equals("open vscode")) {
                openVSCode();
            }else{
                System.out.println("Unknown Command");
            }
            System.out.println("You Entered: " + command);
        }
        scanner.close();
    }
    public static void openNotepad(){
        try{
            ProcessBuilder builder = new ProcessBuilder("notepad.exe");
            builder.start();
            System.out.println("Notepad Opened");
        }catch(IOException e){
            System.out.println("Failed to Open Notepad");
        }
    }
    public static void openCalc(){
        try{
            ProcessBuilder builder = new ProcessBuilder("calc.exe");
            builder.start();
            System.out.println("Calculator Opened");
        }catch(IOException e){
            System.out.println("Failed to Open Calculator");
        }
    }
    public static void openChrome() {
        try {

            ProcessBuilder builder =
                    new ProcessBuilder(
                        "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"
                    );

            builder.start();

            System.out.println("Chrome Opened");

        } catch (IOException e) {

            System.out.println("Failed to Open Chrome");
        }
    }
    public static void openVSCode() {

        try {

            ProcessBuilder builder =
                    new ProcessBuilder(
                        "C:\\Users\\mohd1\\AppData\\Local\\Programs\\Microsoft VS Code\\Code.exe"
                    );

            builder.start();

            System.out.println("VS Code Opened");

        } catch (IOException e) {

            System.out.println("Failed to Open VS Code");
        }
    }
}