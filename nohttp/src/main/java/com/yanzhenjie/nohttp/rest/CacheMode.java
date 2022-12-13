/*
 * Copyright 2015 Yan Zhenjie
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
package com.yanzhenjie.nohttp.rest;

/**
 * <p>
 * NoHttp caching pattern, the default value is {@link CacheMode#DEFAULT}, other value may be
 * {@link CacheMode#REQUEST_NETWORK_FAILED_READ_CACHE}, {@link CacheMode#ONLY_READ_CACHE},
 * {@link CacheMode#ONLY_REQUEST_NETWORK}, {@link CacheMode#NONE_CACHE_REQUEST_NETWORK}.
 * </p>
 * Created in 2016/3/20 23:17.
 *
 * @author Yan Zhenjie.
 */
public enum CacheMode {

    /**
     * The default mode, according to the standard HTTP protocol cache, such as response header is 304.
     */
    DEFAULT,//http标准协议的缓存

    /**
     * If the handle is successful return data server, if the handle is returned failure cache data, if does not
     * cache the data failed.
     */
    REQUEST_NETWORK_FAILED_READ_CACHE,//请求失败返回上次缓存的数据

    /**
     * If there is no cache handle, it returns the cache cache exists.
     */
    NONE_CACHE_REQUEST_NETWORK,//在没有缓存再去请求网络

    /**
     * If the cache exists, the handle is successful, other wise is failed.
     */
    ONLY_READ_CACHE,//仅仅请求缓存，如果没有缓存就会请求失败

    /**
     * Just handle to the server, can't read cache anyway, also won't add cache related to head to the handle.
     */
    ONLY_REQUEST_NETWORK//仅仅请求网络不支持302重定向
}