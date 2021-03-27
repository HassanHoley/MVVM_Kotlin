package com.toptek.mvvmkotlin.modle

class DataResponse<T> {
    var data :T? = null
    enum class Result{SUCCESS,FAILURE}
    var result = Result.SUCCESS
    var errorMassage :String? = null

}