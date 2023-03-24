package com.example.flames

class removeSpace {
    fun remove(n:String):String{
        var name = ""
        for(i in n){
            if(i!=' '){
                name+=i
            }
        }
        return name
    }
}