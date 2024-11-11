package com.fsociety.producerkafkams.common.response

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class ResponseBody<T>(
    val data: T,
    val message: String? = null
)