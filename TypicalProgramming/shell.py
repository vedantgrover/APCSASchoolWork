import basic

keep_going = True
while keep_going:
    text = input('Typical ::> ')
    if text.strip() == "": continue
    if "quit" in text.lower() or "exit" in text.lower(): keep_going = False
    result, error = basic.run('<stdin>', text)

    if error: print(error.as_string())
    elif result:
        if len(result.elements) == 1:
            print(repr(result.elements[0]))
        else:
            print(repr(result))