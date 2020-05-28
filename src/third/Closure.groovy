package third

def div = { a, b -> return a / b }
def sub = { a, b -> return a - b }

def divSub = { a, b, c -> return sub.call(div.call(a, b), c)}

println divSub.call(6, 3, 2)

