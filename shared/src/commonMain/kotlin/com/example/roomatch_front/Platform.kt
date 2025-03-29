package com.example.roomatch_front

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform