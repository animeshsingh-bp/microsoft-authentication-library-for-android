//  Copyright (c) Microsoft Corporation.
//  All rights reserved.
//
//  This code is licensed under the MIT License.
//
//  Permission is hereby granted, free of charge, to any person obtaining a copy
//  of this software and associated documentation files(the "Software"), to deal
//  in the Software without restriction, including without limitation the rights
//  to use, copy, modify, merge, publish, distribute, sublicense, and / or sell
//  copies of the Software, and to permit persons to whom the Software is
//  furnished to do so, subject to the following conditions :
//
//  The above copyright notice and this permission notice shall be included in
//  all copies or substantial portions of the Software.
//
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
//  THE SOFTWARE.
package com.microsoft.identity.nativeauth

import com.microsoft.identity.common.java.nativeauth.providers.responses.UserAttributeOptionsApiResult
import com.microsoft.identity.common.java.nativeauth.util.ILoggable

/**
 * RequiredUserAttributeOptions contains the regular expression that the attribute value must match.
 */
data class RequiredUserAttributeOptions(
    val regex: String?
) : ILoggable {
    override fun toUnsanitizedString(): String = "RequiredUserAttributeOptions(regex=$regex)"

    override fun toString(): String = toUnsanitizedString()
}

internal fun List<UserAttributeOptionsApiResult>.toListOfRequiredUserAttributeOptions(): List<RequiredUserAttributeOptions> {
    return this.map { it.toListOfRequiredUserAttributeOptions() }
}

fun UserAttributeOptionsApiResult.toListOfRequiredUserAttributeOptions(): RequiredUserAttributeOptions {
    return RequiredUserAttributeOptions(
        regex = regex
    )
}
