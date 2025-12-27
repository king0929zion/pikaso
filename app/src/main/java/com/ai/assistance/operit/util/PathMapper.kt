package com.ai.assistance.operit.util

import android.content.Context

/**
 * 路径映射工具类
 * 用于处理不同环境下的文件路径转换
 */
object PathMapper {

    /**
     * 判断是否为Linux环境
     *
     * @param environment 环境参数值
     * @return 如果是Linux环境返回true，否则返回false
     */
    fun isLinuxEnvironment(environment: String?): Boolean {
        return environment?.lowercase() == "linux"
    }

    /**
     * 根据environment参数转换路径
     *
     * @param context Android上下文
     * @param path 原始路径
     * @param environment 环境参数（"android" 或 "linux"）
     * @return 转换后的实际路径
     */
    fun resolvePath(context: Context, path: String, environment: String?): String {
        // Linux环境支持已移除，直接返回原始路径
        return path
    }
}

