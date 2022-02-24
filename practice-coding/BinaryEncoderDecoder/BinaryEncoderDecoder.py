from tokenize import Number


def encode(num):
    number = int(num);
    result = "";
    place = 0;
    for x in range(number + 1):
        if number >= (2 ** x):
            place = x;
    
    for x in range(place + 1):
        if number - (2 ** x) >= 0:
            number -= 2 ** x;
            result += str(1);
        else:
            result += str(0);
    
    return result;

def decode(binNum):
    number = 0;
    for x in range(len(binNum)):
        if binNum[x] == "1":
            number += (2 ** (len(binNum) - 1 - x));
        else:
            continue;
    
    return number;


while True:
    userResponse = input("Do you want to encode or decode? You can quit too. >> ");

    if "encode" in userResponse.lower() or userResponse.lower() == "e":
        userNumber = input("Great. Input a number >> ");
        print(encode(userNumber));
    elif "decode" in userResponse.lower() or userResponse.lower() == "d":
        userBinNumber = input("Great. Input your binary code >> ");
        if "1" not in userBinNumber or "0" not in  userBinNumber:
            print("Please input a binary code. Nothing else");
            continue;
        print(decode(userBinNumber));
    elif "quit" in userResponse.lower():
        print("Bye-bye Don't die");
        break;
