package com.example.flames

class flamesResult {
    fun result(n1:String,n2:String):Char{
        var name1 = n1
        var name2 = n2
        var total = name1.length + name2.length
        var canc = 0
        for(i in 0..name1.length-1){
            for(j in 0..name2.length-1){
                if(name1[i]==name2[j]){
                    ++canc
                    name2 = name2.substring(0,j)+name2.substring(j+1,name2.length)
                    break
                }
            }
        }
        var x = total-(canc*2)
        var flames = "FLAMES"
        var resu = '0'
        while(flames.length!=1){
            var y = x%flames.length
            var temp: String
            if(y!=0){
                temp = flames.substring(y)+flames.substring(0,y-1)
            }
            else{
                temp = flames.substring(0,flames.length-1)
            }
            flames=temp
            resu = flames[0]
        }
        return resu
    }
}