/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.javascriptengine;

import androidx.annotation.IntDef;
import androidx.annotation.RestrictTo;

import org.chromium.android_webview.js_sandbox.common.IJsSandboxIsolateCallback;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef(value = {ExecutionErrorTypes.JS_EVALUATION_ERROR})
@RestrictTo(RestrictTo.Scope.LIBRARY)
@Retention(RetentionPolicy.SOURCE)
public @interface ExecutionErrorTypes {
    int JS_EVALUATION_ERROR = IJsSandboxIsolateCallback.JS_EVALUATION_ERROR;
}
