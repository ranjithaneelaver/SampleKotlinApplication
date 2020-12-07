package com.samplekotlinapplication.Scopefunction

import android.content.Intent
import android.net.Uri
import com.samplekotlinapplication.model.User

fun main() {


    createApplyWrks()


}

fun createApplyWrks(intentdata: String = "hii", intentaction: String = "email") {
//avoid variable name redundancy
    Intent().apply {
        action = intentaction
        data = Uri.parse(intentdata)
    }

    //apply doesnot accept run statement

    val person = User().apply {
        this.name = "testing apply"
        //retun string object not allows
    }

    print(person)

}