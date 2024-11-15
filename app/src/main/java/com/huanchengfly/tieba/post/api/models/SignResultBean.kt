package com.huanchengfly.tieba.post.api.models

import com.google.gson.annotations.SerializedName
import com.huanchengfly.tieba.post.models.BaseBean
import com.huanchengfly.tieba.post.utils.GsonUtil

class SignResultBean : BaseBean() {
    @SerializedName("user_info")
    val userInfo: UserInfo = UserInfo()

    @SerializedName("error_code")
    val errorCode: String = ""

    fun getErrorCode() = Integer.valueOf(errorCode!!)

    @SerializedName("error_msg")
    val errorMsg: String = ""
    val time: Long = 0

    override fun toString(): String {
        return GsonUtil.getGson().toJson(this)
    }

    inner class UserInfo : BaseBean() {
        @SerializedName("user_id")
        val userId: String = ""

        @SerializedName("is_sign_in")
        val isSignIn: String = ""

        @SerializedName("user_sign_rank")
        val userSignRank: String = ""

        @SerializedName("sign_time")
        val signTime: String = ""

        @SerializedName("sign_bonus_point")
        val signBonusPoint: String = ""

        @SerializedName("level_name")
        val levelName: String = ""

        @SerializedName("levelup_score")
        val levelUpScore: String = ""

    }
}