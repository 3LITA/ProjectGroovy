package second

import groovy.time.TimeCategory

Date date1 = new Date(2015-1900, 1, 28)
Date date2 = new Date(2015-1900, 0, 31)

println date1
println date2

println date1 - date2

use(TimeCategory){
    println date1 - 1.month + 1.day + 1.month
}