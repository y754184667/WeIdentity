/*
 *       Copyright© (2018-2020) WeBank Co., Ltd.
 *
 *       This file is part of weid-java-sdk.
 *
 *       weid-java-sdk is free software: you can redistribute it and/or modify
 *       it under the terms of the GNU Lesser General Public License as published by
 *       the Free Software Foundation, either version 3 of the License, or
 *       (at your option) any later version.
 *
 *       weid-java-sdk is distributed in the hope that it will be useful,
 *       but WITHOUT ANY WARRANTY; without even the implied warranty of
 *       MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *       GNU Lesser General Public License for more details.
 *
 *       You should have received a copy of the GNU Lesser General Public License
 *       along with weid-java-sdk.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.webank.weid.suite.transmission;

import com.webank.weid.protocol.response.ResponseData;

/**
 * 传输处理服务接口.
 * 
 * @author yanggang
 *
 * @param <T> 服务响应数据类型
 */
public interface TransmissionService<T> {

    /**
     * 服务请求接口.
     * 
     * @param message 请求参数
     * @return 返回响应结果
     */
    ResponseData<T> service(String message);
}
