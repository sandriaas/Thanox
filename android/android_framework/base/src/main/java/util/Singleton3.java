/*
 * Copyright (C) 2010 The Android Open Source Project
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

package util;

/**
 * Singleton helper class for lazily initialization.
 * <p>
 * Modeled after frameworks/base/include/utils/Singleton.h
 */
public abstract class Singleton3<P1, P2, T> {
    private T mInstance;

    protected abstract T create(P1 p1, P2 p2);

    public final T get(P1 p1, P2 p2) {
        synchronized (this) {
            if (mInstance == null) {
                mInstance = create(p1, p2);
            }
            return mInstance;
        }
    }
}
