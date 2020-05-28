package second

def a = new BigDecimal(2)
def b = new BigDecimal("2")

println System.identityHashCode(a).equals(System.identityHashCode(b))

println a == b
println a.equals(b)
println a.compareTo(b) == 0

print a.add(b)
print " and "
println a + b

print a.subtract(b)
print " and "
println a - b

print a.multiply(b)
print " and "
println a * b

print a.divide(b)
print " and "
println a / b