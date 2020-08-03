import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPasswordHere = false;
        String pass = "";
        String str = scanner.nextLine().split("html")[1].replace("?", "");
        String[] arr = str.split("&");
        for(int i = 0; i < arr.length; i++ ) {
            String[] item = arr[i].split("=");
            if (item[0].equals("pass")) {
                isPasswordHere = true;
                pass = item[1];
            }
            String tmp = (item.length > 1) ? item[1] : "not found";
            System.out.println(item[0] + " : " + tmp);
        }
        if (isPasswordHere) {
            System.out.println("password : " + pass);
        }
    }
}