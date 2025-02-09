package com.ashin.newsinshort.data.entity

data class NewsResponse(
    val status:String?=null,
    val totalResults:Int?=null,
    val articles:List<Article>?=null
)
data class Article(
    val author:String?=null,
    val content:String?=null,
    val description:String?=null,
    val publishedAt:String?=null,
    val title:String?=null,
    val url:String?=null,
    val urlToImage:String?=null,
    val source:Source?=null
)
data class Source(
    val id:String?=null,
    val name:String?=null
)