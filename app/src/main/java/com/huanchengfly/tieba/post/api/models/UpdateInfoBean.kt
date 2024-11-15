package com.huanchengfly.tieba.post.api.models

import com.google.gson.annotations.SerializedName
import com.huanchengfly.tieba.post.models.BaseBean

class UpdateInfoBean : BaseBean() {
    @SerializedName("gruops")
    val groups: List<GroupInfo> = mutableListOf()
    val supportment: List<SupportmentBean> = mutableListOf()

    class SupportmentBean {
        val id: String = ""
        val title: String = ""
        val subtitle: String = ""

        @SerializedName("expire_time")
        val expireTime: Long = 0
        val icon: IconBean = IconBean()
        val action: ActionBean = ActionBean()

        class IconBean {
            val type = 0
            val id: String = ""
            val url: String = ""

            companion object {
                const val TYPE_RESOURCE = 0
                const val TYPE_IMAGE = 1
            }
        }

        class ActionBean {
            val type = 0
            val url: String = ""

            companion object {
                const val TYPE_LINK = 0
                const val TYPE_IMAGE = 1
            }
        }
    }

    class WebDiskBean {
        val link: String = ""
        val name: String = ""
        val password: String = ""

    }

    inner class GroupInfo {
        val type: String = ""
        val name: String = ""

        @SerializedName("qq_group_key")
        val qGroupKey: String = ""

        @SerializedName("qq_group_number")
        val qGroupNumber: String = ""
        val link: String = ""
        val isEnabled = false

    }
}