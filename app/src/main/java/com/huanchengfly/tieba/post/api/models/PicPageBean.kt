package com.huanchengfly.tieba.post.api.models

import com.google.gson.annotations.SerializedName
import com.huanchengfly.tieba.post.models.BaseBean

class PicPageBean : BaseBean() {
    @SerializedName("error_code")
    val errorCode: String = ""
    val forum: ForumBean = ForumBean()

    @SerializedName("pic_amount")
    val picAmount: String = ""

    @SerializedName("pic_list")
    val picList: List<PicBean> = mutableListOf()

    class ForumBean {
        val name: String = ""
        val id: String = ""

    }

    class PicBean {
        @SerializedName("overall_index")
        val overAllIndex: String = ""
        val img: ImgBean = ImgBean()

        @SerializedName("post_id")
        val postId: String = ""

        @SerializedName("user_id")
        val userId: String = ""

        @SerializedName("user_name")
        val userName: String = ""

    }

    class ImgBean {
        val original: ImgInfoBean = ImgInfoBean()
        val medium: ImgInfoBean = ImgInfoBean()
        val screen: ImgInfoBean = ImgInfoBean()

    }

    class ImgInfoBean {
        val id: String = ""
        val width: String = ""
        val height: String = ""
        val size: String = ""
        val format: String = ""

        @SerializedName("waterurl")
        val waterUrl: String = ""

        @SerializedName("big_cdn_src")
        val bigCdnSrc: String = ""
        val url: String = ""

        @SerializedName("original_src")
        val originalSrc: String = ""

    }
}