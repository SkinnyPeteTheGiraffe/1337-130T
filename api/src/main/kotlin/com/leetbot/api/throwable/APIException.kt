package com.leetbot.api.throwable

/**
 * ${FILE_NAME}
 *
 * @author Notorious
 * @since 2/19/2018
 * @version 1.0.0
 */
class APIException(input: String, throwable: Throwable): Exception(input, throwable)