package com.khushal.internalexampracticalwithsqlite

data class Fruit(var fr_name:String, var fr_desc:String, var fr_price:Int)
{
    var id:Int=0
    constructor(id:Int,fr_name: String,
                fr_desc: String,fr_price: Int):this(fr_name,fr_desc,fr_price)
    {
                    this.id=id
    }
}