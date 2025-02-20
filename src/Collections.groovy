enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}


//Range
def range = Days.SUNDAY..Days.SATURDAY
println ("Size: ${range.size()}")
println("Tem WEDNESDAY? " + range.contains(Days.WEDNESDAY))
println("From element: " + range.from)
println("To element: " + range.to + "\n")

//List
def list = []
for(i=0; i<7;i++){
    list.add(Days.values()[i])
}
println(list)
println(list.size())
list.remove(Days.SATURDAY)
println(list)
list.add(Days.SATURDAY)
println(list)
println(list[3])
print("\n")


//map
def map = [:]
for(int i =0; i<7;i++){
    map[i+1] = Days.values()[i];
}
println(map)
println(map.getClass().getName());
println(map.size())
println(map.values())

