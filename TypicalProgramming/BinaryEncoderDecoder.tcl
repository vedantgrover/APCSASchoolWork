fun encode(num)
    var number = num;
    var result = "";
    var place = 0;
    for int i = 0 to num do if num >= 2^i then var place = i end;
    
    for int i = place to 0 step = -1 do;
        if (number - 2^i) >= 0 then var number = number - 2^i; var result = result + "1" else var result = result + "0";
        end;
    
    return result;

encode(6);