package com.huanchengfly.tieba.post.api.models

import android.os.Parcelable
import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName
import com.huanchengfly.tieba.post.api.adapters.PortraitAdapter
import com.huanchengfly.tieba.post.api.adapters.SubPostListAdapter
import com.huanchengfly.tieba.post.models.BaseBean
import kotlinx.android.parcel.Parcelize

class ThreadContentBean : BaseBean() {
    @SerializedName("error_code")
    val errorCode: String = ""

    @SerializedName("error_msg")
    val errorMsg: String = ""

    @SerializedName("post_list")
    val postList: List<PostListItemBean> = mutableListOf()
    val page: PageInfoBean = PageInfoBean()
    val user: UserInfoBean = UserInfoBean()
    val forum: ForumInfoBean = ForumInfoBean()

    @SerializedName("display_forum")
    val displayForum: ForumInfoBean = ForumInfoBean()

    @SerializedName("has_floor")
    val hasFloor: String = ""

    @SerializedName("is_new_url")
    val isNewUrl: String = ""

    @SerializedName("user_list")
    val userList: List<UserInfoBean> = mutableListOf()
    val thread: ThreadBean = ThreadBean()
    val anti: AntiInfoBean = AntiInfoBean()

    class AntiInfoBean {
        val tbs: String = ""
    }

    class ThreadInfoBean {
        @SerializedName("thread_id")
        val threadId: String = ""

        @SerializedName("first_post_id")
        val firstPostId: String = ""

    }

    class AgreeBean {
        @SerializedName("agree_num")
        val agreeNum: String = ""

        @SerializedName("disagree_num")
        val disagreeNum: String = ""

        @SerializedName("diff_agree_num")
        val diffAgreeNum: String = ""

        @SerializedName("has_agree")
        val hasAgree: String = ""

    }

    class ThreadBean {
        val id: String = ""
        val title: String = ""

        @SerializedName("thread_info")
        val threadInfo: ThreadInfoBean = ThreadInfoBean()
        val author: UserInfoBean = UserInfoBean()

        @SerializedName("reply_num")
        val replyNum: String = ""

        @SerializedName("collect_status")
        val collectStatus: String = ""

        @SerializedName("agree_num")
        val agreeNum: String = ""

        @SerializedName("post_id")
        val postId: String = ""

        @SerializedName("thread_id")
        val threadId: String = ""
        val agree: AgreeBean = AgreeBean()

    }

    class UserInfoBean {
        @SerializedName("is_login")
        val isLogin: String = ""
        val id: String = ""
        val name: String = ""

        @SerializedName("name_show")
        val nameShow: String = ""

        @JsonAdapter(PortraitAdapter::class)
        val portrait: String = ""
        val type: String = ""

        @SerializedName("level_id")
        val levelId: String = ""

        @SerializedName("is_like")
        val isLike: String = ""

        @SerializedName("is_manager")
        val isManager: String = ""

    }

    class ForumInfoBean : BaseBean() {
        val id: String = ""
        val name: String = ""

        @SerializedName("is_exists")
        val isExists: String = ""
        val avatar: String = ""

        @SerializedName("first_class")
        val firstClass: String = ""

        @SerializedName("second_class")
        val secondClass: String = ""

        @SerializedName("is_liked")
        val isLiked: String = ""

        @SerializedName("is_brand_forum")
        val isBrandForum: String = ""

    }

    class PageInfoBean {
        val offset: String = ""

        @SerializedName("current_page")
        val currentPage: String = ""

        @SerializedName("total_page")
        val totalPage: String = ""

        @SerializedName("has_more")
        val hasMore: String = ""

        @SerializedName("has_prev")
        val hasPrev: String = ""

    }

    @Parcelize
    class PostListItemBean: Parcelable {
        val id: String = ""
        val title: String = ""
        val floor: String = ""
        val time: String = ""
        val content: List<ContentBean> = mutableListOf()

        @SerializedName("author_id")
        val authorId: String = ""
        val author: UserInfoBean = UserInfoBean()

        @SerializedName("sub_post_number")
        val subPostNumber: String = ""

        @SerializedName("sub_post_list")
        @JsonAdapter(SubPostListAdapter::class)
        val subPostList: SubPostListBean = SubPostListBean()

    }

    class SubPostListBean {
        val pid: String = ""

        @SerializedName("sub_post_list")
        val subPostList: List<PostListItemBean> = mutableListOf()

    }

    class ContentBean {
        val type: String = ""
        var text: String = ""
            private set
        val link: String = ""
        val src: String = ""
        val uid: String = ""

        @SerializedName("origin_src")
        val originSrc: String = ""

        @SerializedName("cdn_src")
        val cdnSrc: String = ""

        @SerializedName("cdn_src_active")
        val cdnSrcActive: String = ""

        @SerializedName("big_cdn_src")
        val bigCdnSrc: String = ""

        @SerializedName("during_time")
        val duringTime: String = ""
        val bsize: String = ""
        val c: String = ""
        val width: String = ""
        val height: String = ""

        @SerializedName("is_long_pic")
        val isLongPic: String = ""

        @SerializedName("voice_md5")
        val voiceMD5: String = ""

        fun setText(text: String): ContentBean {
            this.text = text
            return this
        }

    }
}