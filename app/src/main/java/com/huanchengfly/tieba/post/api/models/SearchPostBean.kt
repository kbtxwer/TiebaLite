package com.huanchengfly.tieba.post.api.models

import com.google.gson.annotations.SerializedName

class SearchPostBean {
    @SerializedName("error_code")
    val errorCode: String = ""

    @SerializedName("error_msg")
    val errorMsg: String = ""
    val page: PageBean = PageBean()

    @SerializedName("post_list")
    val postList: List<ThreadInfoBean> = mutableListOf()

    class PageBean {
        @SerializedName("page_size")
        val pageSize: String = ""
        val offset: String = ""

        @SerializedName("current_page")
        val currentPage: String = ""

        @SerializedName("total_count")
        val totalCount: String = ""

        @SerializedName("total_page")
        val totalPage: String = ""

        @SerializedName("has_more")
        val hasMore: String = ""

        @SerializedName("has_prev")
        val hasPrev: String = ""

    }

    class ThreadInfoBean {
        val tid: String = ""
        val pid: String = ""
        val title: String = ""
        val content: String = ""
        val time: String = ""

        @SerializedName("fname")
        val forumName: String = ""
        val author: AuthorBean = AuthorBean()

    }

    class AuthorBean {
        val name: String = ""

        @SerializedName("name_show")
        val nameShow: String = ""

    }
}