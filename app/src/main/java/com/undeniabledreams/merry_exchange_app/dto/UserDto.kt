package com.undeniabledreams.merry_exchange_app.dto

class UserDto {
    var userName: String = ""
        private set
    var password: String = ""
        private set
    var email: String = ""
        private set

    constructor(email: String, password: String) {
        this.email = email
        this.password = password
    }

    constructor(userName: String, password: String, email: String) {
        this.userName = userName
        this.password = password
        this.email = email
    }
}