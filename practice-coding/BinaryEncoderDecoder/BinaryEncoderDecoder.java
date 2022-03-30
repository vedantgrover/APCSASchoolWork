package BinaryEncoderDecoder;

import java.util.Scanner;

public class BinaryEncoderDecoder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Do you want to encode or decode? You can quit too. >> ");
            String userResponse = sc.nextLine();

            if (userResponse.toLowerCase().contains("encode") || userResponse.toLowerCase().equals("e")) {
                System.out.print("Great. Input a number >> ");
                int userNumber = sc.nextInt();
                encodeRec(userNumber);
                System.out.println();
                //System.out.println(encode(userNumber));
            } else if (userResponse.toLowerCase().contains("decode") || userResponse.toLowerCase().equals("d")) {
                System.out.print("Great. Input your binary code >> ");
                String userBinNumber = sc.nextLine();
                if (!(userBinNumber.contains("1") || userBinNumber.contains("0"))) {
                    System.out.println("Please input a binary code. Nothing else.");
                    continue;
                }
                System.out.println(decode(userBinNumber));
            } else if (userResponse.toLowerCase().contains("quit")) {
                System.out.println("Bye-bye Don't die");
                break;
            }
        }

        sc.close();
    }

    public static String encode(int num) {
        int number = num;
        String result = "";
        int place = 0;
        for (int i = 0; i <= num; i++) {
            if (num >= Math.pow(2, i)) {
                place = i;
            }
        }

        for (int i = place; i >= 0; i--) {
            if (number - Math.pow(2, i) >= 0) {
                number -= Math.pow(2, i);
                result += "1";
            } else {
                result += "0";
            }
        }

        // System.out.println(place);
        return result;

    }

    public static void encodeRec(int num) {
        if (num < 2) {
            System.out.print(num);
        } else {
            encodeRec(num/2);
            System.out.print(num%2);
        }
    }

    public static int decode(String binNum) {
        int number = 0;
        for (int i = 0; i < binNum.length(); i++) {
            if (binNum.charAt(i) == '1') {
                number += Math.pow(2, binNum.length() - 1 - i);
            } else {
                continue;
            }
        }

        return number;
    }
}