import groovy.lang.Closure
import groovy.swing.impl.ClosureRenderer

enum Week {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
def list = [1,2,3,4,5,6,7,8,9]
def map = [:]
for(int i =0; i<7;i++){
    map[i+1] = Week.values()[i];
}
def closure = {
    println("AAAAAAAAAA")
}

def method(Closure clos){
    clos();
    println("BBBBBBB")
}

method(closure)

list.each {it ->
    println(it)
}

map.each { index, value ->
    println("$index: $value")
}

def pacient = { String name, String hospital, int age ->
    println("Paciente $name do hospital $hospital tem $age anos!!")
}

pacient("Tiago", "MATERDEI", 21)
def pacientCurry = pacient.ncurry(1, "MATERDEI")
pacientCurry("Ulisses", 22)
pacientCurry("Livia",23)





